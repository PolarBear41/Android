package com.example.irentmovie.data

import androidx.room.AutoMigration
import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.irentmovie.data.api.PostAPIModel
import com.example.irentmovie.data.dao.ModelDao
import com.example.irentmovie.data.dao.PostDao
import com.example.irentmovie.data.dao.UserDao
import com.example.irentmovie.data.models.Post
import com.example.irentmovie.data.models.User

@Database(entities = [User::class, Post::class, PostAPIModel::class], version = 3)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
    abstract fun postDao(): PostDao
    abstract fun modelDao(): ModelDao

    companion object {
        const val DATABASE_NAME = "movie_database"
    }
}
