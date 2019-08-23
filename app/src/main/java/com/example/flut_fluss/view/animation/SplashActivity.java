package com.example.flut_fluss.view.animation;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import androidx.appcompat.app.AppCompatActivity;

import com.example.flut_fluss.R;
import com.example.flut_fluss.view.activity.LoginActivity;

@SuppressLint("Registered")
public class SplashActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Animation hold = AnimationUtils.loadAnimation(this, R.anim.splash_hold);

        final Animation scale = AnimationUtils.loadAnimation(this, R.anim.splash_scale);

        hold.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {

                binding.logo.clearAnimation();
                binding.logo.startAnimation(scale);
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

                binding.logo.clearAnimation();

                Intent intent = new Intent(SplashActivity.this, LoginActivity.class);
                startActivity(intent);

                finish();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        binding.logo.startAnimation(hold);
    }
}
