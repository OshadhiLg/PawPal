package com.example.login

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class onboard2_activity : AppCompatActivity()  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_onboard2)

        val btnGetStarted: Button = findViewById(R.id.button3)

        btnGetStarted.setOnClickListener {
            val intent = Intent(this, onboard3_activity::class.java)
            startActivity(intent)
        }

    }
}