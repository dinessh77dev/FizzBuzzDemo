package com.example.fizzbuzzactivity

import junit.framework.Assert.assertEquals
import org.junit.Test

class MainActivityTest {

    private val activity = MainActivity()

    @Test
    fun test_value_0() {
        assertEquals("0",activity.fizzBuzz(0))
    }

    @Test
    fun test_value_of_1(){
        assertEquals("1",activity.fizzBuzz(1))
    }

    @Test
    fun test_value_of_3(){
        assertEquals("FIZZ",activity.fizzBuzz(3))
    }

    @Test
    fun test_value_of_5(){
        assertEquals("BUZZ",activity.fizzBuzz(5))
    }

    @Test
    fun test_value_of_6(){
        assertEquals("FIZZ",activity.fizzBuzz(6))
    }

    @Test
    fun test_value_of_10(){
        assertEquals("BUZZ",activity.fizzBuzz(10))
    }

    @Test
    fun test_value_of_15(){
        assertEquals("FIZZBUZZ",activity.fizzBuzz(15))
    }
}