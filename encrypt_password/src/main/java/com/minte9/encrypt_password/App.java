/**
 * App.java
 * 
 * REST controller with encrypted DB password 
 * When using a Map of lists, jdbcTemplate automatically return JSON 
 */

package com.minte9.encrypt_password;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Map;

@SpringBootApplication
@RestController
public class App {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public static void main(String[] args) throws Exception {
        SpringApplication.run(App.class, args);
    }

    @GetMapping("/genkeys")
    public String genkeys() throws Exception {

        String key = AES_GCM.createKey(256);
        String iv = AES_GCM.createIv();
        System.out.println(key); 
        System.out.println(iv);
            // AO5uMsQyKeVfwkVF5L6n0SObW80g5JVYUcRv7WAYVow=
            // DnGotRRpb6xlzeu5
        return "Secret keys generated (view console)";
    }

    @GetMapping("/encrypt")
    public String encrypt() throws Exception {

        String plainText = "ThePassword";
        String key = System.getenv("SB_ENCRYPT_PASSWORD_KEY");
        String iv = System.getenv("SB_ENCRYPT_PASSWORD_IV");        
        String encrypted = AES_GCM.encrypt(plainText, key, iv); // Look Here
        System.out.println(encrypted); 
            // FMmsKpM1DizBbpxKuQl5deeA/4k9ryR/S3Gl
        return "Encrypted password generated (view console)";
    }

    @GetMapping("/")  
    public Object users() {
        String sql = "SELECT username FROM users";
        List<Map<String, Object>> data = jdbcTemplate.queryForList(sql);
        return data; 
            // [{"username":"aaa"},{"username":"bbb"}]
    }
}
