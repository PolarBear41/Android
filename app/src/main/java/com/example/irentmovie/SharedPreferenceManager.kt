package com.example.irentmovie

import android.content.Context
import android.content.SharedPreferences

object SharedPreferenceManager {
    private const val ARG_TOKEN = "ARG_TOKEN"
    private const val SESSION_FILE_NAME = "movie-rent"

    private val sharedPreferences: SharedPreferences? by lazy {
        RentMyMovieApplication.instance?.applicationContext?.getSharedPreferences(
            SESSION_FILE_NAME, Context.MODE_PRIVATE)
    }

    fun writeToken(value: String) {
        write(ARG_TOKEN, value)
    }

    private fun write(key: String, value: String) = this.sharedPreferences?.let { sharedPrefs ->
        with (sharedPrefs.edit()) {
            putString(key, value)
            apply()
        }
    }

    fun readToken() = readString(ARG_TOKEN)

    private fun readString(key: String) = sharedPreferences?.getString(key, null)

    fun removeToken() = remove(ARG_TOKEN)

    private fun remove(key: String) = this.sharedPreferences?.let { sharedPrefs ->
        with (sharedPrefs.edit()) {
            remove(key)
            apply()
        }
    }
}