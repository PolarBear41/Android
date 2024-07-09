package com.example.irentmovie.data.repositories

import com.example.irentmovie.data.models.Post

interface PostRepository {
    suspend fun insertPost(post: Post)
    suspend fun getAllPosts(): List<Post>
    suspend fun updatePost(post: Post)
    suspend fun deletePost(post: Post)
}