package com.example.flut_fluss.view.fragment;

import android.os.Bundle;

import androidx.annotation.Nullable;

import com.example.flut_fluss.R;
import com.example.flut_fluss.base.BaseFragment;
import com.example.flut_fluss.databinding.TimeLineFragmentBinding;
public class TimeLineFragment extends BaseFragment<TimeLineFragmentBinding> {

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

        clickExpenditureButton();
        clickIncomeButton();
        clickAnotherButton();
    }

    private void clickExpenditureButton() {

        binding.expenditureButton.setOnClickListener(v -> {

            binding.expenditureButton.setBackgroundResource(R.drawable.time_line_button_radius);
            binding.incomeButton.setBackground(null);
            binding.anotherButton.setBackground(null);
        });
    }

    private void clickIncomeButton() {

        binding.incomeButton.setOnClickListener(v -> {

            binding.expenditureButton.setBackground(null);
            binding.incomeButton.setBackgroundResource(R.drawable.time_line_button_radius);
            binding.anotherButton.setBackground(null);
        });
    }

    private void clickAnotherButton() {

        binding.anotherButton.setOnClickListener(v -> {

            binding.expenditureButton.setBackground(null);
            binding.incomeButton.setBackground(null);
            binding.anotherButton.setBackgroundResource(R.drawable.time_line_button_radius);
        });
    }

    @Override
    protected int layoutId() {

        return R.layout.time_line_fragment;
    }
}
