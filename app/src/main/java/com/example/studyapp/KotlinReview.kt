package com.example.studyapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class KotlinReview : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.kotlin_review)

        val titles = listOf("Val and Var", "User Input", "String manipulation",
            "If Statements", "For Loops")

        val details = listOf("There are 2 main types of variables", "Get the user input with readLine()",
            "String Concatenation and Interpolation", "Guide our program in the right direction.",
            "Executes a sequence of statements multiple times")

        val alret_details = listOf("[immutable variables]:\n    val number: Int = 5\n\n" +
                "[immutable variables]:\n   var name: String = \"Tim\"\n" +
                "    name = \"Bob\"\n",
            "Variable that holds the input, \nthen Get the user input with readLine()" +
                    "\n   val name = readLine()",
            "[Concatenation]: combining strings with + sign\n   println(\"Hello\" + \"Sam\")" +
                    "\n\n   Output:HelloSam\n\n" +
                    "    val message = \"Hi there\"\n" +
                    "    val name = \"Sam\"\n" +
                    "    println(message + name)\n\n   Output: Hi thereSam\n\n" +
                    "[Interpolation]: to inject variables into a string" +
                    "    val message = \"Hi there\"\n" +
                    "    val name = \"Sam\"\n" +
                    "    println(\"\$message \$name\")" +
                    "\n\n   Output:Hi there Sam\n\n ",
            "    if(num > 5){\n" +
                    "        println(\"The number is larger than 5\")\n" +
                    "    }        ",
            "   for(number in 1..5){\n" +
                    "        println(number)\n" +
                    "    }   ")

        val my_rv = findViewById<RecyclerView>(R.id.kotlin_recycleView)
        my_rv.adapter = RecyclerAdapter(this,titles, details, alret_details)
        my_rv.layoutManager = LinearLayoutManager(this)

    }
}