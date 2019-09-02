package com.example.flut_fluss.network.api;

import androidx.annotation.NonNull;

import com.example.flut_fluss.model.Login;
import com.example.flut_fluss.network.request.LoginRequest;

import io.reactivex.Single;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface LoginApi {

    @NonNull
    @POST("/auth/login")
    Single<Response<Response<Login>>> login(@Body LoginRequest loginRequest);
}
