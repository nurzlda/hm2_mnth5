package com.example.lesson2_month5


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.lesson2_month5.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {

    private lateinit var binding: FragmentFirstBinding


    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFirstBinding.inflate(layoutInflater)
        return binding.root


    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.btnRequest.setOnClickListener {

            val bundle = Bundle()
            val firstName = binding.edtFirstName.text.toString()
            if (firstName.isEmpty()){
                binding.edtFirstName.error = "Заполните строку"
           }
            val secondName = binding.edtSecondName.text.toString()
            if (secondName.isEmpty()){
                binding.edtSecondName.error = "Заполните строку"
            }else{
                bundle.putString("MyArg", firstName)
                bundle.putString("MyArg2", secondName)
                findNavController().navigate(R.id.action_firstFragment_to_firstFragment2, bundle)
            }
        }
    }

}