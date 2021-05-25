package com.kagome.osiwali_lol.base

import android.database.Observable
import androidx.fragment.app.Fragment
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

/**
 *  A lazy property that gets cleaned up when the fragment is destroyed.
 *
 * Created  on 2021/5/21 14:53
 *  @author: Osiwali
 */

class AutoClearedValue<T>(val fragment: Fragment) : ReadWriteProperty<Fragment, T?> {
    private var value: T? = null

    init {
        fragment.lifecycle.addObserver(object : LifecycleObserver {
            @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
            fun onDestroy() {
                value = null
            }
        })

    }

    override fun setValue(thisRef: Fragment, property: KProperty<*>, value: T?) {
        this.value = value
    }

    override fun getValue(thisRef: Fragment, property: KProperty<*>): T? {
        return value
    }

}

fun <T : Any?> Fragment.autoCleared() = AutoClearedValue<T>(this)