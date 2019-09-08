package com.example.flut_fluss.view.activity.my_page;

import android.os.Bundle;

import com.example.flut_fluss.R;
import com.example.flut_fluss.base.BaseActivity;
import com.example.flut_fluss.databinding.MyPageActivityBinding;

public class MyPageActivity extends BaseActivity<MyPageActivityBinding> {

    @Override
    protected int layoutId() {

        return R.layout.my_page_activity;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initData();

        initViewModel();

        event();
    }

    private void initData() {

    }

    private void initViewModel() {


    }

    private void event() {

        clickEvent();
    }

    private void clickEvent() {

    }
}
