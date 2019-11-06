package com.example.flut_fluss.view.activity.account_list.my_account.send_money_password;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.example.flut_fluss.R;
import com.example.flut_fluss.base.BaseActivity;
import com.example.flut_fluss.databinding.SendCheckPasswordActivityBinding;
import com.example.flut_fluss.network.request.SendMoneyRequest;
import com.example.flut_fluss.view.activity.finish.FinishRemittanceActivity;
import com.example.flut_fluss.viewmodel.SendCheckPasswordViewModel;
import com.example.flut_fluss.viewmodel.SendMyAccountViewModel;
import com.example.flut_fluss.viewmodel.SendMyBankViewModel;

public class SendCheckPasswordActivity extends BaseActivity<SendCheckPasswordActivityBinding, SendCheckPasswordViewModel> {

    private String sendKind = "0";
    private String money = "";

    private SendMyAccountViewModel sendMyAccountViewModel;
    private SendMyBankViewModel sendMyBankViewModel;

    @Override
    protected int getLayoutId() {
        return R.layout.send_check_password_activity;
    }

    @Override
    protected Class getViewModel() {
        return SendCheckPasswordViewModel.class;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initData();

        event();
    }

    @SuppressLint("SetTextI18n")
    private void initData() {

        Intent intent = getIntent();

        sendKind = intent.getStringExtra("send_kind");
        money = intent.getStringExtra("money");

        binding.money.setText(money + "원");

        if(sendKind.equals("0")) {

            binding.animationLogo.setImageResource(R.drawable.flut_logo);

            sendMyAccountViewModel.getSuccessMessage().observe(this, message -> {

                Toast.makeText(this, (String) message, Toast.LENGTH_LONG).show();

                startActivity(new Intent(getApplicationContext(), FinishRemittanceActivity.class));
            });

            sendMyAccountViewModel.getErrorMessage().observe(this, message -> Toast.makeText(this, (String) message, Toast.LENGTH_SHORT).show());
        }
        else if(sendKind.equals("1")) {

            binding.animationLogo.setImageResource(R.drawable.bank_icon);

            sendMyBankViewModel.getSuccessMessage().observe(this, message -> {

                Toast.makeText(this, (String) message, Toast.LENGTH_LONG).show();

                startActivity(new Intent(getApplicationContext(), FinishRemittanceActivity.class));
            });

            sendMyBankViewModel.getErrorMessage().observe(this, message -> Toast.makeText(this, (String) message, Toast.LENGTH_LONG).show());
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

            if(sendKind.equals("0")) {

                String money = binding.money.getText().toString().substring(0, binding.money.getText().toString().length() - 1);

                sendMyAccountViewModel.sendFlussMoney(new SendMoneyRequest(money, sendKind));
            }
            else if(sendKind.equals("1")) {

                String money = binding.money.getText().toString().substring(0, binding.money.getText().toString().length() - 1);

                sendMyBankViewModel.sendBankMoney(new SendMoneyRequest(money, sendKind));
            }
        });
    }
}
