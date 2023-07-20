package com.kkhine.kotlintesting

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.kkhine.mylibrary.PrintText
import com.kkhine.mylibrary.txtPrint

class MainActivity:AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       println(PrintText().textPrint())

        println(txtPrint())

        val btn = findViewById<Button>(R.id.button)
        val txt = findViewById<TextView>(R.id.textView)
        btn.setOnClickListener(){
            txt.setText("You Changed Me!").toString()
           val intent = Intent(this,SecondActivity::class.java)
            intent.putExtra("data","I am from first Activity")
            startActivity(intent)
        }
    }
}