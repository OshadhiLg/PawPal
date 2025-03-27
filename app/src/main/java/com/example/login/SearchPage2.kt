package com.example.login

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class SearchPage2: AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search1)


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