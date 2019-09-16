package com.example.flut_fluss.view.activity.account_list.my_account;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.lifecycle.ViewModelProviders;

import com.example.flut_fluss.R;
import com.example.flut_fluss.base.BaseActivity;
import com.example.flut_fluss.databinding.SendMyAccountActivityBinding;
import com.example.flut_fluss.manager.factory.ViewModelFactory;
import com.example.flut_fluss.view.activity.account_list.my_account.send_money_finger.SendCheckFingerPrintActivity;
import com.example.flut_fluss.viewmodel.SendMyAccountViewModel;

public class SendMyAccountActivity extends BaseActivity<SendMyAccountActivityBinding> {

    @Override
    protected int layoutId() {

        return R.layout.send_my_account_activity;
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

        String sendMyAccountMoney = intent.getStringExtra("sendMoney");

        binding.sendMyAccountMoney.setText(sendMyAccountMoney + "원");
    }

    private void event() {

        clickEvent();
    }

    private void clickEvent() {

        clickBackButton();
        clickMyAccountSendMoney();
    }

    private void clickBackButton() {

        binding.backButton.setOnClickListener(v -> {

            finish();
        });
    }

    private void clickMyAccountSendMoney() {

        binding.myAccountSendButton.setOnClickListener(v -> {

            Intent intent = new Intent(getApplicationContext(), SendCheckFingerPrintActivity.class);

            intent.putExtra("send_kind", 0);

            startActivity(intent);
        });
    }
}
