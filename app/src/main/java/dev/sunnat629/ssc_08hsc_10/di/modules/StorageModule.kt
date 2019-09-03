package dev.sunnat629.ssc_08hsc_10.di.modules

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import dagger.Module
import dagger.Provides
import dev.sunnat629.ssc_08hsc_10.R
import javax.inject.Singleton


@Module
class StorageModule {

    @Singleton
    @Provides
    fun provideSharedPrefs(application: Application): SharedPreferences {
        return application.applicationContext.getSharedPreferences(
            application.getString(R.string.app_name), Context.MODE_PRIVATE
        )
    }
}