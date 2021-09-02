package com.medapp.views.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.medapp.databinding.FragmentForgetPasswordBinding;


public class ForgetPasswordFragment extends Fragment {


    FragmentForgetPasswordBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentForgetPasswordBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.tvMoveToLoginPage.setOnClickListener(v -> Navigation.findNavController(view).navigateUp());
        binding.ivBack.setOnClickListener(v -> Navigation.findNavController(view).navigateUp());
    }


}