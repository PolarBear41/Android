package com.example.irentmovie.data.repositories

import com.example.irentmovie.data.api.PostAPIModel
import com.example.irentmovie.data.dao.ModelDao
import com.example.irentmovie.data.dao.PostDao
import kotlinx.coroutines.flow.Flow

class ModelRepositoryLocal(private val modelDao: ModelDao): ModelRepository {
    override fun getAllModels(): Flow<List<PostAPIModel>> {
        return modelDao.getAllModels()
    }

    override suspend fun insertAllModels(models: List<PostAPIModel>) {
        modelDao.insertAllModels(models)
    }

    override suspend fun deleteAllModels() {
        modelDao.deleteAllModels()
    }
}