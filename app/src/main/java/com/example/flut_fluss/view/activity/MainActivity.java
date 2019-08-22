package com.example.flut_fluss.view.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.flut_fluss.R;
import com.example.flut_fluss.databinding.MainActivityBinding;

public class MainActivity extends AppCompatActivity {

    MainActivityBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
    }
}
