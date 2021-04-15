package com.kimhyuk.test.persistence

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import io.reactivex.rxjava3.core.Completable
import io.reactivex.rxjava3.core.Flowable

@Dao
interface TodoDao {

    @Query("SELECT * FROM Todos WHERE todoId = :id")
    fun getTodoById(id: String): Flowable<Todo>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertTodo(todo: Todo): Completable

    @Query("DELETE FROM Todos")
    fun deleteAllTodos()
}