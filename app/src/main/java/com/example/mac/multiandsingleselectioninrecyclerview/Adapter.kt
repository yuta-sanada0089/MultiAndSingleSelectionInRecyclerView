package com.example.mac.multiandsingleselectioninrecyclerview

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.CheckedTextView
import android.widget.TextView
import java.util.ArrayList

class Adapter(var tasks: MutableList<Task>) : RecyclerView.Adapter<Adapter.TaskViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
        val context = parent?.context
        val view = LayoutInflater.from(context)?.inflate(R.layout.checked_item, parent, false)
        return TaskViewHolder(view!!)
    }

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        holder?.bindTask(tasks[position])
    }

    override fun getItemCount(): Int {
        return tasks.size
    }

    inner class TaskViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val descriptionTextView = view?.findViewById(R.id.task_description) as? TextView
        val completedCheckBox = view?.findViewById(R.id.task_completed) as? CheckBox
        fun bindTask(task: Task) {
            descriptionTextView?.text = task.description
            completedCheckBox?.isChecked = task.completed

            completedCheckBox?.setOnCheckedChangeListener { buttonView, isChecked ->
                tasks[adapterPosition].completed = isChecked
            }
        }
    }
}