/**
 * The GreetingController handle GET requests for /greeting
 * Returns the name of the View responsible to render html content
 */

package com.example.webcontent;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {
    
    /**
     * RequestParam binds the value of GET username
     * into the name parameter of greeting() method
     */
    @GetMapping("/greeting")
    public String greeting(
        @RequestParam(name="username", required=false, defaultValue="guest") 
        String str, Model model) {
        
        model.addAttribute("name", str);
        return "greeting";
    }
}