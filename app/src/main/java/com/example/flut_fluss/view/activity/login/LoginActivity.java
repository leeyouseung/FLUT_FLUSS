package com.example.flut_fluss.view.activity.login;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.widget.Toast;

import androidx.lifecycle.ViewModelProviders;

import com.example.flut_fluss.R;
import com.example.flut_fluss.base.BaseActivity;
import com.example.flut_fluss.manager.Token;
import com.example.flut_fluss.databinding.LoginActivityBinding;
import com.example.flut_fluss.manager.factory.ViewModelFactory;
import com.example.flut_fluss.model.User;
import com.example.flut_fluss.network.request.LoginRequest;
import com.example.flut_fluss.view.activity.main.MainActivity;
import com.example.flut_fluss.view.activity.singup.SignUpActivity;
import com.example.flut_fluss.viewmodel.LoginViewModel;

public class LoginActivity extends BaseActivity<LoginActivityBinding> {

    private LoginViewModel loginViewModel;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initViewModel();

        initView();

        initData();

        loginViewModel.getData().observe(this, login -> {

            new Token(this).setToken(login.getToken().getToken());
//            new CurrentUser(this, "flut_database.db", null, 2).insert(login.getUser());
            User user = new User();

//            loginViewModel.insert(user);

            if(login.getUser().getId().isEmpty()) {

                loginViewModel.getErrorMessage().observe(this, message -> Toast.makeText(this, message, Toast.LENGTH_LONG).show());
            }
            else {

                Toast.makeText(this, "잠시만 기다려주세요", Toast.LENGTH_SHORT).show();

                startActivity(new Intent(this, MainActivity.class));
            }
        });

        event();
    }

    private void initViewModel() {

        loginViewModel = ViewModelProviders.of(this, new ViewModelFactory(this)).get(LoginViewModel.class);
    }

    private void initView() {

        binding.materialCardView.setBackgroundResource(R.drawable.background_login);
    }

    private void initData() {

    }

    private void event() {

        clickEvent();
    }

    private void clickEvent() {

//        clickBlindButton();
        clickLoginButton();
        clickSignUpButton();
    }

//    private void clickBlindButton() {
//
//        binding.blindButton.setOnClickListener(v -> {
//
//            if (checkBlind) {
//
//                binding.blindButton.setImageResource(R.drawable.ic_blind);
//                binding.passwordText.setTransformationMethod(PasswordTransformationMethod.getInstance());
//
//                checkBlind = false;
//            }
//            else {
//
//                binding.blindButton.setImageResource(R.drawable.ic_blind_check);
//                binding.passwordText.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
//
//                checkBlind = true;
//            }
//        });
//    }

    private void clickLoginButton() {

        binding.loginButton.setOnClickListener(v -> {

            if (binding.idText.getText().toString().isEmpty()) {

                Toast.makeText(this, "아이디를 입력해 주세요", Toast.LENGTH_SHORT).show();
            }
            else if (binding.pwText.getText().toString().isEmpty()) {

                Toast.makeText(this, "비밀번호를 입력해 주세요", Toast.LENGTH_SHORT).show();
            }
            else {

                loginViewModel.login(new LoginRequest(binding.idText.getText().toString(), binding.pwText.getText().toString()));
            }
        });
    }

    private void clickSignUpButton() {

        binding.signUpButton.setOnClickListener(v -> {

            startActivity(new Intent(getApplicationContext(), SignUpActivity.class));
        });
    }

    @Override
    protected int layoutId() {

        return R.layout.login_activity;
    }
}
