package com.example.login

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // Delay for 3 seconds and navigate to MainActivity
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, onboard1_activity::class.java))
            finish() // Close SplashActivity
        }, 3000)
    }
}
