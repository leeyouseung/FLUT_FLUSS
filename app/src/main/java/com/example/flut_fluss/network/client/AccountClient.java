package com.example.flut_fluss.network.client;

import com.example.flut_fluss.base.BaseClient;

public class AccountClient extends BaseClient<AccountApi> {

    @Override
    protected Class api() {

        return AccountApi.class;
    }
}
