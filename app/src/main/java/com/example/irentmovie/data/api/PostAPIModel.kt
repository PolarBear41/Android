package com.example.irentmovie.data.api

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "moviemodels")
data class PostAPIModel(
    @PrimaryKey val id: Int,
    val name: String,
)