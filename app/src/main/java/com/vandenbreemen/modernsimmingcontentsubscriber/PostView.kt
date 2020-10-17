package com.vandenbreemen.modernsimmingapp.subscriber

/**
 *
 */
data class PostView(

    val id: Int,

    val postedDate: Long,

    val title: String,

    val url: String,

    val content: String
) {

    /**
     * Indicate that an app (such as a playback list) has selected this post
     */
    var selected: Boolean = false

}