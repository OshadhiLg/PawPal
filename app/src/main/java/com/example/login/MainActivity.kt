package com.example.login

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btnGetStarted: Button = findViewById(R.id.button4)

        btnGetStarted.setOnClickListener {
            val intent = Intent(this, SignUp_activity::class.java)
            startActivity(intent)
        }

        val btnLogin: Button = findViewById(R.id.button5)
        btnLogin.setOnClickListener {
            val intent = Intent(this,HomePage::class.java)
            startActivity(intent)
        }
        btnGetStarted.setOnClickListener {
            val intent = Intent(this, SignUp_activity::class.java)
            startActivity(intent)
        }

    }
}