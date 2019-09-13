package com.example.flut_fluss.network.request;

import com.google.gson.annotations.SerializedName;

public class AccountRequest {

    @SerializedName("requester")
    private String requester;

    @SerializedName("responser")
    private String responser;

    @SerializedName("money")
    private String money;

    @SerializedName("time")
    private String time;

    @SerializedName("category")
    private String category;

    public AccountRequest(String requester, String responser, String money, String time, String category) {

        this.requester = requester;
        this.responser = responser;
        this.money = money;
        this.time = time;
        this.category = category;
    }

    public String getRequester() {

        return requester;
    }

    public void setRequester(String requester) {

        this.requester = requester;
    }

    public String getResponser() {

        return responser;
    }

    public void setResponser(String responser) {

        this.responser = responser;
    }

    public String getMoney() {

        return money;
    }

    public void setMoney(String money) {

        this.money = money;
    }

    public String getTime() {

        return time;
    }

    public void setTime(String time) {

        this.time = time;
    }

    public String getCategory() {

        return category;
    }

    public void setCategory(String category) {

        this.category = category;
    }
}
