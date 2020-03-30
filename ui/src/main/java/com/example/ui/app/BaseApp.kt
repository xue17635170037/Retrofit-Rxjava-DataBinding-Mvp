package com.example.ui.app

import android.app.Application
import android.content.Context
import androidx.multidex.MultiDex

open class BaseApp : Application(){
    override fun onCreate() {
        super.onCreate()
        mBaseContext = this
    }

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        MultiDex.install(this)
    }

    companion object {
        lateinit var mBaseContext: Context
    }
}
