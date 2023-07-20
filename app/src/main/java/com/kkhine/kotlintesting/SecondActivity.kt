package com.kkhine.kotlintesting

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_second)
        val txt = findViewById<TextView>(R.id.secTextView)

        val data:String? = intent.getStringExtra("data")
        txt.setText(data).toString()
    }
}