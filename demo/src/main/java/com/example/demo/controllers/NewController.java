package com.example.demo.controllers;

import com.example.demo.services.DatabaseService;
import com.example.demo.view.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewController {
    @PostMapping("/registrazione")
    void registrazione(@RequestBody User body, @Autowired DatabaseService databaseService){
        databaseService.registration(body);
    }

}
