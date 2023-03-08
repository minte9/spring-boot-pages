/**
 * Rest Controller service
 * 
 * Use start.spring.io to create a new Spring Web project. 
 * The service will handle GET requests for /greeting and return JSON response. 
 * 
 * Use start.spring.io to create a new Spring Web project.
 */

package com.minte9.enable_https;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

	@GetMapping("/")
    public String welcome() {
        return "Welcome";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }

}