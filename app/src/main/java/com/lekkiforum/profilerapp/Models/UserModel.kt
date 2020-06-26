package com.lekkiforum.profilerapp.Models

import java.util.*

data  class UserModel(
    var _id: String? = null,
    var name: String? = null,
    var gmail_Id: String?  = null,
    var email: String? = null,
    var verified_email: String? = null,
    val given_name: String? = null,
    var family_name: String? = null,
    var picture: String? = null,
    var locale: String? = null,
    var date: Date
)