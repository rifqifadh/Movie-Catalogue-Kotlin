package com.example.moviecataloguekotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.util.Log
import com.example.moviecataloguekotlin.model.MovieDiscover

class MainActivity : AppCompatActivity(), MovieDiscoverContract.View  {
    override fun showLoading() {
    }

    override fun hideLoading() {
    }

    override fun setData(movieItemList: List<MovieDiscover>?) {
//        movieItemList.
    }

    override fun onResponseFailure(throwable: Throwable) {
    }

    lateinit var presenter: MovieDiscoverContract.Presenter
    private lateinit var presenterr: MoviePresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        presenterr = MoviePresenter(this)
//        Log.d("response: ", "result" + presenter)
        presenter = MoviePresenter(this)
        presenter.requestDataFromServer()


//        presenter = MovieDiscoverPresenter()
    }

//    override fun movieLoaded(data: ArrayList<MovieDiscover>)
}
