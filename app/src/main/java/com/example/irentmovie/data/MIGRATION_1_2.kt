package com.example.irentmovie.data

import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase

val MIGRATION_1_2 = object : Migration(1, 2) {
    override fun migrate(database: SupportSQLiteDatabase) {
        database.execSQL("DROP TABLE posts")
        // Adding new columns to the posts table with default values
        database.execSQL(
            """
            CREATE TABLE posts (
                id INTEGER PRIMARY KEY NOT NULL,
                period TEXT NOT NULL DEFAULT 'undefined',
                type TEXT NOT NULL DEFAULT 'undefined',
                content TEXT NOT NULL,
                price TEXT NOT NULL DEFAULT 'undefined'
            )
            """.trimIndent())
    }
}
