package com.medapp.adapters

import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.medapp.databinding.HealthConcernViewBinding
import com.medapp.interfaces.AdapterItemClick
import com.medapp.modal.ConcernTopics
import com.medapp.utils.AppUtils
import com.medapp.viewHolder.AppViewHolder

class HealthConcernAdapter(var adapterItemClick: AdapterItemClick) : ListAdapter<ConcernTopics, AppViewHolder>(DiffCallback()) {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AppViewHolder {
        val doctorsViewBinding: HealthConcernViewBinding = HealthConcernViewBinding.inflate(AppUtils.getInflater(parent), parent, false)
        doctorsViewBinding.adapterListener = adapterItemClick
        return AppViewHolder(doctorsViewBinding)
    }

    override fun onBindViewHolder(holder: AppViewHolder, position: Int) {

        val topics = getItem(position)
        holder.healthConcernViewBinding.concernTopics = topics

    }


    class DiffCallback : DiffUtil.ItemCallback<ConcernTopics>() {
        override fun areItemsTheSame(oldItem: ConcernTopics, newItem: ConcernTopics): Boolean {
            return oldItem.name == newItem.name
        }

        override fun areContentsTheSame(oldItem: ConcernTopics, newItem: ConcernTopics): Boolean {
            return oldItem == newItem
        }


    }
}


