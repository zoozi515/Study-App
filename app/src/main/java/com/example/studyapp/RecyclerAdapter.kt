package com.example.studyapp

import android.app.Activity
import android.view.LayoutInflater
import androidx.recyclerview.widget.RecyclerView
import android.view.ViewGroup
import com.example.studyapp.databinding.ItemRowBinding

class RecyclerAdapter(private val activity: Activity, private val items: ArrayList<ArrayList<String>>):
    RecyclerView.Adapter<RecyclerAdapter.ItemViewHolder>() {
    class ItemViewHolder(val binding: ItemRowBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(
            ItemRowBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.binding.apply {
            title_textView.text = items[position][0]
            detail_textView.text = items[position][1]
            card_view.setOnClickListener { AlertDialog_Custom(activity, items[position][0], items[position][2]) }
        }
    }

    override fun getItemCount() = items.size
}