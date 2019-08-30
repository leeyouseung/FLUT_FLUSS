package com.example.flut_fluss.view.activity.lookup;

import android.content.Intent;
import android.os.Bundle;

import com.example.flut_fluss.R;
import com.example.flut_fluss.base.BaseActivity;
import com.example.flut_fluss.databinding.ShowAccountListActivityBinding;
import com.example.flut_fluss.view.activity.lookup.account.remittance.LookupSendMoneyActivity;

public class ShowAccountListActivity extends BaseActivity<ShowAccountListActivityBinding> {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initData();

        event();
    }

    private void initData() {

        Intent intent = getIntent();

        binding.accountKindTitle.setText(intent.getStringExtra("title_money_list"));
        binding.accountMoney.setText(intent.getStringExtra("account_money"));
    }

    private void event() {

        clickEvent();
    }

    private void clickEvent() {

        clickAddMoneyImgButton();
        clickAddMoneyTextButton();
    }

    private void clickAddMoneyImgButton() {

        binding.addMoneyButton.setOnClickListener(v -> {

            IntentLookupSendMoney();
        });
    }

    private void clickAddMoneyTextButton() {

        binding.addMoneyButtonText.setOnClickListener(v -> {

            IntentLookupSendMoney();
        });
    }

    private void IntentLookupSendMoney() {

        Intent intent = new Intent(getApplicationContext(), LookupSendMoneyActivity.class);

        intent.putExtra("big_title", "충전");
        intent.putExtra("title_kind", binding.accountKindTitle.getText().toString());
        intent.putExtra("account_money", binding.accountMoney.getText().toString());

        startActivity(intent);
    }

    @Override
    protected int layoutId() {

        return R.layout.show_account_list_activity;
    }
}
