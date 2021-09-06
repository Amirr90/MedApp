package com.medapp.views.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.medapp.R;
import com.medapp.databinding.ActivityHomeBinding;

public class HomeActivity extends AppCompatActivity {

    NavController navController;
    ActivityHomeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_home);
        navController = Navigation.findNavController(this, R.id.nav_home);
    }

    @Override
    public boolean onSupportNavigateUp() {
        return navController.navigateUp();

    }
}