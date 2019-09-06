package com.example.flut_fluss.view.activity.singup;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.lifecycle.ViewModelProviders;

import com.example.flut_fluss.R;
import com.example.flut_fluss.base.BaseActivity;
import com.example.flut_fluss.databinding.SignupActivityBinding;
import com.example.flut_fluss.manager.factory.ViewModelFactory;
import com.example.flut_fluss.network.request.SignUpRequest;
import com.example.flut_fluss.view.activity.login.LoginActivity;
import com.example.flut_fluss.viewmodel.SignUpViewModel;

public class SignUpActivity extends BaseActivity<SignupActivityBinding> {

    private SignUpViewModel signUpViewModel;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initViewModel();

        initData();

        signUpViewModel.getSuccessMessage().observe(this, message -> {

            Toast.makeText(this, (String) message, Toast.LENGTH_LONG).show();

            startActivity(new Intent(getApplicationContext(), LoginActivity.class));
        });

        signUpViewModel.getErrorMessage().observe(this, message -> Toast.makeText(this, (String) message, Toast.LENGTH_SHORT).show());

        event();
    }

    private void initViewModel() {

        signUpViewModel = ViewModelProviders.of(this, new ViewModelFactory(this)).get(SignUpViewModel.class);
    }

    private void initData() {

    }

    private void event() {

        clickEvent();
    }

    private void clickEvent() {

        binding.registerButton.setOnClickListener(v -> {

            if(binding.idText.getText().toString().isEmpty() || binding.passwordText.getText().toString().isEmpty() ||
                    binding.passwordCheckText.getText().toString().isEmpty() || binding.nameText.getText().toString().isEmpty() ||
                    binding.phoneNumberText.getText().toString().isEmpty() || binding.bankAccountText.getText().toString().isEmpty() ||
                    binding.flutAccountText.getText().toString().isEmpty()) {

                Toast.makeText(getApplicationContext(), "빈칸 없이 입력해 주세요", Toast.LENGTH_SHORT).show();

                return;
            }
            if(!(binding.passwordText.getText().toString().equals(binding.passwordCheckText.getText().toString()))) {

                Toast.makeText(getApplicationContext(), "비밀번호가 서로 다릅니다", Toast.LENGTH_SHORT).show();

                return;
            }

            try {

                signUpViewModel.signup(new SignUpRequest(
                        binding.idText.getText().toString(), binding.passwordText.getText().toString(), binding.nameText.getText().toString(),
                        binding.phoneNumberText.getText().toString(), binding.bankAccountText.getText().toString(),
                        binding.flutAccountText.getText().toString()));
            }
            catch (NullPointerException e) {

                Toast.makeText(this, "회원가입을 위한 요소가 다 포함되지 않았습니다.", Toast.LENGTH_SHORT).show();

                e.printStackTrace();
            }
        });
    }

    @Override
    protected int layoutId() {

        return R.layout.signup_activity;
    }
}
