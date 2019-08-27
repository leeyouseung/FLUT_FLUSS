package com.example.flut_fluss.view.z_fragment.timeline;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;

import com.example.flut_fluss.R;
import com.example.flut_fluss.base.BaseFragment;
import com.example.flut_fluss.databinding.ExpenditureFragmentBinding;
import com.example.flut_fluss.view.activity.inner_timline.TransferActivity;

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

    }

    private void clickClothsLayout() {

    }

    private void clickEtcLayout() {

    }

    @Override
    protected int layoutId() {

        return R.layout.expenditure_fragment;
    }
}
