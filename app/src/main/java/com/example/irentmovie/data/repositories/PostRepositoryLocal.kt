package com.example.irentmovie.data.repositories

import com.example.irentmovie.data.dao.PostDao
import com.example.irentmovie.data.models.Post

class PostRepositoryLocal(private val postDao: PostDao): PostRepository {
    override suspend fun insertPost(post: Post) {
        postDao.insert(post)
    }

    override suspend fun getAllPosts(): List<Post> {
        return postDao.getAllPosts()
    }

    override suspend fun updatePost(post: Post) {
        postDao.update(post)
    }

    override suspend fun deletePost(post: Post) {
        postDao.delete(post)
    }
}