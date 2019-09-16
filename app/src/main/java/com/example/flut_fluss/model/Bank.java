package com.example.flut_fluss.model;

import com.google.gson.annotations.SerializedName;

public class Bank {

    @SerializedName("totalMoney")
    private int totalMoney;

    public Bank(int totalMoney) {

        this.totalMoney = totalMoney;
    }

    public int getTotalMoney() {

        return totalMoney;
    }

    public void setTotalMoney(int totalMoney) {

        this.totalMoney = totalMoney;
    }
}
