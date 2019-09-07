package com.example.flut_fluss.network.request;

public class SendMoneyRequest {

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
