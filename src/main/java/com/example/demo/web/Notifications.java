package com.example.demo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Notifications {

    @GetMapping("/notifications")
    public String sayHello() {
        return "Voici les information concernant la banque !";
    }
}
