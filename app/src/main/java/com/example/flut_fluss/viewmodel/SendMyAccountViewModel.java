package com.example.flut_fluss.viewmodel;

import android.content.Context;

import com.example.flut_fluss.base.BaseViewModel;
import com.example.flut_fluss.network.client.SendMoneyClient;
import com.example.flut_fluss.network.request.SendMoneyRequest;

public class SendMyAccountViewModel extends BaseViewModel {

    private SendMoneyClient sendMoneyClient;

    public SendMyAccountViewModel(Context context) {
        super(context);

        sendMoneyClient = new SendMoneyClient();
    }

    public void send(SendMoneyRequest sendMoneyRequest) {

        addDisposable(sendMoneyClient.sendMoney(sendMoneyRequest), getBaseObserver());
    }
}
