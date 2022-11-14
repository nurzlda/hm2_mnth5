package com.example.lesson2_month5

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class CalculateModel(

    @SerializedName("fname")
    val firstName : String,
    @SerializedName("sname")
    val secondName : String,
    val percentage : String,
    val result : String

) : Parcelable
