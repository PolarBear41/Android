package com.example.irentmovie.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.irentmovie.data.api.PostAPIModel
import kotlinx.coroutines.flow.Flow

@Dao
interface ModelDao {

    @Query("SELECT * FROM moviemodels")
    fun getAllModels(): Flow<List<PostAPIModel>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAllModels(models: List<PostAPIModel>)


    @Query("DELETE FROM moviemodels")
    suspend fun deleteAllModels()
}