package com.sina.fullnotecompose.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.sina.fullnotecompose.data.model.ToDoTask
import kotlinx.coroutines.flow.Flow

@Dao
interface TodoDao {


    @Query("select * from todo_table order by id asc")
    fun getAllTasks(): Flow<List<ToDoTask>>

    @Query("select * from todo_table where id=:taskId")
    fun getSelectedTask(taskId: Int): Flow<ToDoTask>

    @Update
    suspend fun updateTask(toDoTask: ToDoTask)

    @Delete
    suspend fun deleteTask(toDoTask: ToDoTask)

    @Insert
    suspend fun insertTask(toDoTask: ToDoTask)

    @Query("delete from todo_table")
    suspend fun deleteAllTask()

    @Query("select * from todo_table where title like :searchQuery or description like :searchQuery")
    fun searchDatabase(searchQuery: String): Flow<List<ToDoTask>>
}