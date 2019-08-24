package com.example.flut_fluss.view.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.flut_fluss.R;
import com.example.flut_fluss.databinding.MainActivityBinding;
import com.example.flut_fluss.view.fragment.AddCardFragment;
import com.example.flut_fluss.view.fragment.RemittanceFragment;
import com.example.flut_fluss.view.fragment.SettingFragment;
import com.example.flut_fluss.view.fragment.ShowMoneyListFragment;
import com.example.flut_fluss.view.fragment.TimeLineFragment;

public class MainActivity extends AppCompatActivity {

    MainActivityBinding binding;

    private TextView money;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.main_activity);

        initData();

        onCreateViewSetting();

        onButtonSetting();

        onNavigationBarSetting();

        event();
    }

    private void initData() {

        LayoutInflater layoutInflater = (LayoutInflater)getApplication().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.remittance_fragment, null);

        money = view.findViewById(R.id.money);

        // 나르샤 끝나고 할 일 :
        // 돈 입력 했을 때, 하단 메뉴바 사라지게 만들고 더치페이 보내기 만들기
        // 돈 입력 기능 구현.
        // qr 코드 구현.
    }

    private void onCreateViewSetting() {

        FragmentManager fragmentManager = getSupportFragmentManager();

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.replace(R.id.main_activity_fragment, new RemittanceFragment());
        fragmentTransaction.commit();
    }

    private void onButtonSetting() {

        binding.remittanceIcon.setImageResource(R.drawable.remittance_icon_click);
        binding.remittanceTitle.setTextColor(getResources().getColor(R.color.blue));
    }

    private void onNavigationBarSetting() {

        LinearLayout menuNavigationLinearLayout = findViewById(R.id.menu_navigation_linearLayout);
        LinearLayout moneySendLinearLayout = findViewById(R.id.money_send_linearLayout);

        money.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                if(charSequence.equals("0") || charSequence.length() == 0) {

                    menuNavigationLinearLayout.setVisibility(View.VISIBLE);
                    moneySendLinearLayout.setVisibility(View.INVISIBLE);
                }
                else {

                    menuNavigationLinearLayout.setVisibility(View.INVISIBLE);
                    moneySendLinearLayout.setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
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

            binding.remittanceIcon.setImageResource(R.drawable.remittance_icon_click);
            binding.remittanceTitle.setTextColor(getResources().getColor(R.color.blue));

            binding.showMoneyListIcon.setImageResource(R.drawable.show_money_list_icon);
            binding.showMoneyListTitle.setTextColor(getResources().getColor(R.color.black));

            binding.timeLineIcon.setImageResource(R.drawable.time_line_icon);
            binding.timeLineTitle.setTextColor(getResources().getColor(R.color.black));

            binding.addCardIcon.setImageResource(R.drawable.add_card_icon);
            binding.addCardTitle.setTextColor(getResources().getColor(R.color.black));

            binding.settingIcon.setImageResource(R.drawable.setting_icon);
            binding.settingTitle.setTextColor(getResources().getColor(R.color.black));
        });
    }

    private void clickShowMoneyListButton() {

        binding.showMoneyListButton.setOnClickListener(v -> {

            FragmentManager fragmentManager = getSupportFragmentManager();

            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

            fragmentTransaction.replace(R.id.main_activity_fragment, new ShowMoneyListFragment());
            fragmentTransaction.commit();

            binding.remittanceIcon.setImageResource(R.drawable.remittance_icon);
            binding.remittanceTitle.setTextColor(getResources().getColor(R.color.black));

            binding.showMoneyListIcon.setImageResource(R.drawable.show_money_list_icon_click);
            binding.showMoneyListTitle.setTextColor(getResources().getColor(R.color.blue));

            binding.timeLineIcon.setImageResource(R.drawable.time_line_icon);
            binding.timeLineTitle.setTextColor(getResources().getColor(R.color.black));

            binding.addCardIcon.setImageResource(R.drawable.add_card_icon);
            binding.addCardTitle.setTextColor(getResources().getColor(R.color.black));

            binding.settingIcon.setImageResource(R.drawable.setting_icon);
            binding.settingTitle.setTextColor(getResources().getColor(R.color.black));
        });
    }

    private void clickTimeLineButton() {

        binding.timeLineButton.setOnClickListener(v -> {

            FragmentManager fragmentManager = getSupportFragmentManager();

            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

            fragmentTransaction.replace(R.id.main_activity_fragment, new TimeLineFragment());
            fragmentTransaction.commit();

            binding.remittanceIcon.setImageResource(R.drawable.remittance_icon);
            binding.remittanceTitle.setTextColor(getResources().getColor(R.color.black));

            binding.showMoneyListIcon.setImageResource(R.drawable.show_money_list_icon);
            binding.showMoneyListTitle.setTextColor(getResources().getColor(R.color.black));

            binding.timeLineIcon.setImageResource(R.drawable.time_line_icon_click);
            binding.timeLineTitle.setTextColor(getResources().getColor(R.color.blue));

            binding.addCardIcon.setImageResource(R.drawable.add_card_icon);
            binding.addCardTitle.setTextColor(getResources().getColor(R.color.black));

            binding.settingIcon.setImageResource(R.drawable.setting_icon);
            binding.settingTitle.setTextColor(getResources().getColor(R.color.black));
        });
    }

    private void clickAddCardButton() {

        binding.addCardButton.setOnClickListener(v -> {

            FragmentManager fragmentManager = getSupportFragmentManager();

            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

            fragmentTransaction.replace(R.id.main_activity_fragment, new AddCardFragment());
            fragmentTransaction.commit();

            binding.remittanceIcon.setImageResource(R.drawable.remittance_icon);
            binding.remittanceTitle.setTextColor(getResources().getColor(R.color.black));

            binding.showMoneyListIcon.setImageResource(R.drawable.show_money_list_icon);
            binding.showMoneyListTitle.setTextColor(getResources().getColor(R.color.black));

            binding.timeLineIcon.setImageResource(R.drawable.time_line_icon);
            binding.timeLineTitle.setTextColor(getResources().getColor(R.color.black));

            binding.addCardIcon.setImageResource(R.drawable.add_card_icon_click);
            binding.addCardTitle.setTextColor(getResources().getColor(R.color.blue));

            binding.settingIcon.setImageResource(R.drawable.setting_icon);
            binding.settingTitle.setTextColor(getResources().getColor(R.color.black));
        });
    }

    private void clickSettingButton() {

        binding.settingButton.setOnClickListener(v -> {

            FragmentManager fragmentManager = getSupportFragmentManager();

            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

            fragmentTransaction.replace(R.id.main_activity_fragment, new SettingFragment());
            fragmentTransaction.commit();

            binding.remittanceIcon.setImageResource(R.drawable.remittance_icon);
            binding.remittanceTitle.setTextColor(getResources().getColor(R.color.black));

            binding.showMoneyListIcon.setImageResource(R.drawable.show_money_list_icon);
            binding.showMoneyListTitle.setTextColor(getResources().getColor(R.color.black));

            binding.timeLineIcon.setImageResource(R.drawable.time_line_icon);
            binding.timeLineTitle.setTextColor(getResources().getColor(R.color.black));

            binding.addCardIcon.setImageResource(R.drawable.add_card_icon);
            binding.addCardTitle.setTextColor(getResources().getColor(R.color.black));

            binding.settingIcon.setImageResource(R.drawable.setting_icon_click);
            binding.settingTitle.setTextColor(getResources().getColor(R.color.blue));
        });
    }
}
