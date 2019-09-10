package com.example.flut_fluss.manager.factory;

import android.content.Context;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.example.flut_fluss.viewmodel.LoginViewModel;
import com.example.flut_fluss.viewmodel.LookupSendMoneyViewModel;
import com.example.flut_fluss.viewmodel.SignUpViewModel;

/**
 * ViewModel 추가 시킬때 마다 create 에 추가 
 */
public class ViewModelFactory extends ViewModelProvider.NewInstanceFactory {

    private Context context;

    public ViewModelFactory(Context context) {

        this.context = context;
    }

    @Override
    public <T extends ViewModel> T create(Class<T> modelClass) {

        if(modelClass == LoginViewModel.class) {

            return (T) new LoginViewModel(context);
        }
        else if(modelClass == SignUpViewModel.class) {

            return (T) new SignUpViewModel(context);
        }
        else if(modelClass == LookupSendMoneyViewModel.class) {

            return (T) new LookupSendMoneyViewModel(context);
        }
        else {

            return super.create(modelClass);
        }
    }

}
