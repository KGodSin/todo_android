package com.kimhyuk.test.persistence

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*


@Entity(tableName ="todos")
class Todo(@PrimaryKey
           @ColumnInfo(name ="todoId")
           val id: String = UUID.randomUUID().toString(),
           @ColumnInfo(name = "title")
           val title: String,
           @ColumnInfo(name ="description")
           val description: String
)