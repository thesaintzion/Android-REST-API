package com.lekkiforum.profilerapp.Activities

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.gson.GsonBuilder
import com.lekkiforum.profilerapp.Helpers.MainAdapter
import com.lekkiforum.profilerapp.Models.VideoModel
import com.lekkiforum.profilerapp.R
import okhttp3.*
import java.io.IOException

class UserListActivity : AppCompatActivity() {
    // variables
    lateinit var  recycler_view_1: RecyclerView
    private lateinit var linearLayoutManager: LinearLayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_list)

        recycler_view_1 = findViewById(R.id.recycler_view_1)
        this.recycler_view_1.setBackgroundColor(Color.LTGRAY)
        this.recycler_view_1.layoutManager = LinearLayoutManager(this)
//

// functions
        getData()
    }

//    Get data from API
    private fun getData(){
        val url = "http://api.letsbuildthatapp.com/youtube/home_feed"
        val request = Request.Builder().url(url).build()
        val client = OkHttpClient()
        client.newCall(request).enqueue(object: Callback {
            override fun onResponse(call: Call, response: Response) {
                val body = response?.body?.string()
                val gson = GsonBuilder().create()
                val  videoList = gson.fromJson(body, VideoModel::class.java)

                runOnUiThread{
                    recycler_view_1.adapter = MainAdapter(videoList)
                }
                println(videoList)
            }

            override fun onFailure(call: Call, e: IOException) {
                println("Error getting posts... $e")
            }
        })

    }

    private fun getDataWithRetrofit(){

    }
}


