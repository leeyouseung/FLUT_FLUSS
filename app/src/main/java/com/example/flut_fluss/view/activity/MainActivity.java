package com.example.flut_fluss.view.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.flut_fluss.R;
import com.example.flut_fluss.databinding.MainActivityBinding;
import com.example.flut_fluss.view.fragment.RemittanceFragment;

public class MainActivity extends AppCompatActivity {

    MainActivityBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        initData();

        event();
    }

    private void initData() {

        FragmentManager fragmentManager = getSupportFragmentManager();

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.replace(R.id.main_activity_fragment, new RemittanceFragment());
        fragmentTransaction.commit();
    }

    private void event() {

        clickEvent();
    }

    private void clickEvent() {

        clickRemittanceButton();
        clickShowMoneyListButton();
        clickTimeLineButton();
        clickAddCardButton();
        clickSettingButton();
    }

    private void clickRemittanceButton() {

        
    }

    private void clickShowMoneyListButton() {

    }

    private void clickTimeLineButton() {

    }

    private void clickAddCardButton() {

    }

    private void clickSettingButton() {

    }
}
