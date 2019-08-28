package com.example.flut_fluss.view.activity.remittance;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.flut_fluss.R;
import com.example.flut_fluss.base.BaseActivity;
import com.example.flut_fluss.databinding.SendMoneyActivityBinding;

public class SendMoneyActivity extends BaseActivity<SendMoneyActivityBinding> {

    boolean openSetLayout = false;

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

        binding.myAccountListLayout.setOnClickListener(v -> {

            openSetLayout = true;

            if(openSetLayout) {

                binding.accountLayout.setVisibility(View.VISIBLE);

                binding.cardLayout.setVisibility(View.VISIBLE);
            }
            else {

                binding.accountLayout.setVisibility(View.INVISIBLE);

                binding.cardLayout.setVisibility(View.INVISIBLE);
            }
        });
    }

    @Override
    protected int layoutId() {

        return R.layout.send_money_activity;
    }
}
