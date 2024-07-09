package com.example.irentmovie.data.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.irentmovie.data.models.User

@Dao
interface UserDao {
    @Insert
    suspend fun insert(user: User)

    @Query("SELECT * FROM users WHERE username = :username AND password = :password")
    suspend fun getUser(username: String, password: String): User?

    @Query("SELECT * FROM users")
    fun getUsers(): LiveData<List<User>>

    @Query("DELETE FROM users WHERE username = :username")
    suspend fun deleteUserByUsername(username: String)
}
