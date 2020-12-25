package com.example.demo.models;

import java.util.Objects;

public class UserCrypto {
    private String username;
    private int passwordCriptata;


    public UserCrypto(String username, String password){
        this.username = username;
        passwordCriptata = password.hashCode();
    }

    public String getUsername() {
        return username;
    }

    public int getPasswordCriptata() {
        return passwordCriptata;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserCrypto that = (UserCrypto) o;
        return Objects.equals(username, that.username);
    }


    @Override
    public int hashCode() {
        return Objects.hash(username);
    }
}
