package com.medapp.adapters

import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.medapp.databinding.DoctorsViewForAppointmentBinding
import com.medapp.interfaces.AdapterItemClick
import com.medapp.modal.Doctor
import com.medapp.utils.AppUtils
import com.medapp.viewHolder.AppViewHolder

class ChooseDoctorAdapter(var adapterInterface: AdapterItemClick) : ListAdapter<Doctor, AppViewHolder>(DiffCallback()) {

    class DiffCallback : DiffUtil.ItemCallback<Doctor>() {
        override fun areItemsTheSame(oldItem: Doctor, newItem: Doctor): Boolean {
            return oldItem.name == newItem.name
        }

        override fun areContentsTheSame(oldItem: Doctor, newItem: Doctor): Boolean {
            return oldItem == newItem
        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AppViewHolder {
        val doctorsViewBinding: DoctorsViewForAppointmentBinding = DoctorsViewForAppointmentBinding.inflate(AppUtils.getInflater(parent), parent, false)
        doctorsViewBinding.docInterface = adapterInterface
        return AppViewHolder(doctorsViewBinding)
    }

    override fun onBindViewHolder(holder: AppViewHolder, position: Int) {
          val doctor = getItem(position)
          holder.doctorsViewForAppointmentBinding.doctor = doctor

    }
}


