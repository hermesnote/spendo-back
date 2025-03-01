package com.hermensote.spendobackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyController {

    @GetMapping("/hi")
    public String hi() {
        return "hi";
    }

    @GetMapping("/data")
    public String getData() {
        return "{\"message\": \"Hello, World!!!\"}";
    }
}
