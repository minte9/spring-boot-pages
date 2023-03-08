/**
 * The dataSource() method in the AppConfig class is annotated with @Bean. 
 * Spring will create a bean of type DataSource using the method 
 * and will store it in the application context.
 * 
 * When a component in the application needs to connect to the database, 
 * it simply requests the DataSource from the Spring application context.
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

    @Bean
    public DataSource dataSource () throws Exception {

        String encrypted = env.getProperty("spring.datasource.password");
        String key = "AO5uMsQyKeVfwkVF5L6n0SObW80g5JVYUcRv7WAYVow=";
        String iv = "DnGotRRpb6xlzeu5";
        String decrypted = AES_GCM.decrypt(encrypted, key, iv);  // Look Here

        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl(env.getProperty("spring.datasource.url"));
        dataSource.setUsername(env.getProperty("spring.datasource.username"));
        dataSource.setPassword(decrypted);

        return dataSource;
    }

}
