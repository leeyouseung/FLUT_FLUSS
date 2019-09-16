package com.example.flut_fluss.view.activity.finish;

import android.content.Intent;
import android.os.Bundle;

import com.example.flut_fluss.R;
import com.example.flut_fluss.base.BaseActivity;
import com.example.flut_fluss.databinding.ActivityFinishRemittanceBinding;
import com.example.flut_fluss.view.activity.main.MainActivity;

public class FinishRemittanceActivity extends BaseActivity<ActivityFinishRemittanceBinding> {

    @Override
    protected int layoutId() {

        return R.layout.activity_finish_remittance;
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

        clickOkButton();
    }

    private void clickOkButton() {

        binding.okButton.setOnClickListener(v -> {

            startActivity(new Intent(getApplicationContext(), MainActivity.class));
        });
    }
}
