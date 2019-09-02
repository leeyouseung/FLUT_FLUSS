package com.example.flut_fluss.model.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "user_table")
public class UserRoom {

    @PrimaryKey
    private String id;

    private String password;

    private String username;
}