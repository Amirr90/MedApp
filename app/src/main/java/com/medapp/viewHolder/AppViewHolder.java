package com.medapp.viewHolder;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.medapp.databinding.DoctorsTimeSlotsBinding;
import com.medapp.databinding.DoctorsViewBinding;
import com.medapp.databinding.DoctorsViewForAppointmentBinding;
import com.medapp.databinding.HealthConcernViewBinding;

public class AppViewHolder extends RecyclerView.ViewHolder {
    DoctorsViewBinding doctorsViewBinding;
    public HealthConcernViewBinding healthConcernViewBinding;
    public DoctorsViewForAppointmentBinding doctorsViewForAppointmentBinding;
    public DoctorsTimeSlotsBinding doctorsTimeSlotsBinding;


    public AppViewHolder(@NonNull DoctorsTimeSlotsBinding doctorsTimeSlotsBinding) {
        super(doctorsTimeSlotsBinding.getRoot());
        this.doctorsTimeSlotsBinding = doctorsTimeSlotsBinding;
    }

    public AppViewHolder(@NonNull DoctorsViewForAppointmentBinding doctorsViewForAppointmentBinding) {
        super(doctorsViewForAppointmentBinding.getRoot());
        this.doctorsViewForAppointmentBinding = doctorsViewForAppointmentBinding;
    }

    public AppViewHolder(@NonNull HealthConcernViewBinding healthConcernViewBinding) {
        super(healthConcernViewBinding.getRoot());
        this.healthConcernViewBinding = healthConcernViewBinding;
    }

    public AppViewHolder(@NonNull DoctorsViewBinding doctorsViewBinding) {
        super(doctorsViewBinding.getRoot());
        this.doctorsViewBinding = doctorsViewBinding;


    }

    public AppViewHolder(@NonNull View itemView) {
        super(itemView);
    }
}
