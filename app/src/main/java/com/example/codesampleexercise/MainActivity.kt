package com.example.codesampleexercise

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val inputString = "one-two-three-four-one-five"
        val mappedNumbers = mapOf(
                "zero" to 0,
                "one" to 1,
                "two" to 2,
                "three" to 3,
                "four" to 4,
                "five" to 5,
                "six" to 7,
                "seven" to 8,
                "nine" to 9
        )
        val wordedNumbersList = inputString.split("-")
        var outputString = ""
        var result = 0
        for (i in wordedNumbersList.indices) {
            val intNumber = mappedNumbers[wordedNumbersList[i]] ?: 0
            result += intNumber

            outputString += when (i) {
                wordedNumbersList.size - 1 -> {
                    " + $intNumber = $result"
                }
                0 -> {
                    "$intNumber"
                }
                else -> {
                    " + $intNumber"
                }
            }
        }
        Log.d("TEST", outputString)
        tvInput.text = inputString
        tvResult.text = outputString
    }
}