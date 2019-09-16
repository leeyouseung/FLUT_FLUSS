package com.example.flut_fluss.viewmodel;

import android.content.Context;

import com.example.flut_fluss.base.BaseViewModel;
import com.example.flut_fluss.network.client.SendFlussMoneyClient;
import com.example.flut_fluss.network.request.SendMoneyRequest;

public class SendMyAccountViewModel extends BaseViewModel {

    private SendFlussMoneyClient sendFlussMoneyClient;

    public SendMyAccountViewModel(Context context) {
        super(context);

        sendFlussMoneyClient = new SendFlussMoneyClient();
    }

    public void sendMoney(SendMoneyRequest sendMoneyRequest) {

        addDisposable(sendFlussMoneyClient.sendMoney(sendMoneyRequest), getBaseObserver());
    }
}
