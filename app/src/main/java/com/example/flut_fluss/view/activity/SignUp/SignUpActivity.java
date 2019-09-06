package com.example.flut_fluss.view.activity.SignUp;

import android.os.Bundle;

import com.example.flut_fluss.R;
import com.example.flut_fluss.base.BaseActivity;
import com.example.flut_fluss.databinding.SignupActivityBinding;

public class SignUpActivity extends BaseActivity<SignupActivityBinding> {

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

        binding.registerButton.setOnClickListener(v -> {

        });
    }

    @Override
    protected int layoutId() {

        return R.layout.signup_activity;
    }
}
