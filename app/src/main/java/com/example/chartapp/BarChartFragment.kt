package com.example.chartapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.chartapp.data.listOfBarChartCode
import com.example.chartapp.databinding.FragmentBarChartBinding
import com.example.chartapp.utils.CodeAdapter
import com.github.mikephil.charting.data.BarData
import com.github.mikephil.charting.data.BarDataSet
import com.github.mikephil.charting.data.BarEntry
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet


class BarChartFragment : Fragment() {

    private lateinit var barChartBinding: FragmentBarChartBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        barChartBinding = FragmentBarChartBinding.inflate(layoutInflater,container,false)
        return barChartBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val dataset = listOf<BarEntry>(BarEntry(1f,1f), BarEntry(2f,2f), BarEntry(3f,3f))

        val barDataSet = BarDataSet(dataset,"Bar Chart")
        val barDataSetList = listOf<BarDataSet>(barDataSet)
        val barData = BarData(barDataSetList)

        barChartBinding.barChart.data = barData
        barChartBinding.barChart.invalidate()

        val adapter = CodeAdapter(listOfBarChartCode)
        barChartBinding.recyclerView.adapter = adapter
        barChartBinding.recyclerView.layoutManager  = LinearLayoutManager(requireContext())



    }


}