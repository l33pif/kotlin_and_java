package com.l33pif.kotlin_and_java

import android.content.SharedPreferences


fun SharedPreferences.edit(func: SharedPreferences.Editor.() -> Unit) {
    val editor = edit()
    editor.func()
    editor.apply()
}