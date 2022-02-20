package com.bytedance.jstu.homework

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("CI_ByteDanceKotlinRules_Not_Allow_findViewByID_Invoked_In_UI")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var tvHello = findViewById<TextView>(R.id.tv_hello)
        tvHello.setOnClickListener{
            tvHello.text="Hello SJTU"
            Log.d("MainActivity","World")
        }
        Log.d("MainActivity", "Hello")
    }
}