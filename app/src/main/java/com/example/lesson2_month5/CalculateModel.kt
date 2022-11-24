package com.example.lesson2_month5

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity(tableName = "calculate-history")
data class CalculateModel(

    @PrimaryKey(autoGenerate = true)
    val id : Int? = null,
    @SerializedName("fname")
    val firstName : String,
    @SerializedName("sname")
    val secondName : String,
    val percentage : String,
    val result : String

) : Parcelable
