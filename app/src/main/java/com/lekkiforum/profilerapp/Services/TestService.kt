package com.lekkiforum.profilerapp.Services

import com.lekkiforum.profilerapp.Models.TestModel
import com.lekkiforum.profilerapp.Models.VideoModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface TestService {
        @GET("/todos")
        fun getTestList(): Call<TestModel>

}