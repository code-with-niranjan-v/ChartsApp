package com.example.chartapp

import android.graphics.Color
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
import com.example.chartapp.utils.Listener
import com.example.chartapp.viewmodel.LineChartViewModel
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet


class LineChartFragment : Fragment(),Listener {

    private lateinit var lineChartBinding: FragmentLineChartBinding
    private var lineChartViewModel: LineChartViewModel = LineChartViewModel()
    private lateinit var lineDataSet:LineDataSet
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

        lineChartViewModel.isSetup.observe(viewLifecycleOwner){
            if(it){
                setupChart()
            }else{
                lineChartBinding.lineChart.data = null
            }
        }

        lineChartViewModel.isStyle.observe(viewLifecycleOwner){
            if(it){
                customizeLineChart()
            }

        }

        lineChartViewModel.isLineChartStyling.observe(viewLifecycleOwner){
            if(it){

                styleLineChart()
            }

        }

        val adapter = CodeAdapter(listOfCode,this)
        lineChartBinding.recyclerView.adapter = adapter
        lineChartBinding.recyclerView.layoutManager  = LinearLayoutManager(requireContext())

    }

    private fun customizeLineChart(){
        //setting border
        lineChartBinding.lineChart.setDrawBorders(true)
        lineChartBinding.lineChart.setBackgroundColor(Color.WHITE)
        lineChartBinding.lineChart.setBorderColor(R.color.black)
        lineChartBinding.lineChart.setBorderWidth(2f)
    }

    private fun setupChart(){
        val dataset = listOf<Entry>(Entry(1f,1f), Entry(2f,2f), Entry(3f,3f))

        lineDataSet = LineDataSet(dataset,"Line Chart")



        val lineDataSetList = listOf<LineDataSet>(lineDataSet)
        val lineData = LineData(lineDataSetList)



        lineChartBinding.lineChart.data = lineData
        lineChartBinding.lineChart.invalidate()


    }

    override fun onClick(id: Int) {
        if (id==2){
            lineChartViewModel.isStyle.value = !lineChartViewModel.isStyle.value!!
        }

        if (id==1){
            lineChartViewModel.isSetup.value = !lineChartViewModel.isSetup.value!!
        }

        if (id==3){
            lineChartViewModel.isLineChartStyling.value = !lineChartViewModel.isLineChartStyling.value!!
        }
    }

    private fun styleLineChart(){
        val dataset = listOf<Entry>(Entry(1f,1f), Entry(2f,2f), Entry(3f,3f))

        lineDataSet = LineDataSet(dataset,"Line Chart")


        lineDataSet.color = Color.BLACK
        lineDataSet.lineWidth = 30f
        val lineDataSetList = listOf<LineDataSet>(lineDataSet)
        val lineData = LineData(lineDataSetList)



        lineChartBinding.lineChart.data = lineData
        lineChartBinding.lineChart.invalidate()


    }

}