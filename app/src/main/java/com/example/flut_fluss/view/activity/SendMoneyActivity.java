package com.example.flut_fluss.view.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.flut_fluss.R;
import com.example.flut_fluss.databinding.SendMoneyActivityBinding;

public class SendMoneyActivity extends AppCompatActivity {

    SendMoneyActivityBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.send_money_activity);

        initData();

        event();
    }

    private void initData() {

    }

    private void event() {

    }
}
