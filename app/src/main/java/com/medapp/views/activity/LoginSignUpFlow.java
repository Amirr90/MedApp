package com.medapp.views.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.medapp.R;

public class LoginSignUpFlow extends AppCompatActivity {

    NavController navController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_signup_flow);
        navController = Navigation.findNavController(this, R.id.nav_login_signUp);
    }

    @Override
    public boolean onSupportNavigateUp() {
        return navController.navigateUp();
    }
}