package com.example.chartapp.data

import com.example.chartapp.model.Code

val listOfBarChartCode = listOf<Code>(
    Code(
        "Get Started \nXml Code",
        "<com.github.mikephil.charting.charts.BarChart\n" +
                "android:layout_width=\"match_parent\"\n" +
                "android:layout_margin=\"24dp\"\n" +
                "android:padding=\"30dp\"\n" +
                "android:layout_height=\"500dp\"\n" +
                "android:id=\"@+id/barChart\"\n" +
                "app:layout_constraintBottom_toTopOf=\"@id/recyclerView\"\n" +
                "app:layout_constraintTop_toBottomOf=\"@+id/tvTitle\"\n" +
                "app:layout_constraintTop_toTopOf=\"parent\"\n" +
                "app:layout_constraintStart_toStartOf=\"parent\"\n" +
                "app:layout_constraintEnd_toEndOf=\"parent\"/>"
    ),
    Code(
        "Kotlin Code",
        "val dataset = listOf<BarEntry>(BarEntry(1f,1f), BarEntry(2f,2f), BarEntry(3f,3f))\n" +
                "\n" +
                "val barDataSet = BarDataSet(dataset,\"Bar Chart\")\n" +
                "val barDataSetList = listOf<BarDataSet>(barDataSet)\n" +
                "val barData = BarData(barDataSetList)\n" +
                "\n" +
                "barChartBinding.barChart.data = barData\n" +
                "barChartBinding.barChart.invalidate()"
    )
)