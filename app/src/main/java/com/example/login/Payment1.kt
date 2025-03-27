package com.example.login

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Payment1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_payment1)

        val doneBtn = findViewById<Button>(R.id.button11)
        doneBtn.setOnClickListener {
            val intent = Intent(this,Payment2::class.java)
            startActivity(intent)
        }

    }
}