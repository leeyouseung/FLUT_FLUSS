package com.example.flut_fluss.model;

import com.example.flut_fluss.manager.Token;

public class Login {

    private Token token;

    private Token refreshToken;

    private User info;

    public Token getToken() {

        return token;
    }

    public void setToken(Token token) {

        this.token = token;
    }

    public Token getRefreshToken() {

        return refreshToken;
    }

    public void setRefreshToken(Token refreshToken) {

        this.refreshToken = refreshToken;
    }

    public User getInfo() {

        return info;
    }

    public void setInfo(User info) {

        this.info = info;
    }
}
