package com.medapp.viewHolder;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.medapp.databinding.DoctorsViewBinding;

public class AppViewHolder extends RecyclerView.ViewHolder {
    DoctorsViewBinding doctorsViewBinding;

    public AppViewHolder(@NonNull DoctorsViewBinding doctorsViewBinding) {
        super(doctorsViewBinding.getRoot());
        this.doctorsViewBinding = doctorsViewBinding;
    }

    public AppViewHolder(@NonNull View itemView) {
        super(itemView);
    }
}
