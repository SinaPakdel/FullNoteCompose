package com.sina.fullnotecompose.di

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import com.sina.fullnotecompose.data.TodoDatabase
import com.sina.fullnotecompose.util.DATABASE_NAME
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {


    @Provides
    @Singleton
    fun provideDatabase(
        @ApplicationContext context: Context,
    ) = Room.databaseBuilder(context, TodoDatabase::class.java, DATABASE_NAME).build()


    @Provides
    @Singleton
    fun provideDao(todoDatabase: TodoDatabase) = todoDatabase.todoDao()
}