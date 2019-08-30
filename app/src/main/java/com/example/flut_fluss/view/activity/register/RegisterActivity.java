package com.example.flut_fluss.view.activity.register;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.flut_fluss.R;
import com.example.flut_fluss.databinding.RegisterActivityBinding;

public class RegisterActivity extends AppCompatActivity {

    private RegisterActivityBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.register_activity);
    }
}
