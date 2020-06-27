package com.lekkiforum.profilerapp.Models

class Video
constructor(
    var id: Int,
    var name: String? = null,
    var link: String? = null,
    var imageUrl: String? = null,
    var numberOfViews: Int,
    var channel: Channel
){

    class Channel(var name: String, var profileImageUrl: String, var numberOfSubscribers: String)

}


class VideoUser constructor(val id: Int, val name: String, val username: String)


class VideoModel(val user: VideoUser, val videos: List<Video>)