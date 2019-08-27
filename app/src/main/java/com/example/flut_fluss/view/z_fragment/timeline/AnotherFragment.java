package com.example.flut_fluss.view.z_fragment.timeline;

import android.os.Bundle;

import androidx.annotation.Nullable;

import com.example.flut_fluss.R;
import com.example.flut_fluss.base.BaseFragment;
import com.example.flut_fluss.databinding.AnotherFragmentBinding;

public class AnotherFragment extends BaseFragment<AnotherFragmentBinding> {

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        initData();

        event();
    }

    private void initData() {

    }

    private void event() {

    }

    @Override
    protected int layoutId() {

        return R.layout.another_fragment;
    }
}
