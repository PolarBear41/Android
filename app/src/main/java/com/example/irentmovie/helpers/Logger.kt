package com.example.irentmovie.helpers

import android.util.Log

fun String.logErrorMessage(tag: String = "MyApp") {
    Log.e(tag, this)
}