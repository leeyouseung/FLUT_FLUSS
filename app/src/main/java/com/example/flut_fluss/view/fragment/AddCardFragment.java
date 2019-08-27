package com.example.flut_fluss.view.fragment;

import android.os.Bundle;

import androidx.annotation.Nullable;

import com.example.flut_fluss.R;
import com.example.flut_fluss.base.BaseFragment;
import com.example.flut_fluss.databinding.AddCardFragmentBinding;

public class AddCardFragment extends BaseFragment<AddCardFragmentBinding> {

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        initData();
    }

    private void initData() {

    }

    @Override
    protected int layoutId() {

        return R.layout.add_card_fragment;
    }
}
