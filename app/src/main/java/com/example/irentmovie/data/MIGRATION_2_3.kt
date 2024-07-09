package com.example.irentmovie.data

import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase

val MIGRATION_2_3 = object : Migration(2, 3) {
    override fun migrate(database: SupportSQLiteDatabase) {
        database.execSQL(
            """
            CREATE TABLE IF NOT EXISTS moviemodels (
                id INTEGER PRIMARY KEY NOT NULL,
                name TEXT NOT NULL
            )
            """.trimIndent()
        )
    }
}