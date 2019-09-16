package com.example.flut_fluss.network.request;

import com.google.gson.annotations.SerializedName;

public class SendMoneyRequest {

    @SerializedName("money")
    private String money;

    public SendMoneyRequest(String money) {

        this.money = money;
    }

    public String getMoney() {

        return money;
    }

    public void setMoney(String money) {

        this.money = money;
    }
}
