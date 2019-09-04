package com.example.flut_fluss.model;

import com.google.gson.annotations.SerializedName;

public class User {

    @SerializedName("userId")
    private String id;

    @SerializedName("password")
    private String password;

    @SerializedName("name")
    private String name;

    @SerializedName("phoneNumber")
    private String phoneNumber;

    @SerializedName("bankAccount")
    private String bankAccount;

    @SerializedName("flutAccount")
    private String flutAccount;

    public User() {

    }

    public User(String id, String password, String name, String phoneNumber, String bankAccount, String flutAccount) {

        this.id = id;
        this.password = password;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.bankAccount = bankAccount;
        this.flutAccount = flutAccount;
    }

    public String getId() {

        return id;
    }

    public void setId(String id) {

        this.id = id;
    }

    public String getPassword() {

        return password;
    }

    public void setPassword(String password) {

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