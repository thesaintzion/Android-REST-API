package com.lekkiforum.profilerapp.Helpers

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.lekkiforum.profilerapp.Models.VideoModel
import com.lekkiforum.profilerapp.R
import kotlinx.android.synthetic.main.activity_user_row.view.*

class MainAdapter constructor(val videoModel: VideoModel): RecyclerView.Adapter<ViewHolderOne>() {

    var listItems = listOf("The  Title", "The  Tile", "The Title", "The  Title", "The  Title", "The  Title", "The  Title", "The  Title")


//    the on create
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderOne {
    val layoutInflater = LayoutInflater.from(parent?.context)
    val callInflater = layoutInflater.inflate(R.layout.activity_user_row, parent, false)
    return ViewHolderOne(callInflater)
    }

    //    the onClick...
    override fun onBindViewHolder(holder: ViewHolderOne, position: Int) {
        var thePosition = position+1
        var title = listItems[position]
        holder?.view?.tv_row_title?.text = "$title ($thePosition)"
        holder?.view?.tv_row_subtitle?.text = "The subtitle ($thePosition)"

        if(thePosition == 6){
            holder?.view?.ll_row_list_card?.setBackgroundColor(Color.LTGRAY)
            holder?.view?.tv_row_subtitle?.text = "Compleated ($thePosition)"
        }


    }

//    the item count
    override fun getItemCount(): Int {
        return  listItems.size
    }


//    The view holder...

}
class ViewHolderOne(val  view: View): RecyclerView.ViewHolder(view) {

}