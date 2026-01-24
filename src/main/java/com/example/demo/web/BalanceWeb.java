package com.example.demo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BalanceWeb {

    @GetMapping("/balance")
    public String sayHello() {
        return "Voici le solde de votre compte";
    }
}
