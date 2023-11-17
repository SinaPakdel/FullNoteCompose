package com.sina.fullnotecompose.data.repository

import com.sina.fullnotecompose.data.TodoDao
import com.sina.fullnotecompose.data.model.ToDoTask
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class TodoRepository @Inject constructor(private val todoDao: TodoDao) {

    val getAllTasks = todoDao.getAllTasks()
    val sortByLowPriority = todoDao.sortByLowPriority()
    val sortByHighPriority = todoDao.sortByHighPriority()

    fun getSelectedTas(taskId: Int): Flow<ToDoTask> = todoDao.getSelectedTask(taskId)
    suspend fun addTask(toDoTask: ToDoTask) = todoDao.insertTask(toDoTask)

    suspend fun updateTask(toDoTask: ToDoTask) = todoDao.updateTask(toDoTask)
    suspend fun deleteTask(toDoTask: ToDoTask) = todoDao.deleteTask(toDoTask)

    suspend fun deleteAllTask() = todoDao.deleteAllTask()

    fun searchQuery(searchQuery: String) = todoDao.searchDatabase(searchQuery)


}