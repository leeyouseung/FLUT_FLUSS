package com.example.flut_fluss.view.activity.account_list.my_account.send_money_password;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.lifecycle.ViewModelProviders;

import com.example.flut_fluss.R;
import com.example.flut_fluss.base.BaseActivity;
import com.example.flut_fluss.databinding.SendCheckPasswordActivityBinding;
import com.example.flut_fluss.manager.factory.ViewModelFactory;
import com.example.flut_fluss.network.request.SendMoneyRequest;
import com.example.flut_fluss.view.activity.finish.FinishRemittanceActivity;
import com.example.flut_fluss.viewmodel.SendMyAccountViewModel;

public class SendCheckPasswordActivity extends BaseActivity<SendCheckPasswordActivityBinding> {

    @Override
    protected int layoutId() {

        return R.layout.send_check_password_activity;
    }

    private SendMyAccountViewModel sendMyAccountViewModel;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initViewModel();

        initData();

        sendMyAccountViewModel.getSuccessMessage().observe(this, message -> {

            Toast.makeText(this, (String) message, Toast.LENGTH_LONG).show();

            startActivity(new Intent(getApplicationContext(), FinishRemittanceActivity.class));
        });

        sendMyAccountViewModel.getErrorMessage().observe(this, message -> Toast.makeText(this, (String) message, Toast.LENGTH_SHORT).show());

        event();
    }

    private void initViewModel() {

        sendMyAccountViewModel = ViewModelProviders.of(this, new ViewModelFactory(this)).get(SendMyAccountViewModel.class);
    }

    private void initData() {

        Intent intent = getIntent();

        String sendKind = intent.getStringExtra("send_kind");

        if(sendKind.equals("0")) {

            binding.animationLogo.setImageResource(R.drawable.flut_logo);
        }
        else if(sendKind.equals("1")) {

            binding.animationLogo.setImageResource(R.drawable.bank_icon);
        }
    }

    private void event() {

        clickEvent();
    }

    private void clickEvent() {

        clickSendButton();
    }

    private void clickSendButton() {

        binding.sendButton.setOnClickListener(v -> {

            String money = binding.money.getText().toString().substring(0, binding.money.getText().toString().length() - 1);

            sendMyAccountViewModel.sendMoney(new SendMoneyRequest(money));
        });
    }
}
