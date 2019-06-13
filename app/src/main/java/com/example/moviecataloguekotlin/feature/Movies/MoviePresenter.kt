package com.example.moviecataloguekotlin.feature.Movies

import android.util.Log
import com.example.moviecataloguekotlin.BuildConfig.API_KEY
import com.example.moviecataloguekotlin.model.MovieResponse
import com.example.moviecataloguekotlin.network.ApiConfig
import retrofit2.Call
import retrofit2.Response




class MoviePresenter(var view: MovieContract.View) :
    MovieContract.Presenter {

    override fun requestDataFromServer() {
        ApiConfig().instance().getListMovie(API_KEY)
            .enqueue(object : retrofit2.Callback<MovieResponse> {
                override fun onFailure(call: Call<MovieResponse>, t: Throwable) {

                }

                override fun onResponse(call: Call<MovieResponse>, response: Response<MovieResponse>) {
                    val moviesItems = response.body()!!.results
                    view.setData(moviesItems)
                }
            })
    }
}