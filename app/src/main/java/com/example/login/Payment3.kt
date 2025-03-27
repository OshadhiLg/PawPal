package com.example.login

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Payment3: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_payment3)

        val continueBtn = findViewById<Button>(R.id.cntBtn)
        continueBtn.setOnClickListener {
            val intent = Intent(this,Contact_Details::class.java)
            startActivity(intent)
        }
    }
}