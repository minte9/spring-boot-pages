/** AppConfig.java
 * 
 * The dataSource() method in the AppConfig class is annotated with @Bean. 
 * Spring will create a bean of type DataSource using the method 
 * and will store it in the application context.
 * 
 * When a component in the application needs to connect to the database, 
 * it simply requests the DataSource from the Spring application context.
 * 
 * Don't keep secrets in play text, use environment variables:
 * 
 * geidt ~/.bashrc
 *   export SB_ENCRYPT_PASSWORD_KEY=mysecretkey
 *   export SB_ENCRYPT_PASSWORD_IV=mysecretiv
 * source ~/.bashrc
 * echo $MYAPP_ENCRYPTION_KEY
 * 
 */
package com.minte9.encrypt_password;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class AppConfig {

    @Autowired
    private Environment env;
    private Boolean ENCRYPT = false;

    private void encrypt_password() throws Exception {

        String plainText = "ThePassword";
        String key = System.getenv("SB_ENCRYPT_PASSWORD_KEY");
        String iv = System.getenv("SB_ENCRYPT_PASSWORD_IV");        
        String encrypted = AES_GCM.encrypt(plainText, key, iv); // Look Here
        System.out.println(encrypted); // FMmsKpM1DizBbpxKuQl5deeA/4k9ryR/S3Gl
    }

    @Bean
    public DataSource dataSource () throws Exception {

        if (ENCRYPT) { encrypt_password(); System.exit(0); }

        String encrypted = env.getProperty("spring.datasource.password");
        String key = System.getenv("SB_ENCRYPT_PASSWORD_KEY");
        String iv = System.getenv("SB_ENCRYPT_PASSWORD_IV");
        String decrypted = AES_GCM.decrypt(encrypted, key, iv);  // Look Here

        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver"); 
                                    // oracle.jdbc.OracleDriver
        dataSource.setUrl(env.getProperty("spring.datasource.url"));
        dataSource.setUsername(env.getProperty("spring.datasource.username"));
        dataSource.setPassword(decrypted);

        return dataSource;
    }

}
