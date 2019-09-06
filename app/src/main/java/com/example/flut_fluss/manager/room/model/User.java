package com.example.flut_fluss.manager.room.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "user_table")
public class User {

    @PrimaryKey
    private String id;

    private String password;

    private String name;

    private String phoneNumber;

    private String bankAccount;

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