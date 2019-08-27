package com.example.flut_fluss.view.activity;

import android.os.Bundle;

import com.example.flut_fluss.R;
import com.example.flut_fluss.base.BaseActivity;
import com.example.flut_fluss.databinding.AccountActivityBinding;

public class AccountActivity extends BaseActivity<AccountActivityBinding> {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    protected int layoutId() {

        return R.layout.account_activity;
    }
}
