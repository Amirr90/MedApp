package com.medapp

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.medapp.adapters.ChooseDoctorAdapter
import com.medapp.databinding.FragmentChooseDoctorBinding
import com.medapp.interfaces.AdapterItemClick
import com.medapp.utils.AppUtils


class ChooseDoctorFragment : Fragment(), AdapterItemClick {

    private val TAG = "ChooseDoctorFragment"
    lateinit var binding: FragmentChooseDoctorBinding
    lateinit var adapter: ChooseDoctorAdapter
    lateinit var navController: NavController
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {

        binding = FragmentChooseDoctorBinding.inflate(layoutInflater)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        initHealthConcernData()

        binding.ivFilterDoctor.setOnClickListener { navController.navigate(R.id.action_chooseDoctorFragment_to_flterDoctorListFragment) }
    }

    private fun initHealthConcernData() {

        adapter = ChooseDoctorAdapter(this)
        binding.recChooseDoctor.addItemDecoration(DividerItemDecoration(activity, LinearLayoutManager.VERTICAL))
        binding.recChooseDoctor.adapter = adapter
        adapter.submitList(AppUtils.getDemoDocList())


    }

    override fun onItemClick(obj: Any) {
        Log.d(TAG, "onItemClick: $obj")
        //navController.navigate(R.id.action_chooseHealthConcernFragment2_to_chooseDoctorFragment)
    }


}