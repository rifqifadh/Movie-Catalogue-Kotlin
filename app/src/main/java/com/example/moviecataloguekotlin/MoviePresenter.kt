package com.example.moviecataloguekotlin

import android.util.Log
import android.widget.Toast
import com.example.moviecataloguekotlin.BuildConfig.API_KEY
import com.example.moviecataloguekotlin.model.MovieDiscover
import com.example.moviecataloguekotlin.model.MovieResponse
import com.example.moviecataloguekotlin.network.ApiConfig
import retrofit2.Call
import retrofit2.Response
import retrofit2.adapter.rxjava2.Result.response
import retrofit2.adapter.rxjava2.Result.response





class MoviePresenter(val view: MovieDiscoverContract.View) : MovieDiscoverContract.Presenter {



    override fun requestDataFromServer() {

//        view.showLoading()

        ApiConfig().instance().getListMovie(API_KEY)
            .enqueue(object : retrofit2.Callback<MovieResponse> {
                override fun onFailure(call: Call<MovieResponse>?, t: Throwable) {
                    Log.d("TAG", "message: " + t)
                }

                override fun onResponse(call: Call<MovieResponse>?, response: Response<MovieResponse>?) {
                    val movieItems = response?.body()?.results
                    val movie = response?.body()
                    view.setData(movieItems)

//                    view.
                }
            })
    }
}