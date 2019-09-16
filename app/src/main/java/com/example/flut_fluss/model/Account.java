package com.example.flut_fluss.model;

import com.google.gson.annotations.SerializedName;

public class Account {

    @SerializedName("totalMoney")
    private int totalMoney;

    public Account(int totalMoney) {

        this.totalMoney = totalMoney;
    }

    public int getTotalMoney() {

        return totalMoney;
    }

    public void setTotalMoney(int totalMoney) {

        this.totalMoney = totalMoney;
    }
}
