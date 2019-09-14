package com.example.flut_fluss.view.activity.account_list.my_account.send_money_finger;

import android.app.KeyguardManager;
import android.content.Intent;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Bundle;

import com.example.flut_fluss.R;
import com.example.flut_fluss.base.BaseActivity;
import com.example.flut_fluss.databinding.SendCheckFingerPrintActivityBinding;
import com.example.flut_fluss.view.activity.account_list.my_account.send_money_password.SendCheckPasswordActivity;

import java.security.KeyStore;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;

public class SendCheckFingerPrintActivity extends BaseActivity<SendCheckFingerPrintActivityBinding> {

    @Override
    protected int layoutId() {

        return R.layout.send_check_finger_print_activity;
    }

    private KeyStore keyStore;
    private static final String KEY_NAME = "example_key";
    private Cipher cipher;
    private FingerprintManager fingerprintManager;
    private KeyguardManager keyguardManager;
    private KeyGenerator keyGenerator = null;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initViewModel();

        initData();

        event();
    }

    private void initViewModel() {

    }

    private void initData() {

    }

    private void event() {

        clickEvent();
    }

    private void clickEvent() {

        clickCancelButton();
    }

    private void clickCancelButton() {

        binding.cancelButton.setOnClickListener(v -> {

            startActivity(new Intent(getApplicationContext(), SendCheckPasswordActivity.class));
        });
    }
}
