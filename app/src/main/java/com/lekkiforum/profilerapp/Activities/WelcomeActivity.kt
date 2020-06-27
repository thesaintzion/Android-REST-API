package com.lekkiforum.profilerapp.Activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.gson.GsonBuilder
import com.lekkiforum.profilerapp.Models.VideoModel
import com.lekkiforum.profilerapp.R
import okhttp3.*
import java.io.IOException
import java.util.*

class WelcomeActivity : AppCompatActivity() {
// variables
lateinit var getStartedBtn: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        this.getStartedBtn = findViewById(R.id.bt_get_started)

      //  Got to next page...
        this.getStartedBtn.setOnClickListener{
            startActivity(Intent(this, UserListActivity::class.java))
            finish()
        }

//        get data
        getData();
    }


}
private fun getData(){
    val url = "http://api.letsbuildthatapp.com/youtube/home_feed"
    val request = Request.Builder().url(url).build()
    val client = OkHttpClient()
    client.newCall(request).enqueue(object: Callback{
        override fun onResponse(call: Call, response: Response) {
            val body = response?.body?.string()
            val gson = GsonBuilder().create()
            val homeFeed = gson.fromJson(body, VideoModel::class.java)
            println(homeFeed)
        }

        override fun onFailure(call: Call, e: IOException) {
            println("Error getting posts... $e")
        }
    })

}




