package com.idkotlin.dagger2.di.module

import android.content.Context
import android.content.SharedPreferences
import com.idkotlin.dagger2.CustomApp
import com.idkotlin.dagger2.util.PreferencesUtil
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by kodeartisan on 11/11/17.
 */
@Module
class ApplicationModule(private val customApp: CustomApp) {

    @Provides
    @Singleton
    fun provideContext(): Context = customApp.applicationContext

    @Provides
    @Singleton
    fun provideSharedPreferences(): SharedPreferences = provideContext().getSharedPreferences("", Context.MODE_PRIVATE)

    @Provides
    @Singleton
    fun providePreferencesUtil(sharedPreferences: SharedPreferences): PreferencesUtil = PreferencesUtil(sharedPreferences)
}