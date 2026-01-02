/**
 * MVC APP - CONTROLLER
 * --------------------
 * A controlelr handles HTTP requests and return:
 *  - A view name (HTML template)
 *  - OR raw data (if ResponseBody is used)
 * 
 * IMPORTANT:
 * ----------
 *  - Use Controller for templates
 *  - Use RestController for APIs
 *  - Templates do NOT work with RestController
 * 
 * Spring Boot DevTools:
 * ---------------------
 *  - Automatically reloads changes
 *  - No server restart needed
 * 
 * Test URLs:
 * ----------
 *      http://localhost:9090
 *      http://localhost:9090/hello
 *      http://localhost:9090/hello/?username=John
 */

package demo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    /**
     * Returns the homepage template. 
     */
    @GetMapping("/")
    public String home() {
        return "index.html";
    }

    /**
     * Returns raw text instead of a template.
     * This behaves like a REST endpoint.
     */
    @GetMapping("message/")
    @ResponseBody
    public String message() {
        return "My message"; // just String
    }
    
    /**
     * Reads the `username` query parameter
     * and passes it to the template.
     */
    @GetMapping("hello/")
    public String hello(
        @RequestParam(name="username", required=false, defaultValue="guest") 
        String str, 
        Model model
    ) {
        
        model.addAttribute("name", str);
        return "hello"; // .html can be omitted
    }
}