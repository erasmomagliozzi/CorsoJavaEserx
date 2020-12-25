package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;

    @Service
public class Service {

    private int conta = 0;

    @GetMapping("/esercizio3")
    int var (){
        return conta++;
    }
}
