package com.example.studyapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class AndroidReview : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.android_review)

        val items = arrayListOf(
            arrayListOf("Project Setup", "Setting up an Android Studio Project.", "Detailed notes here."),
            arrayListOf("Console", "Printing to the console.", "Detailed notes here."),
            arrayListOf("Resource Files", "Identifying, editing, and using resource files.", "Detailed notes here."),
            arrayListOf("UI Elements", "Creating, modifying, and initializing UI Elements.", "Detailed notes here.")
        )

        val android_recycleView = findViewById<RecyclerView>(R.id.android_recycleView)
        android_recycleView.adapter = RecyclerAdapter(this, items)
        android_recycleView.layoutManager = LinearLayoutManager(this)
        title = "Android Review"
    }
}