package com.example.flut_fluss.view.activity.select_account_list;

import android.os.Bundle;

import com.example.flut_fluss.R;
import com.example.flut_fluss.base.BaseActivity;
import com.example.flut_fluss.databinding.SendMoneyCardActivityBinding;

public class SendMoneyCardActivity extends BaseActivity<SendMoneyCardActivityBinding> {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.send_money_card_activity);
    }

    @Override
    protected int layoutId() {

        return R.layout.send_money_card_activity;
    }
}
