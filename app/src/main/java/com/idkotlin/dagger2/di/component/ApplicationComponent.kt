package com.idkotlin.dagger2.di.component

import com.idkotlin.dagger2.di.module.ApplicationModule
import com.idkotlin.dagger2.ui.MainActivity
import com.idkotlin.dagger2.util.PreferencesUtil
import dagger.Component
import javax.inject.Singleton

/**
 * Created by kodeartisan on 11/11/17.
 */
@Singleton
@Component(modules = arrayOf(ApplicationModule::class))
interface ApplicationComponent {

    fun getPreferencesUtil(): PreferencesUtil

    fun inject(target: MainActivity)

}