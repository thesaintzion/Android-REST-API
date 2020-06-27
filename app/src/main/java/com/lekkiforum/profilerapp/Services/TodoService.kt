package com.lekkiforum.profilerapp.Services

import com.lekkiforum.profilerapp.Models.TodoModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface TodoService {
// Get  some todos
    @GET("/todos")
    fun getTodos(@Query("api_key") key: String): Call<TodoModel>
}