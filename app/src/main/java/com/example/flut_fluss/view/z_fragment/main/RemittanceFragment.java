package com.example.flut_fluss.view.z_fragment.main;

import android.os.Bundle;

import androidx.annotation.Nullable;

import android.view.View;
import android.widget.LinearLayout;

import com.example.flut_fluss.R;
import com.example.flut_fluss.base.BaseFragment;
import com.example.flut_fluss.databinding.RemittanceFragmentBinding;

public class RemittanceFragment extends BaseFragment<RemittanceFragmentBinding> {

    private LinearLayout menuNavigationLinearLayout;
    private LinearLayout moneySendLinearLayout;

    private boolean isFirstInput = true;

    private int setOnCreateMoney = 0;

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        initData();

        event();
    }

    private void initData() {

        menuNavigationLinearLayout = getActivity().findViewById(R.id.menu_navigation_linearLayout);
        moneySendLinearLayout = getActivity().findViewById(R.id.money_send_linearLayout);

        menuNavigationLinearLayout.setVisibility(View.VISIBLE);
        moneySendLinearLayout.setVisibility(View.INVISIBLE);

        binding.money.setText(String.valueOf(setOnCreateMoney));
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

    private void visibleMenuLayout() {

        menuNavigationLinearLayout.setVisibility(View.VISIBLE);
        moneySendLinearLayout.setVisibility(View.INVISIBLE);
    }

    private void visibleSendLayout() {

        menuNavigationLinearLayout.setVisibility(View.INVISIBLE);
        moneySendLinearLayout.setVisibility(View.VISIBLE);
    }

    private void clickEvent() {

        clickMoneyNumber0(0);
        clickMoneyNumber1(1);
        clickMoneyNumber2(2);
        clickMoneyNumber3(3);
        clickMoneyNumber4(4);
        clickMoneyNumber5(5);
        clickMoneyNumber6(6);
        clickMoneyNumber7(7);
        clickMoneyNumber8(8);
        clickMoneyNumber9(9);
        clickCancelButton(0);
        clickDeleteButton(0);
        clickQrCameraButton();
        clickNotificationButton();
    }

    private void clickMoneyNumber0(int number) {

        binding.moneyNumber0.setOnClickListener(v -> {

            if (isFirstInput && binding.money.getText().toString().equals("0")) {

                visibleMenuLayout();
            }
            else {

                binding.money.append(String.valueOf(number));

                visibleSendLayout();
            }
        });
    }

    private void clickMoneyNumber1(int number) {

        binding.moneyNumber1.setOnClickListener(v -> {

            if (isFirstInput) {

                binding.money.setText(String.valueOf(number));

                isFirstInput = false;

                visibleSendLayout();

                visibleDeleteCancelButton();

                setMoveMoneyCountTitle();
            }
            else {

                binding.money.append(String.valueOf(number));

                visibleSendLayout();

                visibleDeleteCancelButton();
            }
        });
    }


    private void clickMoneyNumber2(int number) {

        binding.moneyNumber2.setOnClickListener(v -> {

            if (isFirstInput) {

                binding.money.setText(String.valueOf(number));

                isFirstInput = false;

                visibleSendLayout();

                visibleDeleteCancelButton();

                setMoveMoneyCountTitle();
            }
            else {

                binding.money.append(String.valueOf(number));

                visibleSendLayout();

                visibleDeleteCancelButton();
            }
        });
    }

    private void clickMoneyNumber3(int number) {

        binding.moneyNumber3.setOnClickListener(v -> {

            if (isFirstInput) {

                binding.money.setText(String.valueOf(number));

                isFirstInput = false;

                visibleSendLayout();

                visibleDeleteCancelButton();

                setMoveMoneyCountTitle();
            }
            else {

                binding.money.append(String.valueOf(number));

                visibleSendLayout();

                visibleDeleteCancelButton();
            }
        });
    }

    private void clickMoneyNumber4(int number) {

        binding.moneyNumber4.setOnClickListener(v -> {

            if (isFirstInput) {

                binding.money.setText(String.valueOf(number));

                isFirstInput = false;

                visibleSendLayout();

                visibleDeleteCancelButton();

                setMoveMoneyCountTitle();
            }
            else {

                binding.money.append(String.valueOf(number));

                visibleSendLayout();

                visibleDeleteCancelButton();
            }
        });
    }

    private void clickMoneyNumber5(int number) {

        binding.moneyNumber5.setOnClickListener(v -> {

            if (isFirstInput) {

                binding.money.setText(String.valueOf(number));

                isFirstInput = false;

                visibleSendLayout();

                visibleDeleteCancelButton();

                setMoveMoneyCountTitle();
            }
            else {

                binding.money.append(String.valueOf(number));

                visibleSendLayout();

                visibleDeleteCancelButton();
            }
        });
    }

    private void clickMoneyNumber6(int number) {

        binding.moneyNumber6.setOnClickListener(v -> {

            if (isFirstInput) {

                binding.money.setText(String.valueOf(number));

                isFirstInput = false;

                visibleSendLayout();

                visibleDeleteCancelButton();

                setMoveMoneyCountTitle();
            }
            else {

                binding.money.append(String.valueOf(number));

                visibleSendLayout();

                visibleDeleteCancelButton();
            }
        });
    }

    private void clickMoneyNumber7(int number) {

        binding.moneyNumber7.setOnClickListener(v -> {

            if (isFirstInput) {

                binding.money.setText(String.valueOf(number));

                isFirstInput = false;

                visibleSendLayout();

                visibleDeleteCancelButton();

                setMoveMoneyCountTitle();
            }
            else {

                binding.money.append(String.valueOf(number));

                visibleSendLayout();

                visibleDeleteCancelButton();
            }
        });
    }

    private void clickMoneyNumber8(int number) {

        binding.moneyNumber8.setOnClickListener(v -> {

            if (isFirstInput) {

                binding.money.setText(String.valueOf(number));

                isFirstInput = false;

                visibleSendLayout();

                visibleDeleteCancelButton();

                setMoveMoneyCountTitle();
            }
            else {

                binding.money.append(String.valueOf(number));

                visibleSendLayout();

                visibleDeleteCancelButton();
            }
        });
    }

    private void clickMoneyNumber9(int number) {

        binding.moneyNumber9.setOnClickListener(v -> {

            if (isFirstInput) {

                binding.money.setText(String.valueOf(number));

                isFirstInput = false;

                visibleSendLayout();

                visibleDeleteCancelButton();

                setMoveMoneyCountTitle();
            }
            else {

                binding.money.append(String.valueOf(number));

                visibleSendLayout();

                visibleDeleteCancelButton();
            }
        });
    }

    private void clickCancelButton(int number) {

        binding.cancelButton.setOnClickListener(v -> {

            binding.money.setText(String.valueOf(number));

            isFirstInput = true;

            visibleMenuLayout();

            invisibleDeleteCancelButton();

            resetMoveMoneyCountTitle();
        });
    }

    private void clickDeleteButton(int number) {

        binding.deleteButton.setOnClickListener(v -> {

            if (isFirstInput) {

                visibleMenuLayout();

                isFirstInput = true;

                invisibleDeleteCancelButton();

                resetMoveMoneyCountTitle();
            }
            else {

                if (binding.money.getText().toString().length() == 1 && binding.money.getText().toString().equals("0")) {

                    binding.money.setText(String.valueOf(number));

                    isFirstInput = true;

                    invisibleDeleteCancelButton();

                    resetMoveMoneyCountTitle();
                }
                else if (binding.money.getText().toString().length() == 1 && !(binding.money.getText().toString().equals("0"))) {

                    binding.money.setText(String.valueOf(number));

                    isFirstInput = true;

                    visibleMenuLayout();

                    invisibleDeleteCancelButton();

                    resetMoveMoneyCountTitle();
                }
                else {

                    String moneySet = binding.money.getText().toString().substring(0, binding.money.getText().toString().length() - 1);

                    binding.money.setText(moneySet);

                    isFirstInput = false;

                    visibleSendLayout();
                }
            }
        });
    }

    private void clickQrCameraButton() {

        binding.qrCameraButton.setOnClickListener(v -> {

        });
    }

    private void clickNotificationButton() {

        binding.notificationButton.setOnClickListener(v -> {

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

        return R.layout.remittance_fragment;
    }
}