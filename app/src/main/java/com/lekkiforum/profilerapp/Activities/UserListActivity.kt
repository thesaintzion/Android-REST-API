package com.lekkiforum.profilerapp.Activities

import android.graphics.Color
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.gson.GsonBuilder
import com.lekkiforum.profilerapp.Helpers.MainAdapter
import com.lekkiforum.profilerapp.Models.VideoModel
import com.lekkiforum.profilerapp.R
import okhttp3.*
import okhttp3.RequestBody.Companion.toRequestBody
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
        postData()
        getData()


    }

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

    private fun postData(){
        val tag = "SAINT"
        var url = "https://speed4nigeria.herokuapp.com/api/auth"
        val client = OkHttpClient()
        var id_token = "ioeieieie"
        var reqBody = id_token.toRequestBody()
        val request = Request.Builder()
            .method("POST", reqBody).url(url).build()

        client.newCall(request).enqueue(object: Callback {
            override fun onResponse(call: Call, response: Response) {
                val body = response?.body?.string()
//                val gson = GsonBuilder().create()
//                val  videoList = gson.fromJson(body)

//                println(body)
                Log.i(tag, body);
            }

            override fun onFailure(call: Call, e: IOException) {
//                println("Error getting posts... $e")
                Log.i(tag, e.message);

            }
        })

    }


}


