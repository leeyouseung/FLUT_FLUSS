package com.example.flut_fluss.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

@Entity(tableName = "user_table")
public class User {

    @PrimaryKey
    @SerializedName("userId")
    private String id;

    @SerializedName("password")
    private String password;

    @SerializedName("name")
    private String name;

    @SerializedName("bankAccount")
    private String bankAccount;

    @SerializedName("flutAccount")
    private String flutAccount;

    @SerializedName("phoneNumber")
    private String phoneNumber;

    public User(String id, String passoword, String name, String bankAccount, String flutAccount, String phoneNumber) {

        this.id = id;
        this.password = passoword;
        this.name = name;
        this.bankAccount = bankAccount;
        this.flutAccount = flutAccount;
        this.phoneNumber = phoneNumber;
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

    public String getPhoneNumber() {


        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {

        this.phoneNumber = phoneNumber;
    }
}