package com.example.flut_fluss.network.api;

import com.example.flut_fluss.network.Response;
import com.example.flut_fluss.network.request.SendMoneyRequest;

import io.reactivex.Single;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface SendMoneyApi {

    @POST("api/#")
    Single<retrofit2.Response<Response>> sendMoney(@Body SendMoneyRequest sendMoneyRequest);
}
