package com.ozanyazici.runique

import android.app.Application
import com.ozanyazici.auth.data.di.authDataModule
import com.ozanyazici.auth.presentation.di.authViewModelModule
import com.ozanyazici.core.data.di.coreDataModule
import com.ozanyazici.run.location.di.locationModule
import com.ozanyazici.run.presentation.di.runPresentationModule
import com.ozanyazici.runique.di.appModule
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import timber.log.Timber

class RuniqueApp: Application() {

    val applicationScope = CoroutineScope(SupervisorJob())

    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }

        startKoin {
            androidLogger()
            androidContext(this@RuniqueApp)
            modules(
                authDataModule,
                authViewModelModule,
                appModule,
                coreDataModule,
                runPresentationModule,
                locationModule
            )
        }
    }
}