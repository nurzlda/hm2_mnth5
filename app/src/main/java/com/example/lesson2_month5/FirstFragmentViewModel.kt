package com.example.lesson2_month5

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel

class FirstFragmentViewModel : ViewModel() {

    val repository = Repository()

    fun getRequest( firsName : String, secondName : String) : LiveData<CalculateModel>{
       return repository.getRequest(firsName, secondName)
    }
}