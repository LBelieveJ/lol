package com.kagome.osiwali_lol.utils

import android.app.Activity
import android.text.TextUtils
import android.util.Log
import android.widget.Toast
import com.kagome.osiwali_lol.BuildConfig

/**
 * Created  on 2021/5/21 15:38
 *  @author: Osiwali
 */
object Debuger {

    private val LOG_TAG = "ol_lol"

    var debugMode = BuildConfig.DEBUG

    fun enable() {
        debugMode = true
    }

    fun disable() {
        debugMode = false
    }

    fun printfLog(tag: String, log: String?) {
        if (debugMode && log != null) {
            if (!TextUtils.isEmpty(log))
                Log.i(tag, log)
        }
    }

    fun printfLog(log: String) {
        printfLog(LOG_TAG, log)
    }

    fun printfWarning(tag: String, log: String?) {
        if (debugMode && log != null) {
            if (!TextUtils.isEmpty(log))
                Log.w(tag, log)
        }
    }

    fun printfWarning(log: String) {
        printfWarning(LOG_TAG, log)
    }

    fun printfError(log: String) {
        if (debugMode) {
            if (!TextUtils.isEmpty(log))
                Log.e(LOG_TAG, log)
        }
    }

    fun printfError(Tag: String, log: String) {
        if (debugMode) {
            if (!TextUtils.isEmpty(log))
                Log.e(Tag, log)
        }
    }

    fun printfError(log: String, e: Exception) {
        if (debugMode) {
            if (!TextUtils.isEmpty(log))
                Log.e(LOG_TAG, log)
            e.printStackTrace()
        }
    }

    fun Toast(activity: Activity, log: String) {
        if (debugMode) {
            if (!TextUtils.isEmpty(log))
                Toast.makeText(activity, log, Toast.LENGTH_SHORT).show()
        }
    }
}
