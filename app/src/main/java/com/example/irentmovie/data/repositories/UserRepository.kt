package com.example.irentmovie.data.repositories

import androidx.lifecycle.LiveData
import com.example.irentmovie.data.models.User

interface UserRepository {
    suspend fun insertUser(user: User)
    fun getUsers(): LiveData<List<User>>
    suspend fun getUser(username: String, password: String): User?
    suspend fun deleteUserByUsername(username: String)
}
