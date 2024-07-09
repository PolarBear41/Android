package com.example.irentmovie

import android.app.Application
import androidx.room.Room
import com.example.irentmovie.data.AppDatabase
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class RentMyMovieApplication : Application() {
    lateinit var appDatabase: AppDatabase

    companion object {
        var instance: RentMyMovieApplication? = null
            private set
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
        appDatabase = Room.databaseBuilder(
            this,
            AppDatabase::class.java,
            "movie_database"
        )
            .fallbackToDestructiveMigration()
            .build()
    }
}