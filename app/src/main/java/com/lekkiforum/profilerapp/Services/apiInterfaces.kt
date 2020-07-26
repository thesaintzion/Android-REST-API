package com.lekkiforum.profilerapp.Services

import com.lekkiforum.profilerapp.Models.PostModule
import retrofit2.Call
import retrofit2.http.GET

interface apiInterfaces {

    @GET("posts")
   fun getPosts(): Call<List<PostModule>>
}