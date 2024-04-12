package com.example.chartapp.data

import com.example.chartapp.model.Code

val listOfCode = listOf<Code>(
    Code(
        "Get Started\nXml Code",
        "<com.github.mikephil.charting.charts.LineChart\n" +
                "android:layout_width=\"match_parent\"\n" +
                "android:layout_margin=\"24dp\"\n" +
                "android:padding=\"30dp\"\n" +
                "android:layout_height=\"500dp\"\n" +
                "android:id=\"@+id/lineChart\"\n" +
                "app:layout_constraintTop_toBottomOf=\"@+id/tvTitle\"\n" +
                "app:layout_constraintBottom_toTopOf=\"@+id/recyclerView\"\n" +
                "app:layout_constraintStart_toStartOf=\"parent\"\n" +
                "app:layout_constraintEnd_toEndOf=\"parent\"/>"
    ),
    Code(
        "Kotlin Code",
        " val dataset = listOf<Entry>(Entry(1f,1f), Entry(2f,2f), Entry(3f,3f))\n" +
                "\n" +
                "        val lineDataSet = LineDataSet(dataset,\"Line Chart\")\n" +
                "        val lineDataSetList = listOf<LineDataSet>(lineDataSet)\n" +
                "        val lineData = LineData(lineDataSetList)\n" +
                "\n" +
                "        lineChartBinding.lineChart.data = lineData\n" +
                "        lineChartBinding.lineChart.invalidate()"
    )
)