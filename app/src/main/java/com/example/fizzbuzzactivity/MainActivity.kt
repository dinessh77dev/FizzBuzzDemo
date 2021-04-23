package com.example.fizzbuzzactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun fizzBuzz(number: Int): String {
        return when (number) {
            0 -> "$number"
            3 -> "FIZZ"
            5 -> "BUZZ"
            else -> "$number"
        }
    }
}