package com.example.flut_fluss.model;

import com.google.gson.annotations.SerializedName;

public class Account {

    @SerializedName("totalAccountMoney")
    private int totalAccountMoney;

    public Account(int totalAccountMoney) {

        this.totalAccountMoney = totalAccountMoney;
    }

    public int getTotalAccountMoney() {

        return totalAccountMoney;
    }

    public void setTotalAccountMoney(int totalAccountMoney) {

        this.totalAccountMoney = totalAccountMoney;
    }
}
