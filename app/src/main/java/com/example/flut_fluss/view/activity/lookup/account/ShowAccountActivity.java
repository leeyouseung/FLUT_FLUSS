package com.example.flut_fluss.view.activity.lookup.account;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import com.example.flut_fluss.R;
import com.example.flut_fluss.base.BaseActivity;
import com.example.flut_fluss.databinding.ShowAccountActivityBinding;
import com.example.flut_fluss.view.activity.lookup.ShowAccountListActivity;
import com.example.flut_fluss.view.activity.lookup.account.remittance.LookupSendMoneyActivity;

public class ShowAccountActivity extends BaseActivity<ShowAccountActivityBinding> {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initData();

        event();
    }

    @SuppressLint("SetTextI18n")
    private void initData() {

        Intent intent = getIntent();

        binding.accountMoney.setText(intent.getStringExtra("account_money") + " 원");
        binding.myAccountMoney.setText(intent.getStringExtra("my_account_money") + " 원");
        binding.bankAccountMoney.setText(intent.getStringExtra("bank_account_money") + " 원");
    }

    private void event() {

        clickEvent();
    }

    private void clickEvent() {

        clickBackButton();
        clickMyAccountSendLayout();
        clickMyBankAccountSendLayout();
        clickMyAccountSendButton();
        clickMyBankAccountSendButton();
    }

    private void clickBackButton() {

        binding.backButton.setOnClickListener(v -> {

            finish();
        });
    }

    private void clickMyAccountSendLayout() {

        binding.myAccountLayout.setOnClickListener(v -> {

            intentInfoShowAccountList();
        });
    }

    private void clickMyBankAccountSendLayout() {

        binding.myBankLayout.setOnClickListener(v -> {

            intentInfoLookupSendMoney();
        });
    }

    private void clickMyAccountSendButton() {

        binding.myAccountSendButton.setOnClickListener(v -> {

            intentInfoShowAccountList();
        });
    }

    private void clickMyBankAccountSendButton() {

        binding.myBankAccountSendButton.setOnClickListener(v -> {

            intentInfoLookupSendMoney();
        });
    }

    private void intentInfoShowAccountList() {

        Intent intent = new Intent(getApplicationContext(), ShowAccountListActivity.class);

        intent.putExtra("title_money_list", binding.titleFlutMoneyList.getText().toString());
        intent.putExtra("account_money", binding.myAccountMoney.getText().toString());

        startActivity(intent);
    }

    private void intentInfoLookupSendMoney() {

        Intent intent = new Intent(getApplicationContext(), LookupSendMoneyActivity.class);

        intent.putExtra("title_money_list", binding.titleBankMoneyList.getText().toString());
        intent.putExtra("account_money", binding.bankAccountMoney.getText().toString());

        startActivity(intent);
    }

    @Override
    protected int layoutId() {

        return R.layout.show_account_activity;
    }
}
