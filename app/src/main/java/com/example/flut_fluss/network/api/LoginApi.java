package com.example.flut_fluss.network.api;

import androidx.annotation.NonNull;

import com.example.flut_fluss.model.Login;
import com.example.flut_fluss.network.Response;
import com.example.flut_fluss.network.request.LoginRequest;

import io.reactivex.Single;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface LoginApi {

    @NonNull
    @POST("/api/user/login")
    Single<retrofit2.Response<Response<Login>>> login(@Body LoginRequest loginRequest);
}
