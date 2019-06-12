package com.example.moviecataloguekotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.moviecataloguekotlin.R.id.*
import com.example.moviecataloguekotlin.feature.Movies.MoviesFragment
import com.example.moviecataloguekotlin.feature.TvSeries.TvSeriesFragment
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        bottom_navigation.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                movies -> {
                    loadFragmentMovie(savedInstanceState)
                }
                tv_series -> {
                    loadFragmentTvSeries(savedInstanceState)
                }
            }
            true
        }
        bottom_navigation.selectedItemId = movies
    }

    private fun loadFragmentMovie(savedInstanceState: Bundle?){
        if (savedInstanceState == null) {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.main_container,
                    MoviesFragment(), MoviesFragment::class.java.simpleName)
                .commit()
        }
    }

    private fun loadFragmentTvSeries(savedInstanceState: Bundle?) {
        if (savedInstanceState == null) {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.main_container,
                    TvSeriesFragment(), TvSeriesFragment::class.java.simpleName)
                .commit()
        }
    }
}
