package com.Ilker.keycloak;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/demo")
public class DemoController {

    @GetMapping
    public String hello(){
        return "Hello from Keycloak";
    }

    @GetMapping("/hello")
    @PreAuthorize("hasRole('client_Admin')")
    public String helloAdmin(){
        return "Hello from Keycloak - ADMIN ";
    }
}
