package com.example.flut_fluss.viewmodel;

import android.content.Context;

import androidx.annotation.NonNull;

import com.example.flut_fluss.base.BaseViewModel;
//import com.example.flut_fluss.manager.room.repository.UserRepository;
import com.example.flut_fluss.model.register.Login;
import com.example.flut_fluss.network.client.LoginClient;
import com.example.flut_fluss.network.request.LoginRequest;

public class LoginViewModel extends BaseViewModel<Login> {

    private LoginClient loginClient;

//    private UserRepository repository;
//    private LiveData<List<User>> userInfo;

    public LoginViewModel(@NonNull Context context) {
        super(context);

        loginClient = new LoginClient();

//        repository = new UserRepository(application);
//        userInfo = repository.getUserInfo();
    }

    public void login(LoginRequest loginRequest) {

        addDisposable(loginClient.login(loginRequest), getDataObserver());
    }


//    public void insert(User user) {
//
//        repository.insert(user);
//    }
//
//    public LiveData<List<User>> getAllNotes() {
//
//        return userInfo;
//    }
}
