package com.example.flut_fluss.view.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.widget.Toast;

import com.example.flut_fluss.R;
import com.example.flut_fluss.databinding.LoginActivityBinding;

public class LoginActivity extends AppCompatActivity {

    LoginActivityBinding binding;

    private boolean checkBlind = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.login_activity);

        initData();

        event();
    }

    private void initData() {

    }

    private void event() {

        clickEvent();
    }

    private void clickEvent() {

        clickPasswordClearButton();
        clickBlindButton();
        clickLoginButton();
    }

    private void clickPasswordClearButton() {

        binding.pwClearButton.setOnClickListener(v -> binding.passwordText.setText(""));
    }

    private void clickBlindButton() {

        binding.blindButton.setOnClickListener(v -> {

            if (checkBlind) {

                binding.blindButton.setImageResource(R.drawable.ic_blind);
                binding.passwordText.setTransformationMethod(PasswordTransformationMethod.getInstance());

                checkBlind = false;
            }
            else {

                binding.blindButton.setImageResource(R.drawable.ic_blind_check);
                binding.passwordText.setTransformationMethod(HideReturnsTransformationMethod.getInstance());

                checkBlind = true;
            }
        });
    }

    private void clickLoginButton() {

        binding.loginButton.setOnClickListener(v -> {

            if (binding.idText.getText().toString().isEmpty()) {

                Toast.makeText(this,"아이디를 입력해주세요",Toast.LENGTH_SHORT).show();

                return;
            }
            if (binding.passwordText.getText().toString().isEmpty()) {

                Toast.makeText(this,"비밀번호를 입력해주세요",Toast.LENGTH_SHORT).show();

                return;
            }
//            loginViewModel.login(
//                    new LoginRequest(binding.idText.getText().toString(),
//                            binding.passwordText.getText().toString()));

            startActivity(new Intent(getApplicationContext(), MainActivity.class));
        });

        binding.registerButton.setOnClickListener(v -> {

            startActivity(new Intent(getApplicationContext(), RegisterActivity.class));
        });
    }
}
