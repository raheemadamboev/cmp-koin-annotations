package xyz.teamgravity.cmpkoinannotations

import android.app.Application
import org.koin.android.ext.koin.androidContext
import xyz.teamgravity.cmpkoinannotations.injection.app.initializeKoin

class MyApp : Application() {

    override fun onCreate() {
        super.onCreate()

        initializeKoin {
            androidContext(this@MyApp)
        }
    }
}