package com.example.flut_fluss.view.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.flut_fluss.R;
import com.example.flut_fluss.databinding.AccountActivityBinding;

public class AccountActivity extends AppCompatActivity {

    AccountActivityBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.account_activity);
    }
}
