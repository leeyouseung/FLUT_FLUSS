package com.example.flut_fluss.base;

import android.os.Build;
import android.os.Bundle;

import androidx.annotation.LayoutRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;

public abstract class BaseActivity<VB extends ViewDataBinding, VM extends ViewModel> extends AppCompatActivity {

    protected VB binding;
    protected VM viewModel;

    @LayoutRes
    protected abstract int getLayoutId();

    protected abstract Class<VM> getViewModel();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this, getLayoutId());
        viewModel = ViewModelProviders.of(this).get(getViewModel());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        binding = null;
    }

    @Override
    public void setRequestedOrientation(int requestedOrientation) {

        if (Build.VERSION.SDK_INT != Build.VERSION_CODES.O) {

            super.setRequestedOrientation(requestedOrientation);
        }
    }
}
