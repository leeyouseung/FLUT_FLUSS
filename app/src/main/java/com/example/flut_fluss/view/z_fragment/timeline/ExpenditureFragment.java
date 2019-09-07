package com.example.flut_fluss.view.z_fragment.timeline;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;

import com.example.flut_fluss.R;
import com.example.flut_fluss.base.BaseFragment;
import com.example.flut_fluss.databinding.ExpenditureFragmentBinding;
import com.example.flut_fluss.view.activity.inner_timeline.ClothsActivity;
import com.example.flut_fluss.view.activity.inner_timeline.EtcActivity;
import com.example.flut_fluss.view.activity.inner_timeline.FoodActivity;
import com.example.flut_fluss.view.activity.inner_timeline.TransferActivity;

public class ExpenditureFragment extends BaseFragment<ExpenditureFragmentBinding> {

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        initData();

        event();
    }

    private void initData() {

    }

    private void event() {

        clickEvent();
    }

    private void clickEvent() {

        clickTransferLayout();
        clickFoodLayout();
        clickClothsLayout();
        clickEtcLayout();
    }

    private void clickTransferLayout() {

        binding.transferLayout.setOnClickListener(v -> {

            startActivity(new Intent(getContext(), TransferActivity.class));
        });
    }

    private void clickFoodLayout() {

        binding.foodLayout.setOnClickListener(v -> {

            startActivity(new Intent(getContext(), FoodActivity.class));
        });
    }

    private void clickClothsLayout() {

        binding.clothsLayout.setOnClickListener(v -> {

            startActivity(new Intent(getContext(), ClothsActivity.class));
        });
    }

    private void clickEtcLayout() {

        binding.etcLayout.setOnClickListener(v -> {

            startActivity(new Intent(getContext(), EtcActivity.class));
        });
    }

    @Override
    protected int layoutId() {

        return R.layout.expenditure_fragment;
    }
}
