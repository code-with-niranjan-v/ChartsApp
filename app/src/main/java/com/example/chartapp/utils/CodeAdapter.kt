package com.example.chartapp.utils

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.chartapp.databinding.CodeItemBinding
import com.example.chartapp.model.Code


class CodeViewHolder(private val binding:CodeItemBinding):ViewHolder(binding.root){
    fun bindData(code: Code){
        binding.tvTitle.text = code.tile

        binding.tvCode.text = code.code
    }
}
class CodeAdapter(private val listOfCode: List<Code>):Adapter<CodeViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CodeViewHolder {
        val binding = CodeItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return CodeViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return listOfCode.size
    }

    override fun onBindViewHolder(holder: CodeViewHolder, position: Int) {
        holder.bindData(listOfCode[position])
    }
}