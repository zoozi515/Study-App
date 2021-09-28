package com.example.studyapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class KotlinReview : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.kotlin_review)

        val items = arrayListOf(
            arrayListOf("var and val", "Declaring variables.", "Detailed notes here."),
            arrayListOf("User Input", "Getting user input.", "Detailed notes here."),
            arrayListOf("Strings", "String concatenations, interpolation, and methods.", "Detailed notes here."),
            arrayListOf("Data Types", "Understanding data types.", "Detailed notes here."),
            arrayListOf("Basic Operations", "Performing math operations in Kotlin.", "Detailed notes here."),
            arrayListOf("If Statements", "Understanding when and how to use if, else if, and else statements.", "Detailed notes here."),
            arrayListOf("Error Handling", "Using try blocks to avoid runtime errors.", "Detailed notes here."),
            arrayListOf("For Loops", "Using for loops to automate code.", "Detailed notes here."),
            arrayListOf("While Loops", "Using while loops to automate code.", "Detailed notes here.")
        )

        val rvKotlin = findViewById<RecyclerView>(R.id.rvKotlin)
        rvKotlin.adapter = RecyclerAdapter(this, items)
        rvKotlin.layoutManager = LinearLayoutManager(this)

        title = "Kotlin Review"

    }
}