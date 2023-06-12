package com.bandirma.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class sayfalar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sayfalar)
    }

    override fun onResume(){
        super.onResume()

        var textView = findViewById<TextView>(R.id.textView)
        var buttonText = intent.getStringExtra("AY")
        textView.text = buttonText
    }


}