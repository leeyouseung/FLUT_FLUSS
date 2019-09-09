package com.example.flut_fluss.view.activity.find;

import android.os.Bundle;

import com.example.flut_fluss.R;
import com.example.flut_fluss.base.BaseActivity;
import com.example.flut_fluss.databinding.FindIdActivityBinding;

public class FindIdActivity extends BaseActivity<FindIdActivityBinding> {

    @Override
    protected int layoutId() {

        return R.layout.find_id_activity;
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
