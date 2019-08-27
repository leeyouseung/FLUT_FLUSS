package com.example.flut_fluss.view.z_fragment.main;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.flut_fluss.R;
import com.example.flut_fluss.base.BaseFragment;
import com.example.flut_fluss.databinding.TimeLineFragmentBinding;
import com.example.flut_fluss.view.z_fragment.timeline.AnotherFragment;
import com.example.flut_fluss.view.z_fragment.timeline.ExpenditureFragment;
import com.example.flut_fluss.view.z_fragment.timeline.IncomeFragment;

public class TimeLineFragment extends BaseFragment<TimeLineFragmentBinding> {

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        initSetFragment();

        event();
    }

    private void initSetFragment() {

        FragmentManager fragmentManager = getChildFragmentManager();

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.replace(R.id.time_line_fragment, new ExpenditureFragment());
        fragmentTransaction.commit();
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

            FragmentManager fragmentManager = getChildFragmentManager();

            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

            fragmentTransaction.replace(R.id.time_line_fragment, new ExpenditureFragment());
            fragmentTransaction.commit();
        });
    }

    private void clickIncomeButton() {

        binding.incomeButton.setOnClickListener(v -> {

            binding.expenditureButton.setBackground(null);
            binding.incomeButton.setBackgroundResource(R.drawable.time_line_button_radius);
            binding.anotherButton.setBackground(null);

            FragmentManager fragmentManager = getChildFragmentManager();

            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

            fragmentTransaction.replace(R.id.time_line_fragment, new IncomeFragment());
            fragmentTransaction.commit();
        });
    }

    private void clickAnotherButton() {

        binding.anotherButton.setOnClickListener(v -> {

            binding.expenditureButton.setBackground(null);
            binding.incomeButton.setBackground(null);
            binding.anotherButton.setBackgroundResource(R.drawable.time_line_button_radius);

            FragmentManager fragmentManager = getChildFragmentManager();

            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

            fragmentTransaction.replace(R.id.time_line_fragment, new AnotherFragment());
            fragmentTransaction.commit();
        });
    }

    @Override
    protected int layoutId() {

        return R.layout.time_line_fragment;
    }
}
