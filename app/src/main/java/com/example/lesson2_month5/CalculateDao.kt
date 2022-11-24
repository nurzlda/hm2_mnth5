package com.example.lesson2_month5

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface CalculateDao {

    @Insert
    fun insert(model: CalculateModel)

    @Query("SElECT * FROM 'calculate-history'")
    fun getAll(): LiveData<ArrayList<CalculateModel>>


}