package com.example.flut_fluss.view.activity.account_list.friend_account;

import android.os.Bundle;
import android.view.View;

import com.example.flut_fluss.R;
import com.example.flut_fluss.base.BaseActivity;
import com.example.flut_fluss.databinding.SendFriendAccountActivityBinding;

public class SendFriendAccountActivity extends BaseActivity<SendFriendAccountActivityBinding> {

    @Override
    protected int layoutId() {

        return R.layout.send_friend_account_activity;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initData();

        event();
    }

    private void initData() {

    }

    private void event() {

        clickEvent();
    }

    private void clickEvent() {

        clickMyAccountLayout();
        clickMyBankLayout();
    }

    private void clickMyAccountLayout() {

        binding.myAccountLayout.setOnClickListener(v -> {

            binding.pqyCheck1.setVisibility(View.VISIBLE);
            binding.pqyCheck2.setVisibility(View.INVISIBLE);
        });
    }

    private void clickMyBankLayout() {

        binding.myBankLayout.setOnClickListener(v -> {

            binding.pqyCheck1.setVisibility(View.INVISIBLE);
            binding.pqyCheck2.setVisibility(View.VISIBLE);
        });
    }
}
