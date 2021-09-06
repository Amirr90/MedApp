package com.medapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.medapp.adapters.DoctorsListAdapter;
import com.medapp.databinding.FragmentHomeBinding;
import com.medapp.utils.AppUtils;


public class HomeFragment extends Fragment {
    FragmentHomeBinding binding;
    DoctorsListAdapter doctorsListAdapter;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentHomeBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        initAdapter();

        binding.constraintLayout2.setOnClickListener(v -> Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_chooseHealthConcernFragment2));
    }

    private void initAdapter() {

        doctorsListAdapter = new DoctorsListAdapter();
        doctorsListAdapter.submitList(AppUtils.getDemoDocList());
        binding.recDocList.setAdapter(doctorsListAdapter);
    }

}