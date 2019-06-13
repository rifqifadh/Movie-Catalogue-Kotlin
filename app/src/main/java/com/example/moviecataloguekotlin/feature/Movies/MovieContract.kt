package com.example.moviecataloguekotlin.feature.Movies

import com.example.moviecataloguekotlin.Base.BaseView
import com.example.moviecataloguekotlin.model.Movie
import com.example.moviecataloguekotlin.model.MovieResponse

interface MovieContract {

    interface Presenter {
        fun requestDataFromServer()
    }

//     interface View {
//         fun showLoading()
//         fun hideLoading()
//         fun setData(movieItemList: List<MovieDiscover>?)
//         fun onResponseFailure(throwable: Throwable)
//     }

    interface View : BaseView {
        fun setData(data: List<Movie>)
    }
}