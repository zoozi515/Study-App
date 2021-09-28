package com.example.studyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {

    private lateinit var main_constraintLayout: ConstraintLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        main_constraintLayout = findViewById(R.id.main_constraintLayout)

        val kotlin_button = findViewById<Button>(R.id.kotlin_button)
        kotlin_button.setOnClickListener{
            moveToNextActivity(1)
        }

        val android_button = findViewById<Button>(R.id.android_button)
        android_button.setOnClickListener{
            moveToNextActivity(2)
        }
    }

    private fun moveToNextActivity(activity_number: Int){
        var intent: Intent
        if (activity_number == 1){
            intent = Intent(this, KotlinReview::class.java)
            startActivity(intent)
        } else {
            intent = Intent(this, AndroidReview::class.java)
            startActivity(intent)
        }
    }
}