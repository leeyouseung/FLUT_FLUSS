package com.example.flut_fluss.viewmodel;

import android.content.Context;

import com.example.flut_fluss.base.BaseViewModel;
import com.example.flut_fluss.network.client.SignUpClient;
import com.example.flut_fluss.network.request.SignUpRequest;

public class SignUpViewModel extends BaseViewModel {

    private SignUpClient signUpClient;

    public SignUpViewModel(Context context) {
        super(context);

        signUpClient = new SignUpClient();
    }

    public void signup(SignUpRequest signUpRequest) {

        addDisposable(signUpClient.signup(signUpRequest), getBaseObserver());
    }
}
