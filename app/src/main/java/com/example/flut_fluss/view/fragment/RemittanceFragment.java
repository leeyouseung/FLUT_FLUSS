package com.example.flut_fluss.view.fragment;

import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.flut_fluss.R;
import com.example.flut_fluss.databinding.RemittanceFragmentBinding;

import java.util.Objects;

public class RemittanceFragment extends Fragment {

    private RemittanceFragmentBinding binding;

    public TextView money;

    private boolean isFirstInput = true;
    private int resultNumber = 0;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public RemittanceFragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static RemittanceFragment newInstance(String param1, String param2) {
        RemittanceFragment fragment = new RemittanceFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.remittance_fragment, container, false);

        return binding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        initData();

        setting();

        event();
    }

    private void initData() {

    }

    private void setting() {

        binding.money.setText(String.valueOf(resultNumber));
    }

    private void event() {

        clickEvent();

        setMoveMoneyCountTitle();
    }

    private void clickEvent() {

        clickMoneyNumber0();
        clickMoneyNumber1();
        clickMoneyNumber2();
        clickMoneyNumber3();
        clickMoneyNumber4();
        clickMoneyNumber5();
        clickMoneyNumber5();
        clickMoneyNumber6();
        clickMoneyNumber7();
        clickMoneyNumber8();
        clickMoneyNumber9();
        clickCancelButton();
        clickDeleteButton();
        clickQrCameraButton();
    }

    private void clickMoneyNumber0() {

        binding.moneyNumber0.setOnClickListener(v -> {

            resultNumber = 0;

            if(isFirstInput && binding.money.getText().toString().equals("0")) {

                // Do Nothing
            }
            else {

                binding.money.append(String.valueOf(resultNumber));
            }
        });
    }

    private void clickMoneyNumber1() {

        binding.moneyNumber1.setOnClickListener(v -> {

            resultNumber = 1;

            if(isFirstInput) {

                binding.money.setText(String.valueOf(resultNumber));

                isFirstInput = false;
            }
            else {

                binding.money.append(String.valueOf(resultNumber));
            }
        });
    }


    private void clickMoneyNumber2() {

        binding.moneyNumber2.setOnClickListener(v -> {

            resultNumber = 2;

            if(isFirstInput) {

                binding.money.setText(String.valueOf(resultNumber));

                isFirstInput = false;
            }
            else {

                binding.money.append(String.valueOf(resultNumber));
            }
        });
    }

    private void clickMoneyNumber3() {

        binding.moneyNumber3.setOnClickListener(v -> {

            resultNumber = 3;

            if(isFirstInput) {

                binding.money.setText(String.valueOf(resultNumber));

                isFirstInput = false;
            }
            else {

                binding.money.append(String.valueOf(resultNumber));
            }
        });
    }

    private void clickMoneyNumber4() {

        binding.moneyNumber4.setOnClickListener(v -> {

            resultNumber = 4;

            if(isFirstInput) {

                binding.money.setText(String.valueOf(resultNumber));

                isFirstInput = false;
            }
            else {

                binding.money.append(String.valueOf(resultNumber));
            }
        });
    }

    private void clickMoneyNumber5() {

        binding.moneyNumber5.setOnClickListener(v -> {

            resultNumber = 5;

            if(isFirstInput) {

                binding.money.setText(String.valueOf(resultNumber));

                isFirstInput = false;
            }
            else {

                binding.money.append(String.valueOf(resultNumber));
            }
        });
    }

    private void clickMoneyNumber6() {

        binding.moneyNumber6.setOnClickListener(v -> {

            resultNumber = 6;

            if(isFirstInput) {

                binding.money.setText(String.valueOf(resultNumber));

                isFirstInput = false;
            }
            else {

                binding.money.append(String.valueOf(resultNumber));
            }
        });
    }

    private void clickMoneyNumber7() {

        binding.moneyNumber7.setOnClickListener(v -> {

            resultNumber = 7;

            if(isFirstInput) {

                binding.money.setText(String.valueOf(resultNumber));

                isFirstInput = false;
            }
            else {

                binding.money.append(String.valueOf(resultNumber));
            }
        });
    }

    private void clickMoneyNumber8() {

        binding.moneyNumber8.setOnClickListener(v -> {

            resultNumber = 8;

            if(isFirstInput) {

                binding.money.setText(String.valueOf(resultNumber));

                isFirstInput = false;
            }
            else {

                binding.money.append(String.valueOf(resultNumber));
            }
        });
    }

    private void clickMoneyNumber9() {

         binding.moneyNumber9.setOnClickListener(v -> {

             resultNumber = 9;

             if(isFirstInput) {

                 binding.money.setText(String.valueOf(resultNumber));

                 isFirstInput = false;
             }
             else {

                 binding.money.append(String.valueOf(resultNumber));
             }
         });
    }

    private void clickCancelButton() {

        binding.cancelButton.setOnClickListener(v -> {

            resultNumber = 0;

            binding.money.setText(String.valueOf(resultNumber));

            isFirstInput = true;
        });
    }

    private void clickDeleteButton() {

        binding.deleteButton.setOnClickListener(v -> {

            resultNumber = 0;

            if(isFirstInput) {

                Toast.makeText(getContext(), "이미 0원 입니다.", Toast.LENGTH_SHORT).show();

                isFirstInput = true;
            }
            else {

                if(binding.money.getText().toString().length() == 1) {

                    binding.money.setText(String.valueOf(resultNumber));

                    isFirstInput = true;
                }
                else {

                    binding.money.getText().toString().substring(0, binding.money.getText().toString().length() - 1);

                    binding.money.setText(deleteMoney(binding.money.getText().toString()));

                    isFirstInput = false;
                }
            }
        });
    }

    private String deleteMoney(String sMoney) {

        if (sMoney.length() > 0 && sMoney.charAt(sMoney.length() - 1) == 'x') {

            sMoney = sMoney.substring(0, sMoney.length() - 1);
        }

        return sMoney;
    }

    private void clickQrCameraButton() {

        binding.qrCameraButton.setOnClickListener(v -> {

            Toast.makeText(getContext(), "qr_camera_button_onClicked", Toast.LENGTH_LONG).show();
        });
    }

    private void setMoveMoneyCountTitle() {


    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
