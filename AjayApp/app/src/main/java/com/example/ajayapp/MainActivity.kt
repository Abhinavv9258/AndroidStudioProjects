package com.example.ajayapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    var etText: TextView? =null
    var btn: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etText = findViewById(R.id.textView)
        btn = findViewById(R.id.btn)


    }
    fun rand(start: Int, end: Int): Int {
        require(start <= end) { "Illegal Argument" }
        return (start..end).random()
    }
    fun btnClick(view: View) {
        val random=rand(0,10)
        if(random%2==0){
            etText?.setText("Yes you are chutiya");
        }
        else{
            etText?.setText("No you are chutiya");
        }

    }
}