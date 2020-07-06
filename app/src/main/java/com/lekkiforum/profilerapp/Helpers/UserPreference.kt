package com.lekkiforum.profilerapp.Helpers

import android.content.Context

class UserPreference constructor(context: Context, theUserId: String) {

    // 01
    var generalName = "OGAGA"
    var userId = theUserId
    var key = "prefValue"
    val  sharedPreference = context.getSharedPreferences(generalName, Context.MODE_PRIVATE)

    // 02 (Edit shared preference and put data)
    var editor = sharedPreference.edit().putString(key, userId)



}