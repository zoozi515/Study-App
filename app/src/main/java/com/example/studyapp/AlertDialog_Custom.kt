package com.example.studyapp

import android.app.Activity
import android.app.AlertDialog
import android.content.DialogInterface

class AlertDialog_Custom (activity: Activity, title: String, details: String) {
    init {
        val dialogBuilder = AlertDialog.Builder(activity)

        dialogBuilder.setMessage(details)
            // positive button
            .setPositiveButton("OK", DialogInterface.OnClickListener {
                    dialog, id -> dialog.cancel()
            })

        val alert = dialogBuilder.create()
        alert.setTitle(title)
        alert.show()
    }
}