/**
 * Consuming REST App
 * 
 * Add mapping (/getquote) from a separate service on 8080 port
 * Use a domain class (Quote) to contain the data that you need.
 * Any property not bound will be ignored.
 * 
 * RestTemplate will use the Jackson JSON library for incomming data.
 * CommandLineRunner will run the RestTemplate on startup.
 */

package com.minte9.democonsumingrest;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) // console run
        throws Exception {
            return args -> {
                Quote quote = restTemplate.getForObject(
                    "http://localhost:8080/api/random", Quote.class
                );
                System.out.println(quote);
            };
    }

    @GetMapping("/getquote")
    public String quote() {
        RestTemplate rt = new RestTemplate(); // browser request
        Quote quote = rt.getForObject(
            "http://localhost:8080/api/random", Quote.class
        );
        return quote.toString();
    }

}
