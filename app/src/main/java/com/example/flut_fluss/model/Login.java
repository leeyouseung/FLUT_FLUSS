package com.example.flut_fluss.model;

public class Login {

    private Token token;

    private User user;

    public Login(Token token, User user) {

        this.token = token;
        this.user = user;
    }

    public Token getToken() {

        return token;
    }

    public void setToken(Token token) {

        this.token = token;
    }

    public User getUser() {

        return user;
    }

    public void setUser(User user) {

        this.user = user;
    }
}
