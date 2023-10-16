package dio.spring.security.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @GetMapping
    public String welcome() {
        return "Welcome to the My Spring Boot Web API on Digital Innovation One!";
    }

    //@PreAuthorize("hasAnyRole('MANAGERS', 'USERS')")
    @GetMapping("/users")
    public String users() {
        return "Authorized user!";
    }

    //@PreAuthorize("hasRole('MANAGERS')")
    @GetMapping("/managers")
    public String managers() {
        return "Authorized manager!";
    }
}
