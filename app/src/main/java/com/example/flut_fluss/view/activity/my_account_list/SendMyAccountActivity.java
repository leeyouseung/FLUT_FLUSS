package com.example.flut_fluss.view.activity.my_account_list;

import android.os.Bundle;

import com.example.flut_fluss.R;
import com.example.flut_fluss.base.BaseActivity;
import com.example.flut_fluss.databinding.SendMyAccountActivityBinding;

public class SendMyAccountActivity extends BaseActivity<SendMyAccountActivityBinding> {

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

        clickMyAccountSendMoney();
    }

    private void clickMyAccountSendMoney() {

        binding.myAccountSendButton.setOnClickListener(v -> {

            
        });
    }

    @Override
    protected int layoutId() {

        return R.layout.send_my_account_activity;
    }
}
