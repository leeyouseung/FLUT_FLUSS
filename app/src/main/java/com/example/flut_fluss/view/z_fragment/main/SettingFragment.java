package com.example.flut_fluss.view.z_fragment.main;

import android.os.Bundle;

import androidx.annotation.Nullable;

import com.example.flut_fluss.R;
import com.example.flut_fluss.base.BaseFragment;
import com.example.flut_fluss.databinding.SettingFragmentBinding;

public class SettingFragment extends BaseFragment<SettingFragmentBinding> {

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

    }

    @Override
    protected int layoutId() {

        return R.layout.setting_fragment;
    }
}
