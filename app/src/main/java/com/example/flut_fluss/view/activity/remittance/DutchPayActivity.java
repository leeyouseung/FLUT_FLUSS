package com.example.flut_fluss.view.activity.remittance;

import android.os.Bundle;
import android.widget.Toast;

import com.example.flut_fluss.R;
import com.example.flut_fluss.base.BaseActivity;
import com.example.flut_fluss.databinding.DutchPayActivityBinding;
import com.example.flut_fluss.viewmodel.DutchPayViewModel;

public class DutchPayActivity extends BaseActivity<DutchPayActivityBinding, DutchPayViewModel> {

    @Override
    protected int getLayoutId() {

        return R.layout.dutch_pay_activity;
    }

    @Override
    protected Class<DutchPayViewModel> getViewModel() {

        return DutchPayViewModel.class;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initData();

        event();
    }

    private void initData() {

        binding.searchView.setQueryHint("연락처 입력");
    }

    private void event() {

        clickEvent();
    }

    private void clickEvent() {

        clickBackButton();
        clickSelectMemberButton();
        clickSearchView();
    }

    private void clickBackButton() {

        binding.backButton.setOnClickListener(v -> {

            finish();
        });
    }

    private void clickSelectMemberButton() {

        binding.selectNemberButton.setOnClickListener(v -> {

            Toast.makeText(getApplicationContext(), "추후 몇명인지 띄울 예정", Toast.LENGTH_SHORT).show();
        });
    }

    private void clickSearchView() {

        binding.searchView.setOnClickListener(v -> {

        });
    }
}
