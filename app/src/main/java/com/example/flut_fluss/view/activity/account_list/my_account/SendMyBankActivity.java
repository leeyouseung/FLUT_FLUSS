package com.example.flut_fluss.view.activity.account_list.my_account;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import com.example.flut_fluss.R;
import com.example.flut_fluss.base.BaseActivity;
import com.example.flut_fluss.databinding.SendMyBankActivityBinding;
import com.example.flut_fluss.view.activity.account_list.my_account.send_money_finger.SendCheckFingerPrintActivity;

public class SendMyBankActivity extends BaseActivity<SendMyBankActivityBinding> {

    @Override
    protected int layoutId() {

        return R.layout.send_my_bank_activity;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initViewModel();

        initData();

        event();
    }

    private void initViewModel() {

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

        clickBackButton();
        clickSendBankButton();
    }

    private void clickBackButton() {

        binding.backButton.setOnClickListener(v -> {

            finish();
        });
    }

    private void clickSendBankButton() {

        binding.myBankSendButton.setOnClickListener(v -> {

            Intent intent = new Intent(getApplicationContext(), SendCheckFingerPrintActivity.class);

            intent.putExtra("send_kind", 1);

            startActivity(intent);
        });
    }
}
