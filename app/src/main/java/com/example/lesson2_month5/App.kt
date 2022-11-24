package com.example.lesson2_month5

import android.app.Application
import androidx.room.Room

class App  : Application(){


    companion object{
       lateinit var api: CalculatorApi

       lateinit var appDataBase: AppDataBase

    }

    override fun onCreate() {
        super.onCreate()
        api = RetrofitService().getApi()
        appDataBase = Room.databaseBuilder(applicationContext, AppDataBase ::class.java,
            "history").allowMainThreadQueries().build()
    }
}