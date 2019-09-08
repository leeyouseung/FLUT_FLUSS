package com.example.flut_fluss.view.z_fragment.main;

import android.os.Bundle;

import androidx.annotation.Nullable;

import android.view.View;
import android.widget.LinearLayout;

import com.example.flut_fluss.R;
import com.example.flut_fluss.base.BaseFragment;
import com.example.flut_fluss.databinding.RemittanceFragmentBinding;

public class RemittanceFragment extends BaseFragment<RemittanceFragmentBinding> {

    @Override
    protected int layoutId() {

        return R.layout.remittance_fragment;
    }

    public String sendMoney = "0";

    private LinearLayout menuNavigationLinearLayout;
    private LinearLayout moneySendLinearLayout;

    private boolean isFirstInput = true;

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        initData();

        initMenuSet();

        event();
    }

    private void initData() {

        binding.money.setText(String.valueOf(0));
    }

    private void initMenuSet() {

        menuNavigationLinearLayout = getActivity().findViewById(R.id.menu_navigation_linearLayout);
        moneySendLinearLayout = getActivity().findViewById(R.id.money_send_linearLayout);

        menuNavigationLinearLayout.setVisibility(View.VISIBLE);
        moneySendLinearLayout.setVisibility(View.INVISIBLE);
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
        clickQrCameraButton();
        clickNotificationButton();
    }

    private void clickMoneyNumber0() {

        binding.moneyNumber0.setOnClickListener(v -> {

            if (isFirstInput && binding.money.getText().toString().equals("0")) {

                visibleMenuLayout();
            }
            else {

                binding.money.append(String.valueOf(0));

                sendMoney = binding.money.getText().toString();

                visibleSendLayout();
            }
        });
    }

    private void clickMoneyNumber1() {

        binding.moneyNumber1.setOnClickListener(v -> {

            if (isFirstInput) {

                binding.money.setText(String.valueOf(1));

                isFirstInput = false;

                visibleSendLayout();

                visibleDeleteCancelButton();

                setMoveMoneyCountTitle();

                sendMoney = binding.money.getText().toString();
            }
            else {

                binding.money.append(String.valueOf(1));

                visibleSendLayout();

                visibleDeleteCancelButton();

                sendMoney = binding.money.getText().toString();
            }
        });
    }


    private void clickMoneyNumber2() {

        binding.moneyNumber2.setOnClickListener(v -> {

            if (isFirstInput) {

                binding.money.setText(String.valueOf(2));

                isFirstInput = false;

                visibleSendLayout();

                visibleDeleteCancelButton();

                setMoveMoneyCountTitle();

                sendMoney = binding.money.getText().toString();
            }
            else {

                binding.money.append(String.valueOf(2));

                visibleSendLayout();

                visibleDeleteCancelButton();

                sendMoney = binding.money.getText().toString();
            }
        });
    }

    private void clickMoneyNumber3() {

        binding.moneyNumber3.setOnClickListener(v -> {

            if (isFirstInput) {

                binding.money.setText(String.valueOf(3));

                isFirstInput = false;

                visibleSendLayout();

                visibleDeleteCancelButton();

                setMoveMoneyCountTitle();

                sendMoney = binding.money.getText().toString();
            }
            else {

                binding.money.append(String.valueOf(3));

                visibleSendLayout();

                visibleDeleteCancelButton();

                sendMoney = binding.money.getText().toString();
            }
        });
    }

    private void clickMoneyNumber4() {

        binding.moneyNumber4.setOnClickListener(v -> {

            if (isFirstInput) {

                binding.money.setText(String.valueOf(4));

                isFirstInput = false;

                visibleSendLayout();

                visibleDeleteCancelButton();

                setMoveMoneyCountTitle();

                sendMoney = binding.money.getText().toString();
            }
            else {

                binding.money.append(String.valueOf(4));

                visibleSendLayout();

                visibleDeleteCancelButton();

                sendMoney = binding.money.getText().toString();
            }
        });
    }

    private void clickMoneyNumber5() {

        binding.moneyNumber5.setOnClickListener(v -> {

            if (isFirstInput) {

                binding.money.setText(String.valueOf(5));

                isFirstInput = false;

                visibleSendLayout();

                visibleDeleteCancelButton();

                setMoveMoneyCountTitle();

                sendMoney = binding.money.getText().toString();
            }
            else {

                binding.money.append(String.valueOf(5));

                visibleSendLayout();

                visibleDeleteCancelButton();

                sendMoney = binding.money.getText().toString();
            }
        });
    }

    private void clickMoneyNumber6() {

        binding.moneyNumber6.setOnClickListener(v -> {

            if (isFirstInput) {

                binding.money.setText(String.valueOf(6));

                isFirstInput = false;

                visibleSendLayout();

                visibleDeleteCancelButton();

                setMoveMoneyCountTitle();

                sendMoney = binding.money.getText().toString();
            }
            else {

                binding.money.append(String.valueOf(6));

                visibleSendLayout();

                visibleDeleteCancelButton();

                sendMoney = binding.money.getText().toString();
            }
        });
    }

    private void clickMoneyNumber7() {

        binding.moneyNumber7.setOnClickListener(v -> {

            if (isFirstInput) {

                binding.money.setText(String.valueOf(7));

                isFirstInput = false;

                visibleSendLayout();

                visibleDeleteCancelButton();

                setMoveMoneyCountTitle();

                sendMoney = binding.money.getText().toString();
            }
            else {

                binding.money.append(String.valueOf(7));

                visibleSendLayout();

                visibleDeleteCancelButton();

                sendMoney = binding.money.getText().toString();
            }
        });
    }

    private void clickMoneyNumber8() {

        binding.moneyNumber8.setOnClickListener(v -> {

            if (isFirstInput) {

                binding.money.setText(String.valueOf(8));

                isFirstInput = false;

                visibleSendLayout();

                visibleDeleteCancelButton();

                setMoveMoneyCountTitle();

                sendMoney = binding.money.getText().toString();
            }
            else {

                binding.money.append(String.valueOf(8));

                visibleSendLayout();

                visibleDeleteCancelButton();

                sendMoney = binding.money.getText().toString();
            }
        });
    }

    private void clickMoneyNumber9() {

        binding.moneyNumber9.setOnClickListener(v -> {

            if (isFirstInput) {

                binding.money.setText(String.valueOf(9));

                isFirstInput = false;

                visibleSendLayout();

                visibleDeleteCancelButton();

                setMoveMoneyCountTitle();

                sendMoney = binding.money.getText().toString();
            }
            else {

                binding.money.append(String.valueOf(9));

                visibleSendLayout();

                visibleDeleteCancelButton();

                sendMoney = binding.money.getText().toString();
            }
        });
    }

    private void clickCancelButton() {

        binding.cancelButton.setOnClickListener(v -> {

            binding.money.setText(String.valueOf(0));

            isFirstInput = true;

            visibleMenuLayout();

            invisibleDeleteCancelButton();

            resetMoveMoneyCountTitle();
        });
    }

    private void clickDeleteButton() {

        binding.deleteButton.setOnClickListener(v -> {

            if (isFirstInput) {

                visibleMenuLayout();

                isFirstInput = true;

                invisibleDeleteCancelButton();

                resetMoveMoneyCountTitle();
            }
            else {

                if (binding.money.getText().toString().length() == 1 && binding.money.getText().toString().equals("0")) {

                    binding.money.setText(String.valueOf(0));

                    isFirstInput = true;

                    invisibleDeleteCancelButton();

                    resetMoveMoneyCountTitle();
                }
                else if (binding.money.getText().toString().length() == 1 && !(binding.money.getText().toString().equals("0"))) {

                    binding.money.setText(String.valueOf(0));

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

                    sendMoney = binding.money.getText().toString();
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
}