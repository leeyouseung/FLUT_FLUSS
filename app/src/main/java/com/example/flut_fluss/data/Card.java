package com.example.flut_fluss.data;

public class Card {

    private String kind;
    private String money;

    public Card(String kind, String money) {

        this.kind = kind;
        this.money = money;
    }

    public String getKind() {

        return kind;
    }

    public void setKind(String kind) {

        this.kind = kind;
    }

    public String getMoney() {

        return money;
    }

    public void setMoney(String money) {

        this.money = money;
    }
}
