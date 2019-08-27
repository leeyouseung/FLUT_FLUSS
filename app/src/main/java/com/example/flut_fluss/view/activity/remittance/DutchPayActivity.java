package com.example.flut_fluss.view.activity.remittance;

import android.os.Bundle;

import com.example.flut_fluss.R;
import com.example.flut_fluss.base.BaseActivity;
import com.example.flut_fluss.databinding.DutchPayActivityBinding;

public class DutchPayActivity extends BaseActivity<DutchPayActivityBinding> {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int layoutId() {

        return R.layout.dutch_pay_activity;
    }
}
