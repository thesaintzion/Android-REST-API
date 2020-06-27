package com.lekkiforum.profilerapp.Models

data class TodoModel(
    var userId: Int,
    var id: Int = 0,
    var title: String? = null,
    var completed:  Boolean
)

