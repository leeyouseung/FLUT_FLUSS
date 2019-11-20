package com.example.flut_fluss.view.activity.inner_timeline;

import android.os.Bundle;

import com.example.flut_fluss.R;
import com.example.flut_fluss.base.BaseActivity;
import com.example.flut_fluss.databinding.FoodActivityBinding;
import com.example.flut_fluss.viewmodel.FoodViewModel;

public class FoodActivity extends BaseActivity<FoodActivityBinding, FoodViewModel> {

    @Override
    protected int getLayoutId() {

        return R.layout.food_activity;
    }

    @Override
    protected Class<FoodViewModel> getViewModel() {

        return FoodViewModel.class;
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
