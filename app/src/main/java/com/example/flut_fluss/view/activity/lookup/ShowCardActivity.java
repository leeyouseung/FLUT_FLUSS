package com.example.flut_fluss.view.activity.lookup;

import android.os.Bundle;

import com.example.flut_fluss.R;
import com.example.flut_fluss.base.BaseActivity;
import com.example.flut_fluss.databinding.ShowCardActivityBinding;

public class ShowCardActivity extends BaseActivity<ShowCardActivityBinding> {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    protected int layoutId() {

        return R.layout.show_card_activity;
    }
}
