package com.example.moviecataloguekotlin.model

import com.google.gson.annotations.SerializedName

data class MovieDiscover (

    @SerializedName("title")
    var title: String? = null,

    @SerializedName("poster_path")
    var posterPath: String? = null,

    @SerializedName("overview")
    var overview: String? = null,

    @SerializedName("release_date")
    var releaseDate: String? = null
)