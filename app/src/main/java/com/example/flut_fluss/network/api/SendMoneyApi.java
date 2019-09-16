package com.example.flut_fluss.network.api;

import com.example.flut_fluss.model.Money;
import com.example.flut_fluss.network.Response;
import com.example.flut_fluss.network.request.SendMoneyRequest;

import io.reactivex.Single;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface SendMoneyApi {

    @POST("api/send/bank")
    Single<retrofit2.Response<Response<Money>>> sendFlussMoney(@Body SendMoneyRequest sendMoneyRequest);

    @POST("api/send/fluss")
    Single<retrofit2.Response<Response<Money>>> sendBankMoney(@Body SendMoneyRequest sendMoneyRequest);
}
