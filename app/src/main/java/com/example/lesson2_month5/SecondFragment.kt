package com.example.lesson2_month5

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.lesson2_month5.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {


    private lateinit var binding:FragmentSecondBinding

    private val viewModel : MainActivityViewModel by viewModels()


    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSecondBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        getRequest()
    }

    @SuppressLint("SetTextI18n")
    private fun getRequest(){

        val firstName = arguments?.getString("MyArg")
        binding.tvYou.text = firstName

        val secondName = arguments?.getString("MyArg2")
        binding.tvMe.text = secondName

        viewModel.getRequest(binding.tvYou.text.toString(), binding.tvMe.text.toString())
            .observe(viewLifecycleOwner) { with(binding){
                tvPercentage.text = it.percentage + "%"
                tvYou.text = it.firstName
                tvMe.text = it.secondName
                tvResult.text = it.result
            }
            }
    }


}