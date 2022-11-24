package com.example.lesson2_month5

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.lesson2_month5.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {


    private lateinit var binding: FragmentSecondBinding


    private val args: SecondFragmentArgs by navArgs()


    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSecondBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        getArgs()

        binding.saveBtn.setOnClickListener { findNavController().navigate(R.id.
        action_SecondFragment_to_thirdFragment) }
    }


    @SuppressLint("SetTextI18n")
    private fun getArgs() { with(binding){

        tvYou.text= args.calculate.firstName
        tvMe.text = args.calculate.secondName
        tvResult.text = args.calculate.result
        tvPercentage.text= args.calculate.percentage + "%" }
    }
}