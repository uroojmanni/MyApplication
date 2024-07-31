package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Add a delay of 3 seconds before starting the new activity
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, Secreen_two::class.java)
            startActivity(intent)
        }, 3000) // 3000 milliseconds = 3 seconds
    }
}
