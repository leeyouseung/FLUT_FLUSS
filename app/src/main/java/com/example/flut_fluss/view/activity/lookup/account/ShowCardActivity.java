package com.example.flut_fluss.view.activity.lookup.account;

import android.os.Bundle;

import com.example.flut_fluss.R;
import com.example.flut_fluss.base.BaseActivity;
import com.example.flut_fluss.databinding.ShowCardActivityBinding;
import com.example.flut_fluss.viewmodel.ShowCardViewModel;

public class ShowCardActivity extends BaseActivity<ShowCardActivityBinding, ShowCardViewModel> {

    @Override
    protected int getLayoutId() {

        return R.layout.show_card_activity;
    }

    @Override
    protected Class<ShowCardViewModel> getViewModel() {

        return ShowCardViewModel.class;
    }

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

    }
}
