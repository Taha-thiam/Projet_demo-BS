package com.example.demo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoWeb {

    @GetMapping("/taha")
    public String sayHello() {
        return "Bienvenue Taha !";
    }
}
