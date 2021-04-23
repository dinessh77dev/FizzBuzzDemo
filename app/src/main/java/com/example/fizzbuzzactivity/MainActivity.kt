package com.example.fizzbuzzactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun fizzBuzz(number: Int): String {
        if (number == 0) return "$number"
        return when {
            number % 3 == 0 -> "$FIZZ${if (number % 5 == 0) BUZZ else ""}"
            number % 5 == 0 -> BUZZ
            else -> "$number"
        }
    }

    companion object {
        const val FIZZ = "FIZZ"
        const val BUZZ = "BUZZ"
    }
}