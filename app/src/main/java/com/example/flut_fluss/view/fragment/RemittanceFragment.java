package com.example.flut_fluss.view.fragment;

import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.flut_fluss.R;
import com.example.flut_fluss.databinding.RemittanceFragmentBinding;

public class RemittanceFragment extends Fragment {

    RemittanceFragmentBinding binding;

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

        event();

        setting();
    }

    private void setting() {

        binding.money.setText("0");
    }

    private void event() {

        clickEvent();
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
    }

    private void clickMoneyNumber0() {

        if(binding.money.toString().equals("0")) {

            return;
        }
        else {

            binding.money.setText("0");
        }
    }

    private void clickMoneyNumber1() {

        binding.money.setText("1");
    }


    private void clickMoneyNumber2() {

        binding.money.setText("2");
    }

    private void clickMoneyNumber3() {

        binding.money.setText("3");
    }

    private void clickMoneyNumber4() {

        binding.money.setText("4");
    }

    private void clickMoneyNumber5() {

        binding.money.setText("5");
    }

    private void clickMoneyNumber6() {

        binding.money.setText("6");
    }

    private void clickMoneyNumber7() {

        binding.money.setText("7");
    }

    private void clickMoneyNumber8() {

        binding.money.setText("8");
    }

    private void clickMoneyNumber9() {

        binding.money.setText("9");
    }

    private void clickCancelButton() {

        binding.money.setText("0");
    }

    private void clickDeleteButton() {

        // TODO
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
