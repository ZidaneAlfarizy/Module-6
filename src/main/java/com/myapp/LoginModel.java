package com.myapp;

public class LoginModel {
    private final String USERNAME = "zidane";
    private final String PASSWORD = "123";

    public boolean authenticate(String username, String password) {
        return username.equals(USERNAME) && password.equals(PASSWORD);
    }
}
