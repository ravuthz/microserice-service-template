package io.microservice.server.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Value("${spring.application.name}")
    private String title;

    @GetMapping
    public String page() {
        return "Welcome to " + title;
    }

}
