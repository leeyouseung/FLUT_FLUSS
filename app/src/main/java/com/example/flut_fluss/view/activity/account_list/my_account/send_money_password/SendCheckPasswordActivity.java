package com.example.flut_fluss.view.activity.account_list.my_account.send_money_password;

import android.os.Bundle;
import android.widget.Toast;

import com.example.flut_fluss.R;
import com.example.flut_fluss.base.BaseActivity;
import com.example.flut_fluss.databinding.SendCheckPasswordActivityBinding;

public class SendCheckPasswordActivity extends BaseActivity<SendCheckPasswordActivityBinding> {

    @Override
    protected int layoutId() {

        return R.layout.send_check_password_activity;
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

        clickSendButton();
    }

    private void clickSendButton() {

        binding.sendButton.setOnClickListener(v -> {

            Toast.makeText(getApplicationContext(), "서버구현 X", Toast.LENGTH_SHORT).show();
        });
    }
}
