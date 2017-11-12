package com.idkotlin.dagger2.di.component

import com.idkotlin.dagger2.di.module.ActivityModule
import com.idkotlin.dagger2.di.scope.ActivityScope
import com.idkotlin.dagger2.ui.MainActivity
import dagger.Component

/**
 * Created by kodeartisan on 11/11/17.
 */
@ActivityScope
@Component(dependencies = arrayOf(ApplicationComponent::class), modules = arrayOf(ActivityModule::class))
interface ActivityComponent {



}