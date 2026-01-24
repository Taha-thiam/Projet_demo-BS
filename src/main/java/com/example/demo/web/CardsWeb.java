package com.example.demo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardsWeb {

    @GetMapping("/cards")
    public String sayHello() {
        return "Voici les informations concernant votre carte bancaire ";
    }
}
