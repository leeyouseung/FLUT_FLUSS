package com.example.flut_fluss.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;

import com.example.flut_fluss.base.BaseViewModel;
//import com.example.flut_fluss.manager.room.repository.UserRepository;
import com.example.flut_fluss.model.Login;
import com.example.flut_fluss.model.User;
import com.example.flut_fluss.network.client.LoginClient;
import com.example.flut_fluss.network.request.LoginRequest;

import java.util.List;

public class LoginViewModel extends BaseViewModel<Login> {

    private LoginClient loginClient;

//    private UserRepository repository;
//    private LiveData<List<User>> userInfo;

    public LoginViewModel(@NonNull Application application) {
        super(application);

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
