package com.example.loisapk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.cardview.widget.CardView
import com.example.loisapk.RegActivity

class HompageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.homepage)
        val paket= findViewById<CardView>(R.id.paket)
        paket.setOnClickListener {
            val intent = Intent(this, PackageActivity::class.java)
            startActivity(intent)
        }

        val profile= findViewById<CardView>(R.id.profile)
        profile.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }

        val setting= findViewById<CardView>(R.id.settings)
        setting.setOnClickListener {
            val intent = Intent(this, SettingActivity::class.java)
            startActivity(intent)
        }

        val about = findViewById<CardView>(R.id.about)
        about.setOnClickListener {
            val intent = Intent(this, AboutActivity::class.java)
            startActivity(intent)
        }


    }}