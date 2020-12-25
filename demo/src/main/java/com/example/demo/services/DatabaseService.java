package com.example.demo.services;

import com.example.demo.models.UserCrypto;
import com.example.demo.view.User;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.HashSet;
import java.util.UUID;

@Service
public class DatabaseService {
    private static HashMap<String, UserCrypto> users = new HashMap<>();
    private static HashMap<String, String > loggedUsers = new HashMap<>();

    public void registration(User user){
        UserCrypto newUser = new UserCrypto(user.getUsername(), user.getPassword());
        users.put(newUser.getUsername(), newUser);
    }

    public String login(String username, String password){

       if( users.containsKey(username)){
           if(password.hashCode()== users.get(username).getPasswordCriptata()){
               String cookie = UUID.randomUUID().toString();
               loggedUsers.put(cookie,username);
               return cookie;
           }
           return null;
       }
       return null;
    }
}
