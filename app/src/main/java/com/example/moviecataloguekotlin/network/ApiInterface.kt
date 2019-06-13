package com.example.moviecataloguekotlin.network

import com.example.moviecataloguekotlin.model.MovieResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {

    @GET("discover/movie")
    fun getListMovie(@Query("api_key") apiKey: String): Call<MovieResponse>

}