package com.example.flut_fluss.view.activity.my_account_list;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import com.example.flut_fluss.R;
import com.example.flut_fluss.base.BaseActivity;
import com.example.flut_fluss.databinding.SendMyCardActivityBinding;

public class SendMyCardActivity extends BaseActivity<SendMyCardActivityBinding> {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initData();

        event();
    }

    @SuppressLint("SetTextI18n")
    private void initData() {

        Intent intent = getIntent();

        String sendMyCardMoney = intent.getStringExtra("sendMoney");

        binding.sendMyBankMoney.setText(sendMyCardMoney + "원");
    }

    private void event() {

        clickEvent();
    }

    private void clickEvent() {

    }

    @Override
    protected int layoutId() {

        return R.layout.send_my_card_activity;
    }
}
