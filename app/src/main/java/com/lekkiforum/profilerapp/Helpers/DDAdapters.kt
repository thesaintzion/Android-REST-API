package com.lekkiforum.profilerapp.Helpers

import android.content.Intent
import android.util.Log
import com.lekkiforum.profilerapp.Activities.DDDetailActivity
import com.lekkiforum.profilerapp.Models.DDModel
import com.lekkiforum.profilerapp.R

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class DDAdapters(private val destinationList: List<DDModel>) : RecyclerView.Adapter<DDAdapters.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

// NOTE:
        val view = LayoutInflater.from(parent.context).inflate(R.layout.dd_list_item, parent, false)
        return ViewHolder(view)
    }



//  NOTE: Bind view holder
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.destination = destinationList[position]
        holder.txvDestination.text = destinationList[position].city
//    Toast.makeText(this, "")

//        holder.itemView.setOnClickListener { v ->
//            val context = v.context
//            val intent = Intent(context, DDDetailActivity::class.java)
//
//            intent.putExtra(DDDetailActivity.ARG_ITEM_ID, holder.d n!!.id)
//
//            context.startActivity(intent)
//        }
    }

    override fun getItemCount(): Int {
        return destinationList.size
    }



//    NOTE: handles view..
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val txvDestination: TextView = itemView.findViewById(R.id.txv_destination)
        var destination: DDModel? = null

        override fun toString(): String {
            return """${super.toString()} '${txvDestination.text}'"""
        }
    }
}