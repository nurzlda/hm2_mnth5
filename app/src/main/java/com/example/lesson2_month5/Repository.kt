package com.example.lesson2_month5

import android.util.Log
import androidx.lifecycle.MutableLiveData
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Repository {

    fun getRequest(firstName : String, secondName : String) : MutableLiveData<CalculateModel>{

        val calculateLiveData = MutableLiveData<CalculateModel>()
        App.api.getPercentage(firstName, secondName).enqueue(
            object : Callback<CalculateModel>{
                override fun onResponse(
                    call: Call<CalculateModel>,
                    response: Response<CalculateModel>
                ) {

                    if (response.isSuccessful){

                        calculateLiveData.postValue(response.body())
                    }
                }

                override fun onFailure(call: Call<CalculateModel>, t: Throwable) {

                    Log.d("TAG", "onFailure: ${t.stackTrace} ")
                }

            }
        )
        return calculateLiveData
    }
}