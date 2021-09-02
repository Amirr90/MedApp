package com.medapp.views.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.medapp.R;
import com.medapp.databinding.FragmentLoginBinding;
import com.medapp.views.activity.HomeActivity;

public class LoginFragment extends Fragment {


    FragmentLoginBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentLoginBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.tvMoveToSignUpPage.setOnClickListener(v -> Navigation.findNavController(view).navigate(R.id.action_loginFragment_to_signUpFragment));
        binding.tvForgetPassword.setOnClickListener(v -> Navigation.findNavController(view).navigate(R.id.action_loginFragment_to_forgetPasswordFragment));
        binding.btnLogin.setOnClickListener(v -> {
            startActivity(new Intent(requireActivity(), HomeActivity.class));
            // requireActivity().finish();
        });
    }
}