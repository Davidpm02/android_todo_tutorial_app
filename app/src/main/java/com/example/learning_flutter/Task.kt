package com.example.learning_flutter

data class Task (val name:String, val category: TaskCategory, var isSelected:Boolean = false) {
}