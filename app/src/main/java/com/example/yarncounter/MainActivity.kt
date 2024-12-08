package com.example.yarncounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var rowCountText: TextView
    private lateinit var nextButton: Button
    private lateinit var previousButton: Button

    private var currentRow = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rowCountText = findViewById(R.id.current_row)
        nextButton = findViewById(R.id.next_button)
        previousButton = findViewById(R.id.previous_button)

        nextButton.setOnClickListener { increaseRow() }
        previousButton.setOnClickListener { decreaseRow() }
    }

    private fun decreaseRow() {
        // TODO if the current row is 0, don't decrease.
        currentRow--
        updateRowDisplay()
    }

    private fun increaseRow() {
        currentRow++
        updateRowDisplay()
    }

    private fun updateRowDisplay() {
        rowCountText.text = currentRow.toString()
    }


}