package com.idkotlin.dagger2

import android.app.Application
import com.idkotlin.dagger2.di.component.ApplicationComponent
import com.idkotlin.dagger2.di.component.DaggerApplicationComponent
import com.idkotlin.dagger2.di.module.ApplicationModule

/**
 * Created by kodeartisan on 11/11/17.
 */
class CustomApp: Application() {

    companion object {
        lateinit var mInstance: CustomApp
    }

    lateinit var mApplicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        mInstance = this
        mApplicationComponent = initApplicationComponent()

    }
    private fun initApplicationComponent(): ApplicationComponent {
        return DaggerApplicationComponent.builder()
                .applicationModule(ApplicationModule(this))
                .build()

    }
}