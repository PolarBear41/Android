package com.example.irentmovie.data

import android.content.Context
import androidx.room.Room
import com.example.irentmovie.data.dao.PostDao
import com.example.irentmovie.data.dao.UserDao
import com.example.irentmovie.data.repositories.ModelRepository
import com.example.irentmovie.data.repositories.ModelRepositoryLocal
import com.example.irentmovie.data.repositories.PostRepository
import com.example.irentmovie.data.repositories.PostRepositoryLocal
import com.example.irentmovie.data.repositories.UserRepository
import com.example.irentmovie.data.repositories.UserRepositoryLocal
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {
    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext appContext: Context): AppDatabase {
        val database =  Room.databaseBuilder(
            appContext,
            AppDatabase::class.java,
            "movie_database"
        )
            .addMigrations(MIGRATION_1_2, MIGRATION_2_3) // Add migration
            .build()

        database.openHelper.writableDatabase
        return database
    }
    @Provides
    @Singleton
    fun provideUserDao(database: AppDatabase): UserDao {
        return database.userDao()
    }

    @Provides
    @Singleton
    fun provideUserRepository(database: AppDatabase): UserRepository {
        return UserRepositoryLocal(database.userDao())
    }

    @Provides
    @Singleton
    fun providePostRepository(database: AppDatabase): PostRepository {
        return PostRepositoryLocal(database.postDao())
    }

    @Provides
    @Singleton
    fun provideModelRepository(database: AppDatabase): ModelRepository {
        return ModelRepositoryLocal(database.modelDao())
    }
}