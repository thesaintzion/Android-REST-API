package com.lekkiforum.profilerapp.Services

import com.lekkiforum.profilerapp.Models.TestModel
import com.lekkiforum.profilerapp.Models.VideoModel
import com.lekkiforum.profilerapp.Models.VideoModelTwo
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface TestService {
        @GET("/todos")
        fun getTestList(): Call<TestModel>


        @GET("/youtube/home_feed")
        fun  getYoutubeList(): Call<VideoModelTwo>

}