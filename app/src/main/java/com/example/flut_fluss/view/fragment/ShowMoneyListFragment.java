package com.example.flut_fluss.view.fragment;

import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.flut_fluss.R;
import com.example.flut_fluss.data.Card;
import com.example.flut_fluss.databinding.ShowMoneyListFragmentBinding;
import com.example.flut_fluss.view.activity.MainActivity;
import com.example.flut_fluss.widget.recyclerview.adapter.ShowMoneyListAdapter;

import java.util.ArrayList;
import java.util.List;

public class ShowMoneyListFragment extends Fragment {

    private ShowMoneyListFragmentBinding binding;

    private List<Card> cardList = new ArrayList<>();

    private ShowMoneyListAdapter showMoneyListAdapter;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public ShowMoneyListFragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static ShowMoneyListFragment newInstance(String param1, String param2) {
        ShowMoneyListFragment fragment = new ShowMoneyListFragment();
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
        binding = DataBindingUtil.inflate(inflater, R.layout.show_money_list_fragment, container, false);

        return binding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        initData();

        event();
    }

    private void initData() {

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());

        binding.showMoneyRecyclerView.setLayoutManager(linearLayoutManager);

        showMoneyListAdapter = new ShowMoneyListAdapter(cardList, getContext());

        binding.showMoneyRecyclerView.setAdapter(showMoneyListAdapter);
    }

    private void event() {

        clickEvent();
    }

    private void clickEvent() {

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
