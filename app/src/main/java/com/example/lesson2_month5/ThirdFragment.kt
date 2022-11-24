package com.example.lesson2_month5

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.lesson2_month5.databinding.FragmentThirdBinding

class ThirdFragment : Fragment() {

    private lateinit var binding: FragmentThirdBinding

    private var historyAdapter = HistoryAdapter(arrayListOf())


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentThirdBinding.inflate(layoutInflater)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        saveData()
    }


    private fun saveData(){

        App.appDataBase.getDao().getAll().observe(viewLifecycleOwner) {
            val list = arrayListOf<CalculateModel>()
            list.addAll(it)
            historyAdapter = HistoryAdapter(list)
            binding.recyclerView.adapter = historyAdapter
        }
    }
}