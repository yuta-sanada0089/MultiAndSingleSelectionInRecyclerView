package com.example.mac.multiandsingleselectioninrecyclerview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById(R.id.selection_list) as RecyclerView
        val layoutManager = LinearLayoutManager(this)
        val adapter = Adapter(getSampleTasks())
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = adapter
    }

    private fun getSampleTasks(): MutableList<Task> {
        val task1 = Task("task1")
        val task2 = Task("task2", true)

        return mutableListOf(task1, task2)
    }
}
