package com.sina.fullnotecompose.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.sina.fullnotecompose.data.model.ToDoTask

@Database(entities = [ToDoTask::class], version = 1)
abstract class TodoDatabase :RoomDatabase(){
    abstract fun todoDao():TodoDao
}