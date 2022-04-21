package pl.oremczuk.springsecurityoauthgoogleauthentication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String getHello() {
        return "Hello";
    }

    @GetMapping("/authenticate")
    public String getAuthenticatedMessage() {
        return "This is a message for an authenticated user";
    }


}
