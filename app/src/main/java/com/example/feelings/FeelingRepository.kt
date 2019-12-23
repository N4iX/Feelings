package com.example.feelings

import androidx.lifecycle.LiveData

class FeelingRepository (private val feelingDao: FeelingDao) {
    val allFeelings: LiveData<List<Feeling>> = FeelingDao.getAllFeeling()

    suspend fun insert(feeling: Feeling){
        feelingDao.insertFeeling(feeling)
    }
}