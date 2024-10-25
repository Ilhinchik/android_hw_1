package com.example.lecture_3

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MyActivity: AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var fab: FloatingActionButton

    private val adapter = MyAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recycler_view)
        fab = findViewById(R.id.fab)

        recyclerView.adapter = adapter

        fab.setOnClickListener {
            adapter.addItems(adapter.itemCount + 1)
        }

        savedInstanceState?.let {
            val items = it.getIntegerArrayList("items") ?: listOf()
            adapter.setItems(items)
        }

    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putIntegerArrayList("items", ArrayList(adapter.getItems()))
    }

}