package com.example.login

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomePage:AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val btnGetStarted: Button = findViewById(R.id.button10)

        btnGetStarted.setOnClickListener {
            val intent = Intent(this, SearchPage::class.java)
            startActivity(intent)
        }
        val bottomNav = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        bottomNav.setOnItemSelectedListener { item->

            when(item.itemId){
                R.id.nav_home->{
                    startActivity(Intent(this, HomePage::class.java))
                    true
                }
                R.id.nav_search->{
                    startActivity(Intent(this,SearchPage::class.java))
                    true
                }
                R.id.nav_profile->{
                    startActivity(Intent(this,Profile1::class.java))
                    true
                }

                else -> {false}
            }

        }

    }
}