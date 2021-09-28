package com.example.studyapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class AndroidReview : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.android_review)

        val titles = listOf("UI Elements", "OnClickListener", "Snackbar",
            "Recycler View", "Alert Dialogs")

        val details = listOf("Initializing UI Elements.",
            "Interface to be invoked when a view is clicked.",
            "Used to display alerts in our application.",
            "Used to display long lists of items to the user.",
            "Get user input to display an alert to the user.")

        val alret_details = listOf("val variable_name = findViewById<ViewName>(R.id.viewID)",
            "myButton.setOnClickListener { myFuction() }",
            "Snackbar.make(LayoutID,\"message\", Snackbar.LENGTH_LONG).show()",
            "val variable_name = findViewById<ViewNamr>(R.id.layoutID)\n" +
                    "        variable_name.adapter = RecyclerViewAdapter(list_name)\n" +
                    "        variable_name.layoutManager = LinearLayoutManager(this)",
            "var messages = arrayListOf<String>()\n"+" // first we create a variable to hold an AlertDialog builder\n" +
                    "        val dialogBuilder = AlertDialog.Builder(this)\n" +
                    "        // then we set up the input\n" +
                    "        val input = EditText(this)\n" +
                    "        // here we set the message of our alert dialog\n" +
                    "        dialogBuilder.setMessage(\"Enter your message:\")\n" +
                    "            // positive button text and action\n" +
                    "            .setPositiveButton(\"Submit\", DialogInterface.OnClickListener {\n" +
                    "                    dialog, id -> messages.add(input.text.toString())\n" +
                    "            })\n" +
                    "            // negative button text and action\n" +
                    "            .setNegativeButton(\"Cancel\", DialogInterface.OnClickListener {\n" +
                    "                    dialog, id -> dialog.cancel()\n" +
                    "            })\n" +
                    "        // create dialog box\n" +
                    "        val alert = dialogBuilder.create()\n" +
                    "        // set title for alert dialog box\n" +
                    "        alert.setTitle(\"New Message\")\n" +
                    "        // add the Edit Text\n" +
                    "        alert.setView(input)\n" +
                    "        // show alert dialog\n" +
                    "        alert.show()")

        val my_rv = findViewById<RecyclerView>(R.id.android_recycleView)
        my_rv.adapter = RecyclerAdapter(this,titles, details, alret_details)
        my_rv.layoutManager = LinearLayoutManager(this)
    }
}