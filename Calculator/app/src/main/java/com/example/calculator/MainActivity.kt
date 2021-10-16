package com.example.calculator

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    val isNop =true
    val oldNumber= ""
    val op = "+"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val orientation = resources.configuration.orientation
        if (orientation == Configuration.ORIENTATION_LANDSCAPE){
            Toast.makeText( this, "Landscape Mode", Toast.LENGTH_SHORT ).show()
        }
    }
}fun numberEvent(view: android.view.View){
    isNop
    if(isNop)
        editText.setText("")
    isNop =false

}


