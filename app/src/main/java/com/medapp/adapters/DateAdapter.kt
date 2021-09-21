package com.medapp.adapters

import android.content.Context
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.medapp.R
import com.medapp.databinding.DoctorsTimeSlotsBinding
import com.medapp.interfaces.AdapterItemClick
import com.medapp.modal.DateModel
import com.medapp.utils.AppUtils
import com.medapp.viewHolder.AppViewHolder

class DateAdapter(var adapterItemClick: AdapterItemClick) :
    ListAdapter<DateModel, AppViewHolder>(DiffCallback()) {
    lateinit var context: Context
    var selectedPosition: Int = 0

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AppViewHolder {
        val binding: DoctorsTimeSlotsBinding =
            DoctorsTimeSlotsBinding.inflate(AppUtils.getInflater(parent), parent, false)
        binding.itemListener = adapterItemClick
        return AppViewHolder(binding)
    }

    override fun onBindViewHolder(holder: AppViewHolder, position: Int) {
        val dateModel = getItem(position)
        holder.doctorsTimeSlotsBinding.date = dateModel

        holder.doctorsTimeSlotsBinding.dateCard.strokeColor =
            if (selectedPosition == position) context.resources.getColor(R.color.colorPrimary) else context.resources.getColor(
                R.color.black
            )

        holder.doctorsTimeSlotsBinding.cv1.setOnClickListener {
            selectedPosition = position
            notifyDataSetChanged()
        }
    }

    class DiffCallback : DiffUtil.ItemCallback<DateModel>() {
        override fun areItemsTheSame(oldItem: DateModel, newItem: DateModel): Boolean {
            return oldItem.date == newItem.date
        }

        override fun areContentsTheSame(oldItem: DateModel, newItem: DateModel): Boolean {
            return oldItem == newItem
        }

    }

    override fun onAttachedToRecyclerView(recyclerView: RecyclerView) {
        super.onAttachedToRecyclerView(recyclerView)
        context = recyclerView.context
    }

}

