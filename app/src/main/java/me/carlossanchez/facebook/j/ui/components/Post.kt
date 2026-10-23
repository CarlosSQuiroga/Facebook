package me.carlossanchez.facebook.j.ui.components

data class Post(
    val id: Int,
    val author: String,
    val time: String, 
    val content: String,
    val comments: Int,
    val liked: Boolean = false
)