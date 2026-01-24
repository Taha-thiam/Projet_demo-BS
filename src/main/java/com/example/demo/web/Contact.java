package com.example.demo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Contact {

    @PostMapping("/contacts")
    public String sayHello() {
        return "Merci nous envoyer votre demande d'information !";
    }
}
