//package com.example.flut_fluss.view.activity.login;
//
//import android.app.AlertDialog;
//
//import android.content.DialogInterface;
//import android.content.Intent;
//
//import android.os.Bundle;
//
//import android.widget.Toast;
//
//import androidx.lifecycle.ViewModelProviders;
//
//import com.example.flut_fluss.R;
//import com.example.flut_fluss.base.BaseActivity;
//import com.example.flut_fluss.manager.Token;
//import com.example.flut_fluss.databinding.LoginActivityBinding;
//import com.example.flut_fluss.manager.factory.ViewModelFactory;
//
//import com.example.flut_fluss.view.activity.main.MainActivity;
//import com.example.flut_fluss.view.activity.singup.SignUpActivity;
//
//import com.example.flut_fluss.viewmodel.LoginViewModel;
//
//public class LoginActivity extends BaseActivity<LoginActivityBinding> {
//
//    @Override
//    protected int layoutId() {
//
//        return R.layout.login_activity;
//    }
//
//    private LoginViewModel loginViewModel;
//
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
//        initViewModel();
//
//        initView();
//
//        initData();
//
//        loginViewModel.getData().observe(this, login -> {
//
//            new Token(this).setToken(login.getToken().getToken());
////            new CurrentUser(this, "flut_database.db", null, 2).insert(login.getUser());
////            User user = new User();
//
////            loginViewModel.insert(user);
//
//            if(login.getUser().getId().isEmpty()) {
//
//                loginViewModel.getErrorMessage().observe(this, message -> Toast.makeText(this, message, Toast.LENGTH_LONG).show());
//            }
//            else {
//
//                Toast.makeText(this, "잠시만 기다려주세요", Toast.LENGTH_SHORT).show();
//
//                startActivity(new Intent(this, MainActivity.class));
//            }
//        });
//
//        event();
//    }
//
//    private void initViewModel() {
//
//        loginViewModel = ViewModelProviders.of(this, new ViewModelFactory(this)).get(LoginViewModel.class);
//    }
//
//    private void initView() {
//
//        binding.materialCardView.setBackgroundResource(R.drawable.background_login);
//    }
//
//    private void initData() {
//
//    }
//
//    private void event() {
//
//        clickEvent();
//    }
//
//    private void clickEvent() {
//
////        clickBlindButton();
//        clickLoginButton();
//        clickFindIdButton();
//        clickFindPasswordButton();
//        clickSignUpButton();
//    }
//
////    private void clickBlindButton() {
////
////        binding.blindButton.setOnClickListener(v -> {
////
////            if (checkBlind) {
////
////                binding.blindButton.setImageResource(R.drawable.ic_blind);
////                binding.passwordText.setTransformationMethod(PasswordTransformationMethod.getInstance());
////
////                checkBlind = false;
////            }
////            else {
////
////                binding.blindButton.setImageResource(R.drawable.ic_blind_check);
////                binding.passwordText.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
////
////                checkBlind = true;
////            }
////        });
////    }
//
//    private void clickLoginButton() {
//
//        binding.loginButton.setOnClickListener(v -> {
//
////            if (binding.idText.getText().toString().isEmpty()) {
////
////                Toast.makeText(this, "아이디를 입력해 주세요", Toast.LENGTH_SHORT).show();
////            }
////            else if (binding.pwText.getText().toString().isEmpty()) {
////
////                Toast.makeText(this, "비밀번호를 입력해 주세요", Toast.LENGTH_SHORT).show();
////            }
////            else {
//
////                loginViewModel.login(new LoginRequest(binding.idText.getText().toString(), binding.pwText.getText().toString()));
////            }
//
//            startActivity(new Intent(getApplicationContext(), MainActivity.class));
//        });
//    }
//
//    private void clickFindIdButton() {
//
//        binding.findIdButton.setOnClickListener(v -> {
//
//        });
//    }
//
//    private void clickFindPasswordButton() {
//
//        binding.findPasswordButton.setOnClickListener(v -> {
//
//        });
//    }
//
//    private void clickSignUpButton() {
//
//        binding.signUpButton.setOnClickListener(v -> {
//
//            startActivity(new Intent(getApplicationContext(), SignUpActivity.class));
//        });
//    }
//
//    @Override
//    public void onBackPressed() {
//
//        AlertDialog.Builder finishDialog = new AlertDialog.Builder(this);
//
//        finishDialog.setMessage("종료 하시겠습니까 ?")
//                .setCancelable(false)
//                .setPositiveButton("확인", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//                        // Action for 'OK' Button;
//
//                        Toast.makeText(getApplicationContext(), "OKOKOKOKOK", Toast.LENGTH_SHORT).show();
//
//                        finish();
//                    }
//
//                }).setNegativeButton("취소", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//                // Action for 'Cancel' Button;
//
//                dialog.dismiss();
//            }
//        });
//
//        finishDialog.create().show();
//    }
//}
