package com.bandirma.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.widget.ButtonBarLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun ikiyeGec(view : View){

        val intent =Intent(applicationContext, sayfalar::class.java)
        var buttonText = (view as Button).text.toString()
        intent.putExtra("AY", buttonText)

        startActivity(intent)
    }

}