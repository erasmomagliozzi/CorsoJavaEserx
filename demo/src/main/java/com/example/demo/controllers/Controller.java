package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.Random;

@RestController
public class Controller {
    private int conta = 0;
    @GetMapping("/prova")
    ResponseEntity<Integer> prova() {
        HttpHeaders headers = new HttpHeaders();
        headers.add("chiave", "valore");
        return new ResponseEntity<>(
                new Random().nextInt(), headers,
                HttpStatus.OK);

    }
    @GetMapping("/esercizio2/{nome}")
    String[] nome (@PathVariable("nome") String nomeInput){
        String[] nome2 = new String[2];
        nome2[0] = nomeInput.toUpperCase();
        nome2[1] =  Integer.toString(nomeInput.length());
        return nome2;
    }

    @GetMapping("/esercizio3")
    int var (@Autowired Service1 s){
       return s.var();
    }
}

