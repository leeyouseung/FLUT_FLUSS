package com.example.flut_fluss.view.fragment;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;

import android.widget.Toast;

import com.example.flut_fluss.R;
import com.example.flut_fluss.base.BaseFragment;
import com.example.flut_fluss.databinding.SelectMoneyListFragmentBinding;
import com.example.flut_fluss.view.activity.ShowAccountActivity;
import com.example.flut_fluss.view.activity.ShowCardActivity;

public class SelectMoneyListFragment extends BaseFragment<SelectMoneyListFragmentBinding> {

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        initData();

        event();
    }

    private void initData() {

    }

    private void event() {

        clickEvent();
    }

    private void clickEvent() {

        clickAccountLayout();
        clickCardLayout();
        clickAddKindButton();
    }

    private void clickAccountLayout() {

        binding.accountLayout.setOnClickListener(v -> {

            startActivity(new Intent(getContext(), ShowAccountActivity.class));
        });
    }

    private void clickCardLayout() {

        binding.cardLayout.setOnClickListener(v -> {

            startActivity(new Intent(getContext(), ShowCardActivity.class));
        });
    }

    private void clickAddKindButton() {

        binding.addKindButton.setOnClickListener(v -> {

            final String[] items = new String[] {

                    "계좌",
                    "카드"
            };

            final int[] selectedIndex = {0};

            AlertDialog.Builder dialog = new AlertDialog.Builder(getContext());

            dialog.setTitle("추가");
            dialog.setMessage("항목");

            dialog.setSingleChoiceItems(items, 0, new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface dialog, int whichButton) {

                        // 각 리스트를 선택했을때
                        Toast.makeText(getContext(), selectedIndex[whichButton] + "", Toast.LENGTH_SHORT).show();

                        selectedIndex[0] = whichButton;
                    }
                }).setPositiveButton("Ok", new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface dialog, int whichButton) {

                        // OK 버튼 클릭시 , 여기서 선택한 값을 메인 Activity 로 넘기면 된다.
                    }
                }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface dialog, int whichButton) {

                        // Cancel 버튼 클릭시
                        dialog.dismiss();
                    }
                });

            dialog.create();
            dialog.show();
        });
    }

    @Override
    protected int layoutId() {

        return R.layout.select_money_list_fragment;
    }
}
