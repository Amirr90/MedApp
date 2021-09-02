package com.medapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.medapp.adapters.DoctorsListAdapter;
import com.medapp.databinding.FragmentHomeBinding;
import com.medapp.modal.Doctor;

import java.util.ArrayList;
import java.util.List;


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
    }

    private void initAdapter() {

        doctorsListAdapter = new DoctorsListAdapter();
        doctorsListAdapter.submitList(getDemoList());
        binding.recDocList.setAdapter(doctorsListAdapter);
    }

    private List<Doctor> getDemoList() {
        List<Doctor> doctors = new ArrayList<>();
        for (int a = 0; a < 10; a++) {
            doctors.add(new Doctor("Hari Prasad", "Speciality"));
        }
        return doctors;
    }
}