package com.kagome.osiwali_lol

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class LolApplication : Application(){
    override fun onCreate() {
        super.onCreate()
//        R4J(APICredentials("RGAPI-bcee3a3e-af16-4b6e-abe0-767004f9ee3f"))
    }
}