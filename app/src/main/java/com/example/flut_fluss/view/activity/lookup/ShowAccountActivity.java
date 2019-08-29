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
        clickMyAccountSendButton();
        clickMyBankAccountSendButton();
    }

    private void clickBackButton() {

        binding.backButton.setOnClickListener(v -> {

            finish();
        });
    }

    private void clickMyAccountSendButton() {

        binding.myAccountSendButton.setOnClickListener(v -> {

            Intent intent = new Intent(getApplicationContext(), LookupSendMoneyActivity.class);

            intent.putExtra("title_money_list", binding.titleFlutMoneyList.getText().toString());
            intent.putExtra("account_money", binding.myAccountMoney.getText().toString());

            startActivity(intent);
        });
    }

    private void clickMyBankAccountSendButton() {

        binding.myBankAccountSendButton.setOnClickListener(v -> {

            Intent intent = new Intent(getApplicationContext(), LookupSendMoneyActivity.class);

            intent.putExtra("title_money_list", binding.titleBankMoneyList.getText().toString());
            intent.putExtra("account_money", binding.bankAccountMoney.getText().toString());

            startActivity(intent);
        });
    }

    @Override
    protected int layoutId() {

        return R.layout.show_account_activity;
    }
}
