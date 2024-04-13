package com.example.chartapp.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LineChartViewModel:ViewModel() {

    val isStyle:MutableLiveData<Boolean> = MutableLiveData(false)
    val isSetup:MutableLiveData<Boolean> = MutableLiveData(false)
    val isLineChartStyling:MutableLiveData<Boolean> = MutableLiveData(false)

}