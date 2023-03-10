/**
 * App.java
 * 
 * REST controller with encrypted DB password 
 */

package com.minte9.encrypt_password;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class App {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public static void main(String[] args) throws Exception {
        SpringApplication.run(App.class, args);
    }

    @GetMapping("/encrypt")
    public String encrypt() throws Exception {

        String plainText = "ThePassword";
        String key = "AO5uMsQyKeVfwkVF5L6n0SObW80g5JVYUcRv7WAYVow=";
        String iv = "DnGotRRpb6xlzeu5";
            // key = AES_GCM.createKey(256);
            // iv = AES_GCM.createIv();

        String encrypted = AES_GCM.encrypt(plainText, key, iv); // Look Here
        return encrypted; 
            // FMmsKpM1DizBbpxKuQl5deeA/4k9ryR/S3Gl
    }

    @GetMapping("/")  
    public String users() {
        String sql = "SELECT username FROM users";
        List<String> users = jdbcTemplate.queryForList(sql, String.class);
        return "Users: " + users.toString();
    }
}
