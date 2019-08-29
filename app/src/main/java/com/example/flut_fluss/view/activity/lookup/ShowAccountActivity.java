package com.example.flut_fluss.view.activity.lookup;

import android.os.Bundle;

import com.example.flut_fluss.R;
import com.example.flut_fluss.base.BaseActivity;
import com.example.flut_fluss.databinding.ShowAccountActivityBinding;

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

        clickMyAccountLayout();
        clickMyBankLayout();
    }

    private void clickMyAccountLayout() {

        binding.myAccountRemittanceButton.setOnClickListener(v -> {

            
        });
    }

    private void clickMyBankLayout() {

        binding.myBankRemittanceButton.setOnClickListener(v -> {

        });
    }

    @Override
    protected int layoutId() {

        return R.layout.show_account_activity;
    }
}
