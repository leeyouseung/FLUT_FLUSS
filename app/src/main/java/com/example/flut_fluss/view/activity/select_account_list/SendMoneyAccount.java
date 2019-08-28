package com.example.flut_fluss.view.activity.select_account_list;

import android.os.Bundle;

import com.example.flut_fluss.R;
import com.example.flut_fluss.base.BaseActivity;
import com.example.flut_fluss.databinding.SendMoneyAccountActivityBinding;

public class SendMoneyAccount extends BaseActivity<SendMoneyAccountActivityBinding> {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.send_money_account_activity);
    }

    @Override
    protected int layoutId() {

        return R.layout.send_money_account_activity;
    }
}
