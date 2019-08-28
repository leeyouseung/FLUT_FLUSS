package com.example.flut_fluss.view.activity.remittance;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import com.example.flut_fluss.R;
import com.example.flut_fluss.base.BaseActivity;
import com.example.flut_fluss.databinding.SendMoneyActivityBinding;

public class SendMoneyActivity extends BaseActivity<SendMoneyActivityBinding> {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initData();

        event();
    }

    @SuppressLint("SetTextI18n")
    private void initData() {

        Intent intent = getIntent();

        String sendMoney = intent.getStringExtra("send_money");

        binding.sendMoneyTitle.setText(sendMoney + " 원 송금");
    }

    private void event() {

    }

    @Override
    protected int layoutId() {

        return R.layout.send_money_activity;
    }
}
