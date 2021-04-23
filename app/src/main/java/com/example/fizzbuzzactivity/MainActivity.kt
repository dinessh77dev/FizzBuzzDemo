package com.example.fizzbuzzactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun fizzBuzz(number: Int): String {
        return when {
            number == 0 -> "$number"
            number % 3 == 0 && number % 5 == 0 -> "FIZZBUZZ"
            number % 3 == 0 -> "FIZZ"
            number % 5 == 0 -> "BUZZ"
            else -> "$number"
        }
    }
}