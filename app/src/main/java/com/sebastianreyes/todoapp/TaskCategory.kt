package com.sebastianreyes.todoapp

sealed class TaskCategory{
    object Personal: TaskCategory()
    object Negocios: TaskCategory()
    object Estudios: TaskCategory()
    object Otros: TaskCategory()
}
