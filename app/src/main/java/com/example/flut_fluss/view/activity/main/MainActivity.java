package com.example.flut_fluss.view.activity.main;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.example.flut_fluss.R;
import com.example.flut_fluss.base.BaseActivity;
import com.example.flut_fluss.databinding.MainActivityBinding;
import com.example.flut_fluss.view.activity.remittance.DutchPayActivity;
import com.example.flut_fluss.view.activity.remittance.SendMoneyActivity;
import com.example.flut_fluss.view.z_fragment.main.AddCardFragment;
import com.example.flut_fluss.view.z_fragment.main.RemittanceFragment;
import com.example.flut_fluss.view.z_fragment.main.SettingFragment;
import com.example.flut_fluss.view.z_fragment.main.LookUpFragment;
import com.example.flut_fluss.view.z_fragment.main.TimeLineFragment;

import java.util.Objects;

public class MainActivity extends BaseActivity<MainActivityBinding> {

    private TextView money;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initData();

        initSetFragment();

        initSetButton();

        initSetViewModel();

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
//         환경설정.                                                                        80%
//         타임라인.                                                                         0%
//         개설은 보류.                                                                      0%
//         조회 페이지에서 추가 했을 때 액션.                                                  0%
//         조회P, 타임라인 P, 전체+P 스크롤뷰 추가.                                            0%
//         조회 페이지 밑에 리스트 하나 더 추가.                                               0%
//        }
    }

    private void initSetFragment() {

        FragmentManager fragmentManager = getSupportFragmentManager();

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.replace(R.id.main_activity_fragment, new RemittanceFragment());
        fragmentTransaction.commit();
    }

    private void initSetButton() {

        binding.remittanceIcon.setImageResource(R.drawable.remittance_icon_click);
        binding.remittanceTitle.setTextColor(getResources().getColor(R.color.blue));
    }

    private void initSetViewModel() {

        
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

    @Override
    public void onBackPressed() {

        AlertDialog.Builder dialog = new AlertDialog.Builder(this);

        dialog.setTitle("종료");
        dialog.setMessage("종료하시겠습니까 ?")
                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {

                        // onClick OK

                        finish();
                    }
                }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {

                        // onClick Cancel

                        dialog.dismiss();
                    }
                });

        dialog.create();
        dialog.show();
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

            fragmentTransaction.replace(R.id.main_activity_fragment, new LookUpFragment());
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

        binding.dutchPayButton.setOnClickListener(v -> {

            startActivity(new Intent(getApplicationContext(), DutchPayActivity.class));
        });
    }

    private void clickSendMoneyButton() {

        binding.moneySendButton.setOnClickListener(v -> {

            String sendMoney = Objects.requireNonNull(((RemittanceFragment) Objects.requireNonNull(getSupportFragmentManager()
                    .findFragmentById(R.id.main_activity_fragment))).sendMoney);

            Intent intent = new Intent(getApplicationContext(), SendMoneyActivity.class);

            intent.putExtra("send_money", sendMoney);

            startActivity(intent);
        });
    }

    @Override
    protected int layoutId() {

        return R.layout.main_activity;
    }
}
