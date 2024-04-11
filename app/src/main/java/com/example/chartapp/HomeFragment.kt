package com.example.chartapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.chartapp.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    private lateinit var homeBinding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        homeBinding = FragmentHomeBinding.inflate(layoutInflater,container,false)
        return homeBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        homeBinding.btnLineChart.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_lineChartFragment)
        }

        homeBinding.btnBarChart.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_barChartFragment)
        }
    }

}