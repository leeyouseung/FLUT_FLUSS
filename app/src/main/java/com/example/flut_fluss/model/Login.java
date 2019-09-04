package com.example.flut_fluss.model;

import com.google.gson.annotations.SerializedName;

public class Login {

    @SerializedName("Token")
    private String token;

    @SerializedName("RefreshToken")
    private String refreshToken;

    @SerializedName("User")
    private User info;

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

    public User getInfo() {

        return info;
    }

    public void setInfo(User info) {

        this.info = info;
    }
}
