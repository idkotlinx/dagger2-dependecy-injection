package com.idkotlin.dagger2.di.module

import android.support.v7.app.AppCompatActivity
import com.idkotlin.dagger2.di.scope.ActivityScope
import dagger.Module
import dagger.Provides

/**
 * Created by kodeartisan on 11/11/17.
 */
@Module
class ActivityModule(private val activity: AppCompatActivity) {

    @Provides
    @ActivityScope
    fun provideActivity() = activity

    @Provides
    @ActivityScope
    fun provodeActivityContext() = activity.baseContext
}