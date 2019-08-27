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

    }

    @Override
    protected int layoutId() {

        return R.layout.time_line_fragment;
    }
}
