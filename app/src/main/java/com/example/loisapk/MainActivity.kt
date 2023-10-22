package com.example.loisapk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.loisapk.RegActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textview = findViewById<TextView>(R.id.btn_register)
        textview.setOnClickListener {
            val intent = Intent(this, RegActivity::class.java)
            startActivity(intent)
        }
        val textview2 = findViewById<TextView>(R.id.btn_login)
        textview2.setOnClickListener {
            val intent = Intent(this, HompageActivity::class.java)
            startActivity(intent)
        }

        val textview3 = findViewById<TextView>(R.id.forgot)
        textview3.setOnClickListener {
            val intent = Intent(this, ForgotActivity::class.java)
            startActivity(intent)
        }



}}