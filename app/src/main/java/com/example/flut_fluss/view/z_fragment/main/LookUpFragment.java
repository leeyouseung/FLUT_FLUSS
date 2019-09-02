package com.example.flut_fluss.view.z_fragment.main;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;

import com.example.flut_fluss.R;
import com.example.flut_fluss.base.BaseFragment;
import com.example.flut_fluss.databinding.LookUpFragmentBinding;
import com.example.flut_fluss.view.activity.lookup.ShowAccountActivity;
import com.example.flut_fluss.view.activity.lookup.account.ShowCardActivity;
import com.example.flut_fluss.view.activity.lookup.account.remittance.LookupSendMoneyActivity;

public class LookUpFragment extends BaseFragment<LookUpFragmentBinding> {

    private int resultMoney = 0;

    private String clearAccountMoney;
    private String clearBankMoney;

    private String sendResultMoney;

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        initData();

        event();
    }

    private void initData() {

        clearAccountMoney = binding.myAccountMoney.getText().toString();
        clearBankMoney = binding.bankAccountMoney.getText().toString();

        clearAccountMoney = clearAccountMoney.replaceAll(" ", "");
        clearBankMoney = clearBankMoney.replaceAll(" ", "");

        clearAccountMoney = clearAccountMoney.substring(0, clearAccountMoney.length() - 1);
        clearBankMoney = clearBankMoney.substring(0, clearBankMoney.length() - 1);

        resultMoney = Integer.parseInt(clearAccountMoney) + Integer.parseInt(clearBankMoney);

        sendResultMoney = Integer.toString(resultMoney);

        binding.showMoneyMoney.setText(sendResultMoney);
    }

    private void event() {

        clickEvent();
    }

    private void clickEvent() {

        clickMyPageButton();
        clickAccountLayout();
        clickCardLayout();
        clickAddKindButton();
        clickMyAccountSendButton();
        clickMyBankAccountSendButton();
    }

    private void clickMyPageButton() {


    }

    private void clickAccountLayout() {

        binding.accountLayout.setOnClickListener(v -> {

            Intent intent = new Intent(getContext(), ShowAccountActivity.class);

            intent.putExtra("account_money", sendResultMoney);
            intent.putExtra("my_account_money", clearAccountMoney);
            intent.putExtra("bank_account_money", clearBankMoney);

            startActivity(intent);
        });

        binding.accountButton.setOnClickListener(v -> {

            Intent intent = new Intent(getContext(), ShowAccountActivity.class);

            intent.putExtra("account_money", sendResultMoney);
            intent.putExtra("my_account_money", clearAccountMoney);
            intent.putExtra("bank_account_money", clearBankMoney);

            startActivity(intent);
        });
    }

    private void clickCardLayout() {

        binding.cardLayout.setOnClickListener(v -> {

            startActivity(new Intent(getContext(), ShowCardActivity.class));
        });

        binding.cardButton.setOnClickListener(v -> {

            startActivity(new Intent(getContext(), ShowCardActivity.class));
        });
    }

    private void clickAddKindButton() {

        binding.addKindButton.setOnClickListener(v -> {

        });
    }

    private void clickMyAccountSendButton() {

        binding.myAccountSendButton.setOnClickListener(v -> {

            Intent intent = new Intent(getContext(), LookupSendMoneyActivity.class);

            intent.putExtra("title_money_list", binding.titleFlutMoneyList.getText().toString());
            intent.putExtra("account_money", binding.myAccountMoney.getText().toString());
            intent.putExtra("button_text", "보내기");

            startActivity(intent);
        });
    }

    private void clickMyBankAccountSendButton() {

        binding.myBankAccountSendButton.setOnClickListener(v -> {

            Intent intent = new Intent(getContext(), LookupSendMoneyActivity.class);

            intent.putExtra("title_money_list", binding.titleBankMoneyList.getText().toString());
            intent.putExtra("account_money", binding.bankAccountMoney.getText().toString());
            intent.putExtra("button_text", "보내기");

            startActivity(intent);
        });
    }

    @Override
    protected int layoutId() {

        return R.layout.look_up_fragment;
    }
}
