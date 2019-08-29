package com.example.flut_fluss.view.activity.lookup.remittance;

import android.os.Bundle;

import com.example.flut_fluss.R;
import com.example.flut_fluss.base.BaseActivity;
import com.example.flut_fluss.databinding.LookupSendMoneyActivityBinding;

public class LookupSendMoneyActivity extends BaseActivity<LookupSendMoneyActivityBinding> {

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
        
    }

    @Override
    protected int layoutId() {

        return R.layout.lookup_send_money_activity;
    }
}
