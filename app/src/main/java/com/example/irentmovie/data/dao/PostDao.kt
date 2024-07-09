package com.example.irentmovie.data.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.irentmovie.data.models.Post

@Dao
interface PostDao {
    @Insert
    suspend fun insert(post: Post)

    @Query("SELECT * FROM posts")
    suspend fun getAllPosts(): List<Post>

    @Update
    suspend fun update(post: Post)

    @Delete
    suspend fun delete(post: Post)
}