package com.example.flut_fluss.view.activity.my_page;

import android.os.Bundle;

import com.example.flut_fluss.R;
import com.example.flut_fluss.base.BaseActivity;
import com.example.flut_fluss.databinding.MyPageActivityBinding;
import com.example.flut_fluss.viewmodel.MyPageViewModel;

public class MyPageActivity extends BaseActivity<MyPageActivityBinding, MyPageViewModel> {

    @Override
    protected int getLayoutId() {

        return R.layout.my_page_activity;
    }

    @Override
    protected Class<MyPageViewModel> getViewModel() {

        return MyPageViewModel.class;
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
