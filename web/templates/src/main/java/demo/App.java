/**
 * SPRING BOOT - MVC APPLICATION (TEMPLATES)
 * -----------------------------------------
 * This is a Spring Boot MVC application that renders HTML pages
 * using templates instead of return raw data.
 * 
 * Spring Boot + MVC:
 * ------------------
 * 	- Spring Boot auto-configures Spring MVC
 *  - A built-in web server (Tomcat) is started automatically
 *  - HTML templates are resolved by convention
 * 
 * Project SETUP:
 * --------------
 * Create the project using:
 * 		https://start.spring.io
 * 
 * Required DEPENDENCIES:
 * ----------------------
 * 	- Spring Web 			= MVC + embeded server
 * 	- Thymealf 				= Template engine for HTML
 * 	- Spring Boot DevTools	= Auto-restart & live reload
 * 
 * CONVENTION over configuration:
 * ------------------------------
 * - Templates are placed in:
 *		src/main/resources/templates
 * 
 * RUN:
 * ----
 * mvn spring-boot:run
 */

package demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}