package com.lekkiforum.profilerapp.Activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.gson.GsonBuilder
import com.lekkiforum.profilerapp.Helpers.MainAdapter
import com.lekkiforum.profilerapp.Models.VideoModel
import com.lekkiforum.profilerapp.R
import kotlinx.android.synthetic.main.activity_welcome.*
import okhttp3.*
import okhttp3.RequestBody.Companion.toRequestBody
import java.io.IOException

class WelcomeActivity : AppCompatActivity() {
// variables
    lateinit var getStartedBtn: Button
    lateinit var socketBtn: Button
    lateinit var onlineUsersBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        this.getStartedBtn = findViewById(R.id.bt_get_started)
        this.socketBtn = findViewById(R.id.bt_socket)

      //  Got to next page...
        this.getStartedBtn.setOnClickListener{
            startActivity(Intent(this, UserListActivity::class.java))
//            finish()
        }

        this.socketBtn.setOnClickListener{
            startActivity(Intent(this, SocketActivity::class.java))
//            finish()
        }

        bt_online_users.setOnClickListener{
            startActivity(Intent(this, OnlineUserActivity::class.java))
//            finish()
        }

//        this.postData()
    }


    private fun postData(){
var url2 = "speed4nigeria.herokuapp.com/api/auth"
        val client = OkHttpClient()
        var id_token = "ioeieieie"
        var reqBody = id_token.toRequestBody()
        val url = "http://api.letsbuildthatapp.com/youtube/home_feed"
        val request = Request.Builder().method("POST", reqBody).url(url2).build()
        client.newCall(request).enqueue(object: Callback {
            override fun onResponse(call: Call, response: Response) {
                val body = response?.body?.string()
                val gson = GsonBuilder().create()
//                val  videoList = gson.fromJson(body, VideoModel::class.java)

                println( body)
            }

            override fun onFailure(call: Call, e: IOException) {
                println("Error getting posts... $e")
            }
        })

    }
}





