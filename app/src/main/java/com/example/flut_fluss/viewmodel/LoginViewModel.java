package com.example.flut_fluss.viewmodel;

import android.content.Context;

import androidx.annotation.NonNull;

import com.example.flut_fluss.base.BaseViewModel;
import com.example.flut_fluss.model.Login;
import com.example.flut_fluss.network.client.LoginClient;
import com.example.flut_fluss.network.request.LoginRequest;

public class LoginViewModel extends BaseViewModel<Login> {

    private LoginClient loginClient;

    public LoginViewModel(@NonNull Context application) {
        super(application);

        loginClient = new LoginClient();
    }

    public void login(LoginRequest loginRequest) {

        addDisposable(loginClient.login(loginRequest), getDataObserver());
    }
}
