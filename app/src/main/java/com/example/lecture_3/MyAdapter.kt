package com.example.lecture_3

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(): RecyclerView.Adapter<MyViewHolder>() {

    private val items = ArrayList<Int>()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_view, parent, false)
        return MyViewHolder(view)
    }
    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(items[position])
    }

    fun setItems(list: List<Int>) {
        items.clear()
        items.addAll(list)
        notifyDataSetChanged()
    }

    fun addItems(item: Int) {
        items.add(item)
        notifyDataSetChanged()
    }

    fun getItems(): List<Int> = items
}