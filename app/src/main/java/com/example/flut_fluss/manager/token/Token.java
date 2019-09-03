package com.example.flut_fluss.manager.token;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;

public class Token extends ContextWrapper {

    public Token(Context context) {

        super(context);
    }

    private String token;

    public void setToken(String token) {

        SharedPreferences sharedPreferences = getSharedPreferences("fluss_token", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putString("token", token);

        editor.commit();
    }

    public String getToken() {

        SharedPreferences sharedPreferences = getSharedPreferences("fluss_token", MODE_PRIVATE);

        token = sharedPreferences.getString("token","");

        return token;
    }
}
