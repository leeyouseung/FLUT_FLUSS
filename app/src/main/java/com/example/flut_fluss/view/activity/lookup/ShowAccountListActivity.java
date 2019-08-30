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

            Intent intent = new Intent(getApplicationContext(), LookupSendMoneyActivity.class);

            intent.putExtra("title_kind", binding.accountKindTitle.getText().toString());
            intent.putExtra("account_money", binding.accountMoney.getText().toString());

            startActivity(intent);
        });
    }

    private void clickAddMoneyTextButton() {

        binding.addMoneyButtonText.setOnClickListener(v -> {

        });
    }

    @Override
    protected int layoutId() {

        return R.layout.show_account_list_activity;
    }
}
