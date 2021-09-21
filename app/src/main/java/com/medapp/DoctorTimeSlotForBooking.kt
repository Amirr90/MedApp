package com.medapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.medapp.adapters.DateAdapter
import com.medapp.adapters.SlotAdapter
import com.medapp.databinding.FragmentDoctorTimeSlotForBookingBinding
import com.medapp.interfaces.AdapterItemClick
import com.medapp.modal.DateModel
import java.text.SimpleDateFormat
import java.util.*

class DoctorTimeSlotForBooking : Fragment(), AdapterItemClick {
    private val TAG = "DoctorTimeSlotForBookin"
    lateinit var binding: FragmentDoctorTimeSlotForBookingBinding
    private lateinit var dateAdapter: DateAdapter
    lateinit var slotAdapter: SlotAdapter
    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View {
        binding = FragmentDoctorTimeSlotForBookingBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initDoctorDateSlot()
    }

    private fun initDoctorDateSlot() {
        dateAdapter = DateAdapter(this)
        binding.recSlotsDate.apply {
            adapter = dateAdapter
        }
        setDataToAdapter()

        initSlots(dateAdapter.currentList[0])

    }

    private fun initSlots(dateModel: DateModel) {
        var currentDate = dateModel.date


    }

    private fun setDataToAdapter() {
        val dateList: MutableList<DateModel> = mutableListOf()
        for (i in 0..7) {
            val cal: Calendar = GregorianCalendar.getInstance()
            cal.time = Date()
            cal.add(Calendar.DAY_OF_YEAR, i)
            val dateAfterTomorrow = cal.time
            val sdf = SimpleDateFormat("dd MMM, yyyy")
            val date = sdf.format(dateAfterTomorrow)
            dateList.add(DateModel(date.toString(), i))
        }

        dateAdapter.submitList(dateList)
    }

    override fun onItemClick(obj: Any) {

    }

}
