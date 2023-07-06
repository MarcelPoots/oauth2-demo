package com.example.oauth2demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "Hello World!";
    }

    @GetMapping("/private")
    public String privateArea() {
        return "Private area";
    }
}
