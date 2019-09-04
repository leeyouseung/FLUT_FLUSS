package com.example.flut_fluss.model;

import com.google.gson.annotations.SerializedName;

public class Token {

    @SerializedName("Token")
    private String token;

    @SerializedName("RefreshToken")
    private String refreshToken;

    public Token(String token, String refreshToken) {

        this.token = token;
        this.refreshToken = refreshToken;
    }

    public String getToken() {

        return token;
    }

    public void setToken(String token) {

        this.token = token;
    }

    public String getRefreshToken() {

        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {

        this.refreshToken = refreshToken;
    }
}
