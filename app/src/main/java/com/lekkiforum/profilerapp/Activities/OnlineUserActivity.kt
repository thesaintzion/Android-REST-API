package com.lekkiforum.profilerapp.Activities

import android.graphics.Color
import android.os.Bundle
import android.os.CountDownTimer
import android.text.method.ScrollingMovementMethod
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.gson.GsonBuilder
import com.lekkiforum.profilerapp.Helpers.MainAdapter
import com.lekkiforum.profilerapp.Models.PostModule
import com.lekkiforum.profilerapp.Models.VideoModel
import com.lekkiforum.profilerapp.Models.VideoModelTwo
import com.lekkiforum.profilerapp.R
import com.lekkiforum.profilerapp.Services.TestService
import com.lekkiforum.profilerapp.Services.apiInterfaces
import kotlinx.android.synthetic.main.activity_online_users.*
import okhttp3.*
import okhttp3.RequestBody.Companion.toRequestBody
import org.w3c.dom.Text
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.io.IOException

class OnlineUserActivity:  AppCompatActivity() {
    // variables
    lateinit var  recycler_view_1: RecyclerView
    private lateinit var linearLayoutManager: LinearLayoutManager
    private lateinit var timer: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_online_users)

        var actionBar  = supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(true);
        actionBar?.title = "Welcome"
//        timer = findViewById(R.id.txt_timer)

        object : CountDownTimer(100000, 1000){
            override fun onFinish() {
                txt_timer.text = "0"
            }
            override fun onTick(p: Long) {
                var theTime = p / 1000
                txt_timer.text = theTime.toString()
            }
        }.start()

    }

//    private fun timer(){
//        object : CountDownTimer(1000000, 1000){
//            override fun onFinish() {
//                timer.text = "0"
//            }
//
//            override fun onTick(p: Long) {
//                timer.text = p.toString()
//            }
//
//        }
//    }
}

