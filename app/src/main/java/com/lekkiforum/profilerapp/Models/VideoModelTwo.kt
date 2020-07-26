package com.lekkiforum.profilerapp.Models

import com.google.gson.annotations.SerializedName

class VideoModelTwo {
    @SerializedName("videos")
    var video = ArrayList<VideoTwo>()
    @SerializedName("user")
    var main: userTow? = null
}

class userTow{
    @SerializedName("id")
    var id: Int = 0

    @SerializedName("name")
    var name: String? = null

    @SerializedName("username")
    var username: String? = null
}

class VideoTwo{
    @SerializedName("id")
    var id: Int = 0

    @SerializedName("name")
    var name: String? = null

    @SerializedName("link")
    var link: String? = null

    @SerializedName("imageUrl")
    var imageUrl: String? = null

    @SerializedName("numberOfViews")
    var numberOfViews: Int = 0

    @SerializedName("channel")
    var channel: Channel? = null
}
class Channel {
    @SerializedName("name")
    var name: String? = null

    @SerializedName("profileImageUrl")
    var profileImageUrl: String? = null

    @SerializedName("numberOfSubscribers")
    var numberOfSubscribers: String? = null
}


