package com.example.flut_fluss.view.activity.remittance;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.flut_fluss.R;
import com.example.flut_fluss.base.BaseActivity;
import com.example.flut_fluss.databinding.SendMoneyActivityBinding;

public class SendMoneyActivity extends BaseActivity<SendMoneyActivityBinding> {

    boolean openSetLayout = true;

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

        binding.sendMoneyTitle.setText(sendMoney + "원 송금");
    }

    private void event() {

        clickEvent();
    }

    private void clickEvent() {

        clickOpenSetLayout();
        clickAccountLayout();
        clickCardLayout();
    }

    private void clickOpenSetLayout() {

        binding.myAccountListLayout.setOnClickListener(v -> {

            if(openSetLayout) {

                binding.notOpenButton.setVisibility(View.INVISIBLE);

                binding.openButton.setVisibility(View.VISIBLE);

                binding.accountLayout.setVisibility(View.VISIBLE);

                binding.cardLayout.setVisibility(View.VISIBLE);

                openSetLayout = false;
            }
            else {

                binding.notOpenButton.setVisibility(View.VISIBLE);

                binding.openButton.setVisibility(View.INVISIBLE);

                binding.accountLayout.setVisibility(View.GONE);

                binding.cardLayout.setVisibility(View.GONE);

                openSetLayout = true;
            }
        });
    }

    private void clickAccountLayout() {

    }

    private void clickCardLayout() {
        
    }

    @Override
    protected int layoutId() {

        return R.layout.send_money_activity;
    }
}
