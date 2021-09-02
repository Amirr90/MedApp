package com.medapp.adapters;

import android.annotation.SuppressLint;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;

import com.medapp.databinding.DoctorsViewBinding;
import com.medapp.modal.Doctor;
import com.medapp.utils.AppUtils;
import com.medapp.viewHolder.AppViewHolder;

public class DoctorsListAdapter extends ListAdapter<Doctor, AppViewHolder> {
    public DoctorsListAdapter() {
        super(diffCallback);
    }

    @NonNull
    @Override
    public AppViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        DoctorsViewBinding doctorsViewBinding = DoctorsViewBinding.inflate(AppUtils.getInflater(parent), parent, false);
        return new AppViewHolder(doctorsViewBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull AppViewHolder holder, int position) {

    }

    public static DiffUtil.ItemCallback<Doctor> diffCallback = new DiffUtil.ItemCallback<Doctor>() {
        @Override
        public boolean areItemsTheSame(@NonNull Doctor oldItem, @NonNull Doctor newItem) {
            return oldItem.getSpeciality().equalsIgnoreCase(newItem.getSpeciality());
        }

        @SuppressLint("DiffUtilEquals")
        @Override
        public boolean areContentsTheSame(@NonNull Doctor oldItem, @NonNull Doctor newItem) {
            return oldItem.equals(newItem);
        }
    };
}
