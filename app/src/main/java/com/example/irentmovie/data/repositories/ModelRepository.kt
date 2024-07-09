package com.example.irentmovie.data.repositories

import com.example.irentmovie.data.api.PostAPIModel
import com.example.irentmovie.data.models.Post
import kotlinx.coroutines.flow.Flow

interface ModelRepository {
    fun getAllModels(): Flow<List<PostAPIModel>>
    suspend fun insertAllModels(models: List<PostAPIModel>)
    suspend fun deleteAllModels()
}