package com.idkotlin.dagger2.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.idkotlin.dagger2.CustomApp
import com.idkotlin.dagger2.R
import com.idkotlin.dagger2.di.component.DaggerActivityComponent
import com.idkotlin.dagger2.di.component.DaggerApplicationComponent
import com.idkotlin.dagger2.di.module.ApplicationModule
import com.idkotlin.dagger2.util.PreferencesUtil
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var mPrerencesUtil: PreferencesUtil

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        injectDagger()

        mPrerencesUtil.putString("hello", "HELLO WORLD")

        val hello: String = mPrerencesUtil.getString("hello", "hello")

        Toast.makeText(this, hello,Toast.LENGTH_LONG).show()

    }

    private fun injectDagger() {
        CustomApp.mInstance.mApplicationComponent.inject(this)
    }
}
