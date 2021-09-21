package com.medapp.adapters

import android.widget.ListAdapter
import androidx.recyclerview.widget.DiffUtil
import com.medapp.interfaces.AdapterItemClick
import com.medapp.modal.SlotModel
import com.medapp.viewHolder.AppViewHolder

class SlotAdapter(var itemListener: AdapterItemClick) : ListAdapter<SlotModel, AppViewHolder>(DiffCall()) {


    class DiffCall : DiffUtil.ItemCallback<SlotModel>() {
        override fun areItemsTheSame(oldItem: SlotModel, newItem: SlotModel): Boolean {
            return oldItem.slotType == newItem.slotType
        }

        override fun areContentsTheSame(oldItem: SlotModel, newItem: SlotModel): Boolean {
            return oldItem == newItem
        }

    }
}

