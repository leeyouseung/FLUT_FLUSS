package com.example.flut_fluss.view.activity.remittance;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.flut_fluss.R;
import com.example.flut_fluss.base.BaseActivity;
import com.example.flut_fluss.databinding.SendMoneyActivityBinding;
import com.example.flut_fluss.view.activity.my_account_list.SendMyAccountActivity;
import com.example.flut_fluss.view.activity.my_account_list.SendMyCardActivity;

public class SendMoneyActivity extends BaseActivity<SendMoneyActivityBinding> {

    boolean openSetLayout = true;

    public String sendMoney = "";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initData();

        event();
    }

    @SuppressLint("SetTextI18n")
    private void initData() {

        binding.searchView.setQueryHint("받는 분 계좌번호 또는 연락처 입력");

        Intent intent = getIntent();

        sendMoney = intent.getStringExtra("send_money");

        binding.sendMoneyTitle.setText(sendMoney + "원 송금");
    }

    private void event() {

        clickEvent();
    }

    private void clickEvent() {

        clickSearchView();
        clickOpenSetLayout();
        clickAccountLayout();
        clickCardLayout();
    }

    private void clickSearchView() {

        binding.searchView.setOnClickListener(v -> {

        });
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

        binding.accountLayout.setOnClickListener(v -> {

            Intent intent = new Intent(getApplicationContext(), SendMyAccountActivity.class);

            intent.putExtra("sendMoney", sendMoney);

            startActivity(intent);
        });
    }

    private void clickCardLayout() {

        binding.cardLayout.setOnClickListener(v -> {

            Intent intent = new Intent(getApplicationContext(), SendMyCardActivity.class);

            intent.putExtra("sendMoney", sendMoney);

            startActivity(intent);
        });
    }

    @Override
    protected int layoutId() {

        return R.layout.send_money_activity;
    }
}
