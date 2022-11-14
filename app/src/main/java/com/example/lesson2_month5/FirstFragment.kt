package com.example.lesson2_month5


import android.os.Bundle

import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.lesson2_month5.databinding.FragmentFirstBinding



class FirstFragment : Fragment() {

    private lateinit var binding: FragmentFirstBinding
    private val viewModel: FirstFragmentViewModel by viewModels()


    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFirstBinding.inflate(layoutInflater)
        return binding.root


    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.btnRequest.setOnClickListener {

           nav()
        }
    }

    private fun nav(){

        viewModel.getRequest(binding.edtFirstName.text.toString(), binding.edtSecondName.text.toString())
            .observe(viewLifecycleOwner) {

                val destination = FirstFragmentDirections.actionFirstFragmentToSecondFragment(it)
                    findNavController().navigate(destination)

            }
    }

}