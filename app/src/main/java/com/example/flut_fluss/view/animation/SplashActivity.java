package com.example.flut_fluss.view.animation;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.flut_fluss.R;
import com.example.flut_fluss.databinding.SplashActivityBinding;
import com.example.flut_fluss.view.activity.LoginActivity;

@SuppressLint("Registered")
public class SplashActivity extends AppCompatActivity {

    SplashActivityBinding binding;

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

                Intent intent = new Intent(SplashActivity.this, LoginActivity.class);
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

        binding = DataBindingUtil.setContentView(this, R.layout.main_activity);
    }
}
