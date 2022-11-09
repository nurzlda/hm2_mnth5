package com.example.lesson2_month5

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface CalculatorApi {

    @GET("getPercentage")
    fun getPercentage(
        @Query("fname") firstName : String,
        @Query("sname") secondName : String ,
        @Header("X-rapidAPI-Key") key  : String = "fa49d02e4dmshca542f8c831dd77p13d4f4jsn58b1ace5e007",
        @Header("X-rapidAPI-Host") host  : String = "love-calculator.p.rapidapi.com"
    ) : Call<CalculateModel>
}