//package com.lekkiforum.profilerapp.Helpers
//
//import android.graphics.Color
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import androidx.recyclerview.widget.RecyclerView
//import com.lekkiforum.profilerapp.Models.VideoModel
//import com.lekkiforum.profilerapp.Models.WpPostsModel
//import com.lekkiforum.profilerapp.R
//import kotlinx.android.synthetic.main.activity_user_row.view.*
//
//class WpPostsAdapter (val wpPostsModel: WpPostsModel): RecyclerView.Adapter<WpViewHolderOne>() {
//
//    var listItems = listOf("The  Title", "The  Tile", "The Title", "The  Title", "The  Title", "The  Title", "The  Title", "The  Title")
//
//
//    //    the on create
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WpViewHolderOne {
//        val layoutInflater = LayoutInflater.from(parent?.context)
//        val callInflater = layoutInflater.inflate(R.layout.activity_user_row, parent, false)
//        return WpViewHolderOne(callInflater)
//    }
//
//    //    the onClick...
//    override fun onBindViewHolder(holder: ViewHolderOne, position: Int) {
//        var thePosition = position+1
//        var post =  wpPostsModel.posts[position]
//        holder?.view?.tv_row_title?.text = "${post.title} ($thePosition)"
//        holder?.view?.tv_row_subtitle?.text = "${post.title}"
////        holder?.view?.tv_row_subtitle?.im_row_img?.setImageURI("${}")
//
//        if(thePosition == 6){
//            holder?.view?.ll_row_list_card?.setBackgroundColor(Color.LTGRAY)
//            holder?.view?.tv_row_subtitle?.text = "Compleated ($thePosition)"
//        }
//
//
//    }
//
//    //    the item count
//    override fun getItemCount(): Int {
//        return  wpPostsModel.posts.count()
//    }
//
//
////    The view holder...
//
//}
//class WpViewHolderOne(val  view: View): RecyclerView.ViewHolder(view)