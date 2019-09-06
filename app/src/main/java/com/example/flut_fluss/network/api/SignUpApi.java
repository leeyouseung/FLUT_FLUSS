package com.example.flut_fluss.network.api;

import com.example.flut_fluss.network.request.SignUpRequest;

import io.reactivex.Single;
import retrofit2.Response;
import retrofit2.http.POST;

public interface SignUpApi {

    @POST("/api/user/")
    Single<Response<com.example.flut_fluss.network.Response>> signup(SignUpRequest signUpRequest);
}
