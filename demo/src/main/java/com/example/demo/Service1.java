package com.example.demo;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

    @Service
public class Service1 {

    private static int conta = 0;

    @GetMapping("/esercizio3")
    public int var(){
        return conta++;
    }
}
