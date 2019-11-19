package com.example.flut_fluss.view.animation;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.example.flut_fluss.R;
import com.example.flut_fluss.base.BaseActivity;
import com.example.flut_fluss.databinding.SplashActivityBinding;
import com.example.flut_fluss.view.activity.login.LoginFingerPrintActivity;
import com.example.flut_fluss.viewmodel.SplashViewModel;

public class SplashActivity extends BaseActivity<SplashActivityBinding, SplashViewModel> {

    @Override
    protected int getLayoutId() {

        return R.layout.splash_activity;
    }

    @Override
    protected Class<SplashViewModel> getViewModel() {

        return SplashViewModel.class;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initData();

        Animation hold = AnimationUtils.loadAnimation(this, R.anim.splash_hold);

        final Animation scale = AnimationUtils.loadAnimation(this, R.anim.splash_scale);

        hold.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {

                binding.animationLogo.clearAnimation();
                binding.animationLogo.startAnimation(scale);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        scale.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {

                binding.animationLogo.clearAnimation();

                Intent intent = new Intent(SplashActivity.this, LoginFingerPrintActivity.class);
                startActivity(intent);

                finish();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        binding.animationLogo.startAnimation(hold);
    }

    private void initData() {

    }
}
