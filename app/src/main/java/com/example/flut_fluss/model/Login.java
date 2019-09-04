package com.example.flut_fluss.model;

import com.google.gson.annotations.SerializedName;

public class Login {

    @SerializedName("Token")
    private Token token;

    @SerializedName("RefreshToken")
    private Token refreshToken;

    @SerializedName("User")
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
