package com.example.myfirstapp

import android.content.Intent
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.linear_layout)
        val  etUserMessage: TextView = findViewById(R.id.etUserMessage)
        val button1: Button= findViewById(R.id.btnSendMessageToNextActivity)

        button1.setOnClickListener {
            /*val message: String = etUserMessage.text.toString()
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show() */
            /*val intent =Intent (this, Second_Activity::class.java)
            startActivity(intent)*/
            capturePhoto()

        }


    }


    fun capturePhoto() {
        val intent = Intent(MediaStore.INTENT_ACTION_VIDEO_CAMERA)
        if (intent.resolveActivity(packageManager) != null) {
            val REQUEST_IMAGE_CAPTURE = 1
            startActivityForResult(intent, REQUEST_IMAGE_CAPTURE)
        }
    }




}

