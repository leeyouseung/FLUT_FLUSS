package com.example.flut_fluss.view.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.flut_fluss.R;
import com.example.flut_fluss.databinding.MainActivityBinding;
import com.example.flut_fluss.view.fragment.AddCardFragment;
import com.example.flut_fluss.view.fragment.RemittanceFragment;
import com.example.flut_fluss.view.fragment.SettingFragment;
import com.example.flut_fluss.view.fragment.ShowMoneyListFragment;
import com.example.flut_fluss.view.fragment.TimeLineFragment;

public class MainActivity extends AppCompatActivity {

    MainActivityBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.main_activity);

        initData();

        onCreateViewSetting();

        onButtonSetting();

        event();
    }

    private void initData() {

    }

    private void onCreateViewSetting() {

        FragmentManager fragmentManager = getSupportFragmentManager();

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.replace(R.id.main_activity_fragment, new RemittanceFragment());
        fragmentTransaction.commit();
    }

    private void onButtonSetting() {

        binding.remittanceIcon.setBackgroundColor(getResources().getColor(R.color.blue));
        binding.remittanceTitle.setTextColor(getResources().getColor(R.color.blue));
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

        binding.remittanceButton.setOnClickListener(v -> {

            FragmentManager fragmentManager = getSupportFragmentManager();

            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

            fragmentTransaction.replace(R.id.main_activity_fragment, new RemittanceFragment());
            fragmentTransaction.commit();

            binding.remittanceIcon.setBackgroundColor(getResources().getColor(R.color.blue));
            binding.remittanceTitle.setTextColor(getResources().getColor(R.color.blue));
        });
    }

    private void clickShowMoneyListButton() {

        binding.showMoneyListButton.setOnClickListener(v -> {

            FragmentManager fragmentManager = getSupportFragmentManager();

            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

            fragmentTransaction.replace(R.id.main_activity_fragment, new ShowMoneyListFragment());
            fragmentTransaction.commit();

            binding.showMoneyListIcon.setBackgroundColor(getResources().getColor(R.color.blue));
            binding.showMoneyListTitle.setTextColor(getResources().getColor(R.color.blue));
        });
    }

    private void clickTimeLineButton() {

        binding.timeLineButton.setOnClickListener(v -> {

            FragmentManager fragmentManager = getSupportFragmentManager();

            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

            fragmentTransaction.replace(R.id.main_activity_fragment, new TimeLineFragment());
            fragmentTransaction.commit();

            binding.timeLineIcon.setBackgroundColor(getResources().getColor(R.color.blue));
            binding.timeLineTitle.setTextColor(getResources().getColor(R.color.blue));
        });
    }

    private void clickAddCardButton() {

        binding.addCardButton.setOnClickListener(v -> {

            FragmentManager fragmentManager = getSupportFragmentManager();

            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

            fragmentTransaction.replace(R.id.main_activity_fragment, new AddCardFragment());
            fragmentTransaction.commit();

            binding.addCardIcon.setBackgroundColor(getResources().getColor(R.color.blue));
            binding.addCardTitle.setTextColor(getResources().getColor(R.color.blue));
        });
    }

    private void clickSettingButton() {

        binding.settingButton.setOnClickListener(v -> {

            FragmentManager fragmentManager = getSupportFragmentManager();

            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

            fragmentTransaction.replace(R.id.main_activity_fragment, new SettingFragment());
            fragmentTransaction.commit();

            binding.settingIcon.setBackgroundColor(getResources().getColor(R.color.blue));
            binding.settingTitle.setTextColor(getResources().getColor(R.color.blue));
        });
    }
}
