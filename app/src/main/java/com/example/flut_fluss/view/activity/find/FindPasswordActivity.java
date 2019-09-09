package com.example.flut_fluss.view.activity.find;

import android.os.Bundle;

import com.example.flut_fluss.R;
import com.example.flut_fluss.base.BaseActivity;
import com.example.flut_fluss.databinding.FindPasswordActivityBinding;

public class FindPasswordActivity extends BaseActivity<FindPasswordActivityBinding> {

    @Override
    protected int layoutId() {

        return R.layout.find_password_activity;
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

    }
}
