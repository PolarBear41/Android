package com.example.irentmovie.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "posts")
data class Post(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val content: String,
    val price: String,
    val period: String,
    val type: String
)