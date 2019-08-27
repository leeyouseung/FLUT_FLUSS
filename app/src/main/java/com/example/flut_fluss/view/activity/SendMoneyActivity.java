package com.example.flut_fluss.view.activity;

import android.os.Bundle;

import com.example.flut_fluss.R;
import com.example.flut_fluss.base.BaseActivity;
import com.example.flut_fluss.databinding.SendMoneyActivityBinding;

public class SendMoneyActivity extends BaseActivity<SendMoneyActivityBinding> {

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

        return R.layout.send_money_activity;
    }
}
