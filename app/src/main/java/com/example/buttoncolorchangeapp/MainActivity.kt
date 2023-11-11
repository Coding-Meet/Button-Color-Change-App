package com.example.buttoncolorchangeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val splashScreen = installSplashScreen()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // here setKeepOnScreenCondition false so, activity redirect another activity
        // and some api call here
        // if setKeepOnScreenCondition true so, activity code not redirect another activity
        splashScreen.setKeepOnScreenCondition { false }
//        Handler(Looper.getMainLooper()).postDelayed({
//            startActivity(Intent(this, SecondActivity::class.java))
//            finish()
//        }, 2000)
    }
}
