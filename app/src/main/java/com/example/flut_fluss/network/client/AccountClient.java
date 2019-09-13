package com.example.flut_fluss.network.client;

import com.example.flut_fluss.base.BaseClient;
import com.example.flut_fluss.network.api.AccountApi;

public class AccountClient extends BaseClient<AccountApi> {

    @Override
    protected Class api() {

        return AccountApi.class;
    }
}
