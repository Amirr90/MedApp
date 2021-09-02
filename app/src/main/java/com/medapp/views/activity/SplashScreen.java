package com.medapp.views.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.medapp.R;
import com.medapp.databinding.ActivityMainBinding;

public class SplashScreen extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();

        new Handler().postDelayed(this::updateUi, 1000);
    }

    private void updateUi() {
        startActivity(new Intent(this, LoginSignUpFlow.class));
    }
}