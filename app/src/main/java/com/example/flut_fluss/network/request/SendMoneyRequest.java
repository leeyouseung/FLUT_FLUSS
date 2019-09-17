package com.example.flut_fluss.network.request;

import com.google.gson.annotations.SerializedName;

public class SendMoneyRequest {

    @SerializedName("money")
    private String money;

    @SerializedName("send_kind")
    private String sendKind;

    public SendMoneyRequest(String money, String sendKind) {

        this.money = money;
        this.sendKind = sendKind;
    }

    public String getMoney() {

        return money;
    }

    public void setMoney(String money) {

        this.money = money;
    }

    public String getSendKind() {

        return sendKind;
    }

    public void setSendKind(String sendKind) {
        
        this.sendKind = sendKind;
    }
}
