package com.example.flut_fluss.network.client;

import com.example.flut_fluss.base.BaseClient;
import com.example.flut_fluss.model.Login;
import com.example.flut_fluss.model.Money;
import com.example.flut_fluss.network.api.SendMoneyApi;
import com.example.flut_fluss.network.request.SendMoneyRequest;

import org.json.JSONObject;

import java.util.Objects;

import io.reactivex.Single;

public class SendMoneyClient extends BaseClient<SendMoneyApi> {

    @Override
    protected Class api() {

        return SendMoneyApi.class;
    }

    public Single<Money> sendMoney(SendMoneyRequest sendMoneyRequest) {

        return api.sendMoney(sendMoneyRequest).map(response -> {

            if (!response.isSuccessful()) {

                JSONObject errorBody = new JSONObject(Objects
                        .requireNonNull(
                                response.errorBody()).string());

                throw new Exception(errorBody.getString("message"));
            }

            if (response.body().getStatus() == 200) {

                Money money = new Money(response.body().getData().getAccount(), response.body().getData().getBank());

                return money;

            } else if (response.body().getStatus() == 400) {

                throw new Exception("송금 오류");
                
            } else {

                throw new Exception(response.body().getMessage());
            }
        });
    }
}
