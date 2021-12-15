package com.example.myfirstapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Second_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val prevoiusActivity = findViewById<Button>(R.id.previousActivity)

        prevoiusActivity.setOnClickListener {
            val Intent = Intent(this,prevoiusActivity::class.java)
            startActivity(Intent)
        }
    }
}