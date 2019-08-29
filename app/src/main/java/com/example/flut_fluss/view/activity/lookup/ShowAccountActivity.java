package com.example.flut_fluss.view.activity.lookup;

import android.content.Intent;
import android.os.Bundle;

import com.example.flut_fluss.R;
import com.example.flut_fluss.base.BaseActivity;
import com.example.flut_fluss.databinding.ShowAccountActivityBinding;
import com.example.flut_fluss.view.activity.lookup.remittance.LookupSendMoneyActivity;

public class ShowAccountActivity extends BaseActivity<ShowAccountActivityBinding> {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initData();

        event();
    }

    private void initData() {

    }

    private void event() {

        clickEvent();
    }

    private void clickEvent() {

        clickBackButton();
        clickMyAccountRemittanceButton();
        clickMyBankRemittanceButton();
    }

    private void clickBackButton() {

        binding.backButton.setOnClickListener(v -> {

            finish();
        });
    }

    private void clickMyAccountRemittanceButton() {

        binding.myAccountRemittanceButton.setOnClickListener(v -> {

            startActivity(new Intent(getApplicationContext(), LookupSendMoneyActivity.class));
        });
    }

    private void clickMyBankRemittanceButton() {

        binding.myBankRemittanceButton.setOnClickListener(v -> {

            startActivity(new Intent(getApplicationContext(), LookupSendMoneyActivity.class));
        });
    }

    @Override
    protected int layoutId() {

        return R.layout.show_account_activity;
    }
}
