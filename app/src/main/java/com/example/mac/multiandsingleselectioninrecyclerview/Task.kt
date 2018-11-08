package com.example.mac.multiandsingleselectioninrecyclerview

import java.io.Serializable

data class Task(var description: String, var completed: Boolean = false) : Serializable