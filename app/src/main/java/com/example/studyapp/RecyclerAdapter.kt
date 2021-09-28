package com.example.studyapp

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_row.view.*

class RecyclerAdapter (private val activity: Activity, private val titles: List<String>,
                       private val details: List<String>, private val topic_description: List<String>):
    RecyclerView.Adapter<RecyclerAdapter.ItemViewHolder>() {
    class ItemViewHolder(ItemView: View): RecyclerView.ViewHolder(ItemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_row,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val title = titles[position]
        val detail = details[position]
        val topic_description = topic_description[position]

        holder.itemView.apply {
            title_textView.text = title
            detail_textView.text = detail
            card_view.setOnClickListener { AlertDialog_Custom(activity, title, topic_description) }
        }
    }

    override fun getItemCount(): Int = titles.size
}