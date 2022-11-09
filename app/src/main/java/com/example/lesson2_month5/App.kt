package com.example.lesson2_month5

import android.app.Application

class App  : Application(){

    companion object{
       lateinit var api: CalculatorApi
    }

    override fun onCreate() {
        super.onCreate()
        api = RetrofitService().getApi()
    }
}