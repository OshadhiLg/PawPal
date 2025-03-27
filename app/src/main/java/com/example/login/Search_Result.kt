package com.example.login

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Search_Result: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_search_result)

        val doneBtn = findViewById<Button>(R.id.button9)
        doneBtn.setOnClickListener {
            val intent = Intent(this,Payment1::class.java)
            startActivity(intent)
        }
    }
}