package hu.andras.daggersample

import android.app.Application

class DaggerSampleApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        instance = this
    }

    companion object {
        var instance: DaggerSampleApplication? = null
            private set
    }
}
