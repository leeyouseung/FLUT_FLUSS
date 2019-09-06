package com.example.flut_fluss.network.request;

import com.google.gson.annotations.SerializedName;

public class SignUpRequest {

//    @SerializedName("userId")
    private String userId;

//    @SerializedName("password")
    private String password;

//    @SerializedName("name")
    private String name;

//    @SerializedName("phoneNumber")
    private String phoneNumber;

//    @SerializedName("bankAccount")
    private String bankAccount;

//    @SerializedName("flutAccount")
    private String flutAccount;

    public SignUpRequest(String userId, String password, String name, String phoneNumber, String bankAccount, String flutAccount) {

        this.userId = userId;
        this.password = password;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.bankAccount = bankAccount;
        this.flutAccount = flutAccount;
    }

    public String getUserId() {

        return userId;
    }

    public void setUserId(String userId) {

        this.userId = userId;
    }

    public String getPassword() {

        return password;
    }

    public void setPasword(String password) {

        this.password = password;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getPhoneNumber() {

        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {

        this.phoneNumber = phoneNumber;
    }

    public String getBankAccount() {

        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {

        this.bankAccount = bankAccount;
    }

    public String getFlutAccount() {

        return flutAccount;
    }

    public void setFlutAccount(String flutAccount) {

        this.flutAccount = flutAccount;
    }
}
