package com.example.login

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Payment2 : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_payment2)

        val doneBtn = findViewById<Button>(R.id.button12)
        doneBtn.setOnClickListener {
            val intent = Intent(this,Payment3::class.java)
            startActivity(intent)
        }
    }
}