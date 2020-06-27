package com.lekkiforum.profilerapp.Helpers

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.lekkiforum.profilerapp.Models.TodoModel
import com.lekkiforum.profilerapp.R

class TodoAdapter(private val todoList: List<TodoModel>): RecyclerView.Adapter<TodoAdapter.ViewHolder>() {


//    01
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_list_card, parent, false)
        return ViewHolder(view)
    }


//    02
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.todo = todoList[position]
        holder.todoName.text = todoList[position].title

//        holder.itemView.setOnClickListener { v ->
//            val context = v.context
//            val intent = Intent(context, DestinationDetailActivity::class.java)
//            intent.putExtra(DestinationDetailActivity.ARG_ITEM_ID, holder.destination!!.id)
//
//            context.startActivity(intent)
//        }
    }


//    03
    override fun getItemCount(): Int {
        return todoList.size
    }



//    04
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val todoName: TextView = itemView.findViewById(R.id.txv_list_card)
        var todo: TodoModel? = null

        override fun toString(): String {
            return """${super.toString()} '${todoName.text}'"""
        }
    }
}