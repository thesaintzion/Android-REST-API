package com.lekkiforum.profilerapp.Services

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object TestServiceBuilder {
  var URL = "https://jsonplaceholder.typicode.com"

    // Create Logger
//    private val logger = HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)

    // Create OkHttp Client
    private val okHttp = OkHttpClient.Builder()
//    private val okHttp = OkHttpClient.Builder().addInterceptor(logger)


    // Create Retrofit Builder
    private val builder = Retrofit.Builder().baseUrl(URL)
        .addConverterFactory(GsonConverterFactory.create())
        .client(okHttp.build())

    // Create Retrofit Instance
    private val retrofit = builder.build()

    fun <T> testServiceBuild(serviceType: Class<T>): T {
        return retrofit.create(serviceType)
    }

}