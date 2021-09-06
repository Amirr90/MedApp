package com.medapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.medapp.adapters.HealthConcernAdapter
import com.medapp.databinding.FragmentChooseHealthConcernBinding
import com.medapp.interfaces.AdapterItemClick
import com.medapp.utils.AppUtils

class ChooseHealthConcernFragment : Fragment(), AdapterItemClick {

    lateinit var binding: FragmentChooseHealthConcernBinding
    lateinit var adapter: HealthConcernAdapter
    lateinit var navController: NavController
    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        binding = FragmentChooseHealthConcernBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        initHealthConcernData()
    }

    private fun initHealthConcernData() {

        adapter = HealthConcernAdapter(this)
        binding.recConcern.adapter = adapter
        adapter.submitList(AppUtils.getList())
    }

    override fun onItemClick(obj: Any) {
        navController.navigate(R.id.action_chooseHealthConcernFragment2_to_chooseDoctorFragment)
    }

}


