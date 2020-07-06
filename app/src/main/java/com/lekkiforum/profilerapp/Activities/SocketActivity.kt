package com.lekkiforum.profilerapp.Activities

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.gson.GsonBuilder
import com.lekkiforum.profilerapp.R
import io.socket.client.IO
import io.socket.client.Socket
import okhttp3.*
import okhttp3.RequestBody.Companion.toRequestBody
import java.io.IOException

class SocketActivity: AppCompatActivity() {
    // variables
    lateinit var connectBtn: Button
    lateinit var socket: Socket
    lateinit var url: String


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_socket_connect)
        connectBtn = findViewById(R.id.bt_connect)


//Socket
        // val opts = IO.Options()
        url = "https://speed4nigeria.herokuapp.com"
         socket = IO.socket(url)

        //  Connection button
        connectBtn.setOnClickListener{
            socketCreateConnection()
        }
    }


    private fun socketCreateConnection(){
        socket.connect()

        socket?.on(Socket.EVENT_CONNECT) {
                    socketConnect()
                }

           socket?.on(Socket.EVENT_DISCONNECT) {
               socketDisconnect()
                }
    }


    // On socket connect
    private fun socketConnect(){
       Log.d("SocketLog", "==============================CONNECTED")
        Toast.makeText(this,"Socket Connected", Toast.LENGTH_LONG).show()
    }

    // On socket disconnect
    private fun socketDisconnect(){
        Log.d("SocketLog", "==============================OFF")
        Toast.makeText(this,"Socket Disconnected", Toast.LENGTH_LONG).show()
    }
}


