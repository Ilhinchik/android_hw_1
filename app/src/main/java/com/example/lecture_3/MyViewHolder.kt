package com.example.lecture_3

import android.graphics.Color
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyViewHolder(view: View): RecyclerView.ViewHolder(view) {

    val text = view.findViewById<TextView>(R.id.text_1)
    val image = view.findViewById<ImageView>(R.id.image)

    fun bind(number: Int) {
        text.text = number.toString()
        image.setBackgroundColor(if (number % 2 == 0) Color.RED else Color.BLUE)
    }
}