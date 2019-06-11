package com.example.moviecataloguekotlin

import com.example.moviecataloguekotlin.model.MovieDiscover
import com.example.moviecataloguekotlin.model.MovieResponse

interface MovieDiscoverContract {

    interface Presenter {
        fun requestDataFromServer()
    }

    interface View {
        fun showLoading()
        fun hideLoading()
        fun setData(movieItemList: List<MovieDiscover>?)
        fun onResponseFailure(throwable: Throwable)
//        fun onResponse
    }

    interface Model {

        interface OnFinishedListener {
            fun onFinished(movieItemList: List<MovieDiscover>)

            fun onFailure(throwable: Throwable)
        }

        fun getMovieList(onFinishedListener: OnFinishedListener)
    }
}