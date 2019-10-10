package hello;

import org.springframework.web.bind.annotation.RestController;

import static java.lang.String.format;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import edu.ca.ets.Greeter;

@RestController
public class HelloController {
    
    @RequestMapping("/{name}")
    public String index(@PathVariable String name) {
        return new Greeter().greet(name);
    }
    
}
