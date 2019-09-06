package com.example.flut_fluss.view.activity.register;

import android.os.Bundle;

import com.example.flut_fluss.R;
import com.example.flut_fluss.base.BaseActivity;
import com.example.flut_fluss.databinding.RegisterActivityBinding;

public class RegisterActivity extends BaseActivity<RegisterActivityBinding> {

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

        return R.layout.register_activity;
    }
}
