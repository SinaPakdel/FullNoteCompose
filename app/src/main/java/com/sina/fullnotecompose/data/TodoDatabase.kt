package com.sina.fullnotecompose.data

import androidx.room.Database
import com.sina.fullnotecompose.data.model.ToDoTask

@Database(entities = [ToDoTask::class], version = 1)
abstract class TodoDatabase {
    abstract fun todoDao():TodoDao
}