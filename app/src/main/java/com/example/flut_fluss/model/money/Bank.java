package com.example.flut_fluss.model.money;

import com.google.gson.annotations.SerializedName;

public class Bank {

    @SerializedName("totalBankMoney")
    private int totalBankMoney;

    public Bank(int totalBankMoney) {

        this.totalBankMoney = totalBankMoney;
    }

    public int getTotalBankMoney() {

        return totalBankMoney;
    }

    public void setTotalBankMoney(int totalBankMoney) {

        this.totalBankMoney = totalBankMoney;
    }
}
