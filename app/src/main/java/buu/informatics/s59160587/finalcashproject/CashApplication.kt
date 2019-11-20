package buu.informatics.s59160587.finalcashproject

import android.app.Application
import timber.log.Timber

class CashApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }

}