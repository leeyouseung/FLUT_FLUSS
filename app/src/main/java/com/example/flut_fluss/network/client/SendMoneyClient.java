package com.example.flut_fluss.network.client;

import com.example.flut_fluss.base.BaseClient;
import com.example.flut_fluss.model.Money;
import com.example.flut_fluss.network.api.SendMoneyApi;
import com.example.flut_fluss.network.request.SendMoneyRequest;

import io.reactivex.Single;

public class SendMoneyClient extends BaseClient<SendMoneyApi> {

    @Override
    protected Class api() {

        return SendMoneyApi.class;
    }

//    public Single<Money> sendMoney(SendMoneyRequest sendMoneyRequest) {
    
//        return api
//    }
}
