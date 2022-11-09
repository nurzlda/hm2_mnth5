package com.example.lesson2_month5

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.lesson2_month5.databinding.FragmentFirstBinding
import com.example.lesson2_month5.databinding.FragmentSecondBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SecondFragment : Fragment() {


    private lateinit var binding:FragmentSecondBinding


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

    private fun getRequest(){

        val firstName = arguments?.getString("MyArg")
        binding.tvYou.text = firstName

        val secondName = arguments?.getString("MyArg2")
        binding.tvMe.text = secondName

        App.api.getPercentage(binding.tvYou.text.toString(), binding.tvMe.text.toString()).enqueue(
            object : Callback<CalculateModel> {
                @SuppressLint("SetTextI18n")
                override fun onResponse(
                    call: Call<CalculateModel>,
                    response: Response<CalculateModel>
                ) {
                    binding.tvPercentage.text = response.body()?.percentage + "%"
                    binding.tvResult.text = response.body()?.result.toString()
                }

                override fun onFailure(call: Call<CalculateModel>, t: Throwable) {

                }
            }
        )

    }

}