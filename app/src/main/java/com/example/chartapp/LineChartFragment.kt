package com.example.chartapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.chartapp.data.listOfCode
import com.example.chartapp.databinding.FragmentBarChartBinding
import com.example.chartapp.databinding.FragmentLineChartBinding
import com.example.chartapp.utils.CodeAdapter
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet


class LineChartFragment : Fragment() {

    private lateinit var lineChartBinding: FragmentLineChartBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        lineChartBinding = FragmentLineChartBinding.inflate(layoutInflater,container,false)
        return lineChartBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val dataset = listOf<Entry>(Entry(1f,1f), Entry(2f,2f), Entry(3f,3f))

        val lineDataSet = LineDataSet(dataset,"Line Chart")
        val lineDataSetList = listOf<LineDataSet>(lineDataSet)
        val lineData = LineData(lineDataSetList)

        lineChartBinding.lineChart.data = lineData
        lineChartBinding.lineChart.invalidate()

        val adapter = CodeAdapter(listOfCode)
        lineChartBinding.recyclerView.adapter = adapter
        lineChartBinding.recyclerView.layoutManager  = LinearLayoutManager(requireContext())

    }

    private fun customizeLineChart(){
        //setting border
        lineChartBinding.lineChart.setDrawBorders(true)
    }

}