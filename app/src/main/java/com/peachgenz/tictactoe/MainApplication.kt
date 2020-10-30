package com.peachgenz.tictactoe

import android.app.Application
import com.peachgenz.tictactoe.manager.Contextor

class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        Contextor.init(applicationContext)
    }

    override fun onTerminate() {
        super.onTerminate()
    }
}