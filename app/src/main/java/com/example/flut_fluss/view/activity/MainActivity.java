package com.example.flut_fluss.view.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Context;
import android.content.Intent;
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

    private MainActivityBinding binding;

    private TextView money;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.main_activity);

        initData();

        onCreateFragmentSetting();

        onCreateButtonSetting();

        event();
    }

    private void initData() {

        LayoutInflater layoutInflater = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        assert layoutInflater != null;

        View view = layoutInflater.inflate(R.layout.remittance_fragment, null);
        money = view.findViewById(R.id.money);

//         TODO : {
//
//         돈 입력 했을 때, 하단 메뉴바 사라지게 만들고 더치페이 보내기 레이아웃 만들기           100%
//                        ##마지막 오류 하나 있음. (delete button 누르면 마지막에 0에서 한번 더 눌러줘야 레이아웃이 변경되는 것.) // 끝 다 고침 100% 동작 버그 X;
//         돈 입력 기능 구현.                                                               100%
//         돈 보내기.                                                                        0%
//         qr 코드 구현.                                                                     0%
//         회원가입.                                                                         0%
//         로그인 유지 체크박스 클릭시 색 테마에 맞추기.                                        0%
//         환경설정.
//         타임라인.
//         개설은 보류.
//         조회 페이지에서 추가 했을 때 액션.
//         조회P, 타임라인 P, 전체+P 스크롤뷰 추가.
//         조회 페이지 밑에 리스트 하나 더 추가.
//        }
    }

    private void onCreateFragmentSetting() {

        FragmentManager fragmentManager = getSupportFragmentManager();

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.replace(R.id.main_activity_fragment, new RemittanceFragment());
        fragmentTransaction.commit();
    }

    private void onCreateButtonSetting() {

        binding.remittanceIcon.setImageResource(R.drawable.remittance_icon_click);
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
        clickDutchPayButton();
        clickSendMoneyButton();
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

    private void clickDutchPayButton() {

    }

    private void clickSendMoneyButton() {

        binding.moneySendButton.setOnClickListener(v -> {

            startActivity(new Intent(getApplicationContext(), SendMoneyActivity.class));
        });
    }
}
