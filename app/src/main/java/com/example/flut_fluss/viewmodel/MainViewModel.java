package com.example.flut_fluss.viewmodel;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

public class MainViewModel extends AndroidViewModel {

    public MutableLiveData<String> money = new MutableLiveData<>();

    public MainViewModel(Application application) {
        super(application);

        money.setValue("0");
    }

    public void sendMoney() {


    }
}
