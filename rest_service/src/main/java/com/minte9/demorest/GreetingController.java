/**
 * Resource Controller - GreetingController
 * 
 * HTTP requests are handled by a controller
 * Components are identified by the @RestController annotation.
 */

package com.minte9.demorest;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Greeting greeting(
        @RequestParam(value = "name", defaultValue = "World") String name
    ) {

        Long id = counter.incrementAndGet();
        String content = String.format("Hello %s!", name);

        return new Greeting(id, content);
    }
}