package com.example.flut_fluss.network.client;

import com.example.flut_fluss.base.BaseClient;
import com.example.flut_fluss.network.api.SendMoneyApi;

public class SendMoneyClient extends BaseClient<SendMoneyApi> {

    @Override
    protected Class api() {

        return SendMoneyApi.class;
    }
}
