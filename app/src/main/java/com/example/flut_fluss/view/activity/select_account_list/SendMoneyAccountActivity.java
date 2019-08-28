package com.example.flut_fluss.view.activity.select_account_list;

import android.os.Bundle;

import com.example.flut_fluss.R;
import com.example.flut_fluss.base.BaseActivity;
import com.example.flut_fluss.databinding.SendMoneyAccountActivityBinding;

public class SendMoneyAccountActivity extends BaseActivity<SendMoneyAccountActivityBinding> {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initData();

        event();
    }

    private void initData() {

    }

    private void event() {
        
    }

    @Override
    protected int layoutId() {

        return R.layout.send_money_account_activity;
    }
}
