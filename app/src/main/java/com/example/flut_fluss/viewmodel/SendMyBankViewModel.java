package com.example.flut_fluss.viewmodel;

import android.content.Context;

import com.example.flut_fluss.base.BaseViewModel;
import com.example.flut_fluss.network.client.SendBankMoneyClient;
import com.example.flut_fluss.network.request.SendMoneyRequest;

public class SendMyBankViewModel extends BaseViewModel {

    private SendBankMoneyClient sendBankMoneyClient;

    protected SendMyBankViewModel(Context context) {
        super(context);

        sendBankMoneyClient = new SendBankMoneyClient();
    }

    public void sendBankMoney(SendMoneyRequest sendMoneyRequest) {

//        addDisposable(sendFlussMoneyClient.sendFlussMoney(sendMoneyRequest), getBaseObserver());
    }
}
