package com.example.flut_fluss.model;

import com.google.gson.annotations.SerializedName;

public class User {

    private String id;
    private String name;
    private String profileImg;
    @SerializedName("phone_number")
    private String phoneNumber;

    public User() {

    }

    public User(String id, String name, String profileImg, String phoneNumber) {

        this.id = id;
        this.name = name;
        this.profileImg = profileImg;
        this.phoneNumber = phoneNumber;
    }

    public String getId() {

        return id;
    }

    public void setId(String id) {

        this.id = id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getprofileImg() {

        return profileImg;
    }

    public void setprofileImg(String profileImg) {

        this.profileImg = profileImg;
    }

    public String getPhoneNumber() {

        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {

        this.phoneNumber = phoneNumber;
    }
}
