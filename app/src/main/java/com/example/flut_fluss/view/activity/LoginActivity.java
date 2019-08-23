package com.example.flut_fluss.view.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.flut_fluss.R;
import com.example.flut_fluss.databinding.LoginActivityBinding;

public class LoginActivity extends AppCompatActivity {

    LoginActivityBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.login_activity);

        initData();
    }

    private void initData() {

    }
}
