package com.example.moviecataloguekotlin.model

import com.google.gson.annotations.SerializedName

data class MovieResponse(

    @SerializedName("results")
    val results: List<MovieDiscover>?
)