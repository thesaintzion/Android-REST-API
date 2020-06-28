package com.lekkiforum.profilerapp.Models


class Post
constructor(
    var id: Int,
    var title: Title,
    var status: Boolean,
    var content: Content
){
    class Title(var redered :String)
    class Content(var redered :String, var protected: Boolean)

}


class WpPostsModel(val posts: List<Post>)