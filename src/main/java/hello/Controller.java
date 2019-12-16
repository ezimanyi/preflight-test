package hello;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @PostMapping("/hello")
    public String hello() {
        return "{\"hello\": true}";
    }
}
