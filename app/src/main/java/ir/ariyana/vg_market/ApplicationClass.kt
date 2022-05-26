package ir.ariyana.vg_market

import android.app.Application
import ir.ariyana.vg_market.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import timber.log.Timber

class ApplicationClass: Application() {
    override fun onCreate() {
        super.onCreate()

        Timber.plant(Timber.DebugTree())

        startKoin {
            androidLogger()
            androidContext(this@ApplicationClass)
            modules(appModule)
        }
    }
}