package com.example.lesson2_month5

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.lesson2_month5.databinding.ItemHistoryBinding
import kotlin.collections.ArrayList

class HistoryAdapter(private val historyList : ArrayList<CalculateModel>) :
    RecyclerView.Adapter<HistoryAdapter.HistoryViewHolder>(){



    class HistoryViewHolder(private val binding:ItemHistoryBinding) :
        RecyclerView.ViewHolder(binding.root){
            fun onBind(calculateModel: CalculateModel){

                        binding.tvFirstName.text = calculateModel.firstName
                        binding.tvSecondName.text = calculateModel.secondName
                        binding.tvPercentage.text = calculateModel.percentage
                        binding.tvResult.text = calculateModel.result


            }
        }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HistoryViewHolder {
        return HistoryViewHolder(ItemHistoryBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,false))
    }

    override fun onBindViewHolder(holder: HistoryViewHolder, position: Int) {
        return holder.onBind(historyList[position])

    }

    override fun getItemCount(): Int {
        return historyList.size
    }


}