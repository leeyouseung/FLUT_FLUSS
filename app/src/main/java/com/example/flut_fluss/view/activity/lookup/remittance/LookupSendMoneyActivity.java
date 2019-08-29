package com.example.flut_fluss.view.activity.lookup.remittance;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.flut_fluss.R;
import com.example.flut_fluss.base.BaseActivity;
import com.example.flut_fluss.databinding.LookupSendMoneyActivityBinding;

public class LookupSendMoneyActivity extends BaseActivity<LookupSendMoneyActivityBinding> {

    public String sendMoney = "0";
    private String accountKindTitle;
    private String accountMoney;

    private boolean isFirstInput = true;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initData();

        event();
    }

    @SuppressLint("SetTextI18n")
    private void initData() {

        binding.money.setText(String.valueOf(0));

        Intent intent = getIntent();

        accountKindTitle = intent.getStringExtra("title_money_list");
        accountMoney = intent.getStringExtra("account_money");

        binding.accountKindTitle.setText(accountKindTitle);
        binding.accountMoney.setText("잔액 : " + accountMoney + " 원");
    }

    private void event() {

        clickEvent();
    }

    private void visibleDeleteCancelButton() {

        binding.deleteButton.setVisibility(View.VISIBLE);
        binding.cancelButton.setVisibility(View.VISIBLE);
    }

    private void invisibleDeleteCancelButton() {

        binding.deleteButton.setVisibility(View.INVISIBLE);
        binding.cancelButton.setVisibility(View.INVISIBLE);
    }

    private void clickEvent() {

        clickMoneyNumber0();
        clickMoneyNumber1();
        clickMoneyNumber2();
        clickMoneyNumber3();
        clickMoneyNumber4();
        clickMoneyNumber5();
        clickMoneyNumber6();
        clickMoneyNumber7();
        clickMoneyNumber8();
        clickMoneyNumber9();
        clickCancelButton();
        clickDeleteButton();
    }

    private void clickMoneyNumber0() {

        binding.moneyNumber0.setOnClickListener(v -> {

            if (isFirstInput && binding.money.getText().toString().equals("0")) {

                return;
            }
            else {

                if(binding.accountMoney.getText().toString().equals("0")) {

                    return;
                }
                else {

                    binding.money.append(String.valueOf(0));

                    sendMoney = binding.money.getText().toString();

                    binding.remittanceButton.setBackgroundColor(getResources().getColor(R.color.login_button_first_gradation));
                }
            }
        });
    }

    private void clickMoneyNumber1() {

        binding.moneyNumber1.setOnClickListener(v -> {

            if (isFirstInput) {

                if(binding.accountMoney.getText().toString().equals("0")) {

                    return;
                }
                else {

                    binding.money.setText(String.valueOf(1));

                    isFirstInput = false;

                    visibleDeleteCancelButton();

                    setMoveMoneyCountTitle();

                    sendMoney = binding.money.getText().toString();

                    binding.remittanceButton.setBackgroundColor(getResources().getColor(R.color.login_button_first_gradation));
                }
            }
            else {

                if(binding.accountMoney.getText().toString().equals("0")) {

                    return;
                }
                else {

                    binding.money.append(String.valueOf(1));

                    visibleDeleteCancelButton();

                    sendMoney = binding.money.getText().toString();

                    binding.remittanceButton.setBackgroundColor(getResources().getColor(R.color.login_button_first_gradation));
                }
            }
        });
    }


    private void clickMoneyNumber2() {

        binding.moneyNumber2.setOnClickListener(v -> {

            if (isFirstInput) {

                if(binding.accountMoney.getText().toString().equals("0")) {

                    return;
                }
                else {

                    binding.money.setText(String.valueOf(2));

                    isFirstInput = false;

                    visibleDeleteCancelButton();

                    setMoveMoneyCountTitle();

                    sendMoney = binding.money.getText().toString();

                    binding.remittanceButton.setBackgroundColor(getResources().getColor(R.color.login_button_first_gradation));
                }
            }
            else {

                if(binding.accountMoney.getText().toString().equals("0")) {

                    return;
                }
                else {

                    binding.money.append(String.valueOf(2));

                    visibleDeleteCancelButton();

                    sendMoney = binding.money.getText().toString();

                    binding.remittanceButton.setBackgroundColor(getResources().getColor(R.color.login_button_first_gradation));
                }
            }
        });
    }

    private void clickMoneyNumber3() {

        binding.moneyNumber3.setOnClickListener(v -> {

            if (isFirstInput) {

                if(binding.accountMoney.getText().toString().equals("0")) {

                    return;
                }
                else {

                    binding.money.setText(String.valueOf(3));

                    isFirstInput = false;

                    visibleDeleteCancelButton();

                    setMoveMoneyCountTitle();

                    sendMoney = binding.money.getText().toString();

                    binding.remittanceButton.setBackgroundColor(getResources().getColor(R.color.login_button_first_gradation));
                }
            }
            else {

                if(binding.accountMoney.getText().toString().equals("0")) {

                    return;
                }
                else {

                    binding.money.append(String.valueOf(3));

                    visibleDeleteCancelButton();

                    sendMoney = binding.money.getText().toString();

                    binding.remittanceButton.setBackgroundColor(getResources().getColor(R.color.login_button_first_gradation));
                }
            }
        });
    }

    private void clickMoneyNumber4() {

        binding.moneyNumber4.setOnClickListener(v -> {

            if (isFirstInput) {

                if(binding.accountMoney.getText().toString().equals("0")) {

                    return;
                }
                else {

                    binding.money.setText(String.valueOf(4));

                    isFirstInput = false;

                    visibleDeleteCancelButton();

                    setMoveMoneyCountTitle();

                    sendMoney = binding.money.getText().toString();

                    binding.remittanceButton.setBackgroundColor(getResources().getColor(R.color.login_button_first_gradation));
                }
            }
            else {

                if(binding.accountMoney.getText().toString().equals("0")) {

                    return;
                }
                else {

                    binding.money.append(String.valueOf(4));

                    visibleDeleteCancelButton();

                    sendMoney = binding.money.getText().toString();

                    binding.remittanceButton.setBackgroundColor(getResources().getColor(R.color.login_button_first_gradation));
                }
            }
        });
    }

    private void clickMoneyNumber5() {

        binding.moneyNumber5.setOnClickListener(v -> {

            if (isFirstInput) {

                if(binding.accountMoney.getText().toString().equals("0")) {

                    return;
                }
                else {

                    binding.money.setText(String.valueOf(5));

                    isFirstInput = false;

                    visibleDeleteCancelButton();

                    setMoveMoneyCountTitle();

                    sendMoney = binding.money.getText().toString();

                    binding.remittanceButton.setBackgroundColor(getResources().getColor(R.color.login_button_first_gradation));
                }
            }
            else {

                if(binding.accountMoney.getText().toString().equals("0")) {

                    return;
                }
                else {

                    binding.money.append(String.valueOf(5));

                    visibleDeleteCancelButton();

                    sendMoney = binding.money.getText().toString();

                    binding.remittanceButton.setBackgroundColor(getResources().getColor(R.color.login_button_first_gradation));
                }
            }
        });
    }

    private void clickMoneyNumber6() {

        binding.moneyNumber6.setOnClickListener(v -> {

            if (isFirstInput) {

                if(binding.accountMoney.getText().toString().equals("0")) {

                    return;
                }
                else {

                    binding.money.setText(String.valueOf(6));

                    isFirstInput = false;

                    visibleDeleteCancelButton();

                    setMoveMoneyCountTitle();

                    sendMoney = binding.money.getText().toString();

                    binding.remittanceButton.setBackgroundColor(getResources().getColor(R.color.login_button_first_gradation));
                }
            }
            else {

                if(binding.accountMoney.getText().toString().equals("0")) {

                    return;
                }
                else {

                    binding.money.append(String.valueOf(6));

                    visibleDeleteCancelButton();

                    sendMoney = binding.money.getText().toString();

                    binding.remittanceButton.setBackgroundColor(getResources().getColor(R.color.login_button_first_gradation));
                }
            }
        });
    }

    private void clickMoneyNumber7() {

        binding.moneyNumber7.setOnClickListener(v -> {

            if (isFirstInput) {

                if(binding.accountMoney.getText().toString().equals("0")) {

                    return;
                }
                else {

                    binding.money.setText(String.valueOf(7));

                    isFirstInput = false;

                    visibleDeleteCancelButton();

                    setMoveMoneyCountTitle();

                    sendMoney = binding.money.getText().toString();

                    binding.remittanceButton.setBackgroundColor(getResources().getColor(R.color.login_button_first_gradation));
                }
            }
            else {

                if(binding.accountMoney.getText().toString().equals("0")) {

                    return;
                }
                else {

                    binding.money.append(String.valueOf(7));

                    visibleDeleteCancelButton();

                    sendMoney = binding.money.getText().toString();

                    binding.remittanceButton.setBackgroundColor(getResources().getColor(R.color.login_button_first_gradation));
                }
            }
        });
    }

    private void clickMoneyNumber8() {

        binding.moneyNumber8.setOnClickListener(v -> {

            if (isFirstInput) {

                if(binding.accountMoney.getText().toString().equals("0")) {

                    return;
                }
                else {

                    binding.money.setText(String.valueOf(8));

                    isFirstInput = false;

                    visibleDeleteCancelButton();

                    setMoveMoneyCountTitle();

                    sendMoney = binding.money.getText().toString();

                    binding.remittanceButton.setBackgroundColor(getResources().getColor(R.color.login_button_first_gradation));
                }
            }
            else {

                if(binding.accountMoney.getText().toString().equals("0")) {

                    return;
                }
                else {

                    binding.money.append(String.valueOf(8));

                    visibleDeleteCancelButton();

                    sendMoney = binding.money.getText().toString();

                    binding.remittanceButton.setBackgroundColor(getResources().getColor(R.color.login_button_first_gradation));
                }
            }
        });
    }

    private void clickMoneyNumber9() {

        binding.moneyNumber9.setOnClickListener(v -> {

            if (isFirstInput) {

                if(binding.accountMoney.getText().toString().equals("0")) {

                    return;
                }
                else {

                    binding.money.setText(String.valueOf(9));

                    isFirstInput = false;

                    visibleDeleteCancelButton();

                    setMoveMoneyCountTitle();

                    sendMoney = binding.money.getText().toString();

                    binding.remittanceButton.setBackgroundColor(getResources().getColor(R.color.login_button_first_gradation));
                }
            }
            else {

                if(binding.accountMoney.getText().toString().equals("0")) {

                    return;
                }
                else {

                    binding.money.append(String.valueOf(9));

                    visibleDeleteCancelButton();

                    sendMoney = binding.money.getText().toString();

                    binding.remittanceButton.setBackgroundColor(getResources().getColor(R.color.login_button_first_gradation));
                }
            }
        });
    }

    private void clickCancelButton() {

        binding.cancelButton.setOnClickListener(v -> {

            binding.money.setText(String.valueOf(0));

            isFirstInput = true;

            invisibleDeleteCancelButton();

            resetMoveMoneyCountTitle();

            binding.remittanceButton.setBackgroundColor(getResources().getColor(R.color.remittance_button_off));
        });
    }

    private void clickDeleteButton() {

        binding.deleteButton.setOnClickListener(v -> {

            if (isFirstInput) {

                isFirstInput = true;

                invisibleDeleteCancelButton();

                resetMoveMoneyCountTitle();

                binding.remittanceButton.setBackgroundColor(getResources().getColor(R.color.remittance_button_off));
            }
            else {

                if (binding.money.getText().toString().length() == 1 && binding.money.getText().toString().equals("0")) {

                    binding.money.setText(String.valueOf(0));

                    isFirstInput = true;

                    invisibleDeleteCancelButton();

                    resetMoveMoneyCountTitle();

                    binding.remittanceButton.setBackgroundColor(getResources().getColor(R.color.login_button_first_gradation));
                }
                else if (binding.money.getText().toString().length() == 1 && !(binding.money.getText().toString().equals("0"))) {

                    binding.money.setText(String.valueOf(0));

                    isFirstInput = true;

                    invisibleDeleteCancelButton();

                    resetMoveMoneyCountTitle();

                    binding.remittanceButton.setBackgroundColor(getResources().getColor(R.color.login_button_first_gradation));
                }
                else {

                    String moneySet = binding.money.getText().toString().substring(0, binding.money.getText().toString().length() - 1);

                    binding.money.setText(moneySet);

                    isFirstInput = false;

                    sendMoney = binding.money.getText().toString();

                    binding.remittanceButton.setBackgroundColor(getResources().getColor(R.color.login_button_first_gradation));
                }
            }
        });
    }

    private void setMoveMoneyCountTitle() {

        binding.money.setX(binding.money.getX() + 42);
        binding.moneyTitle.setX(binding.moneyTitle.getX() + 42);
    }

    private void resetMoveMoneyCountTitle() {

        binding.money.setX(binding.money.getX() - 42);
        binding.moneyTitle.setX(binding.moneyTitle.getX() - 42);
    }

    @Override
    protected int layoutId() {

        return R.layout.lookup_send_money_activity;
    }
}
