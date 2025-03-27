package com.example.login

import android.content.Intent
import android.widget.Button
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class onboard1_activity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_onboard1)

        val btnGetStarted: Button = findViewById(R.id.button3)

        btnGetStarted.setOnClickListener {
            val intent = Intent(this, onboard2_activity::class.java)
            startActivity(intent)
        }

    }

}