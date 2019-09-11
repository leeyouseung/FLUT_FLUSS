package com.example.flut_fluss.view.activity.account_list.my_account.send_money_finger;

import android.content.Intent;
import android.os.Bundle;

import com.example.flut_fluss.R;
import com.example.flut_fluss.base.BaseActivity;
import com.example.flut_fluss.databinding.SendCheckFingerPrintActivityBinding;

public class SendCheckFingerPrintActivity extends BaseActivity<SendCheckFingerPrintActivityBinding> {

    @Override
    protected int layoutId() {

        return R.layout.send_check_finger_print_activity;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initViewModel();

        initData();

        event();
    }

    private void initViewModel() {

    }

    private void initData() {

    }

    private void event() {

        clickEvent();
    }

    private void clickEvent() {

        clickCancelButton();
    }

    private void clickCancelButton() {

        binding.cancelButton.setOnClickListener(v -> {

            startActivity(new Intent(getApplicationContext(), SendCheckPasswordActivity.class));
        });
    }
}
