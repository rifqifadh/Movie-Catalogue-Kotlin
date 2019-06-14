package com.example.moviecataloguekotlin.model

import com.google.gson.annotations.SerializedName

data class Movie (

    var id: Int? = null,

    @SerializedName("title")
    var title: String? = null,

    @SerializedName("poster_path")
    var posterPath: String? = null,

    @SerializedName("overview")
    var overview: String? = null,

    @SerializedName("release_date")
    var releaseDate: String? = null,

    @SerializedName("vote_average")
    var voteAverage: Float? = null
)