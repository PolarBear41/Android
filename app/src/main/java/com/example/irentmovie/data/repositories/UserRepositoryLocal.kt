package com.example.irentmovie.data.repositories

import androidx.lifecycle.LiveData
import com.example.irentmovie.data.dao.UserDao
import com.example.irentmovie.data.models.User

class UserRepositoryLocal(private val dao: UserDao): UserRepository {
    override suspend fun insertUser(user: User) {
        dao.insert(user)
    }

    override fun getUsers(): LiveData<List<User>> {
        return dao.getUsers()
    }

    override suspend fun getUser(username: String, password: String): User? {
        return dao.getUser(username, password)
    }

    override suspend fun deleteUserByUsername(username: String) {
        dao.deleteUserByUsername(username)
    }
}
