package com.example.flut_fluss.view.activity.inner_timeline;

import android.os.Bundle;

import com.example.flut_fluss.R;
import com.example.flut_fluss.base.BaseActivity;
import com.example.flut_fluss.databinding.TransferActivityBinding;
import com.example.flut_fluss.viewmodel.TransferViewModel;

public class TransferActivity extends BaseActivity<TransferActivityBinding, TransferViewModel> {

    @Override
    protected int getLayoutId() {

        return R.layout.transfer_activity;
    }

    @Override
    protected Class<TransferViewModel> getViewModel() {

        return TransferViewModel.class;
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

        clickBackButton();
    }

    private void clickBackButton() {

        binding.backButton.setOnClickListener(v -> {

            finish();
        });
    }
}
