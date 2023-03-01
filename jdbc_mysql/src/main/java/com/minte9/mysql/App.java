/** 
 * Query a database in Spring Boot without using JPA 
 * or creating a model class.
 * 
 * The jdbcTemplate.queryForList() method is designed to 
 * return a list of rows from the database
 * 
 * By returning the list of maps from the controller method, 
 * Spring will automatically convert it to a JSON object
 * 
 * http://localhost:8080/users
 * [aaa, bbb]
 * 
 * http://localhost:8080/users_json
 * [{"email":"a@a.com","username":"aaa"},{"email":"b@b.com","username":"bbb"}]
 */

package com.minte9.mysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
@RestController
public class App {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @GetMapping("/users_list")
    public String users_list() {
        String sql = "SELECT username FROM users";

        List<String> users = jdbcTemplate.queryForList(sql, String.class);
        return users.toString();
    }

    @GetMapping("/users_json")
    public List<Map<String, Object>> users_json() {
        String sql = "SELECT email, username FROM users";

        List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
        return rows;
    }
}