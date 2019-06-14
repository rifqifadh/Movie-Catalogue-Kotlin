package com.example.moviecataloguekotlin.feature.Movies

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.StaggeredGridLayoutManager
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.moviecataloguekotlin.Adapter.MovieAdapter

import com.example.moviecataloguekotlin.R
import com.example.moviecataloguekotlin.model.Movie
import com.example.moviecataloguekotlin.model.MovieResponse
import kotlinx.android.synthetic.main.fragment_movies.*

/**
 * A simple [Fragment] subclass.
 *
 */
class MoviesFragment : Fragment(), MovieContract.View {

    private var results: MutableList<Movie> = mutableListOf()

    private lateinit var presenter: MoviePresenter
    private lateinit var movieAdapter: MovieAdapter


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view=  inflater.inflate(R.layout.fragment_movies, container, false)
        val recyclerView = view.findViewById<RecyclerView>(R.id.rv_movies)
        // recyclerView.layoutManager = GridLayoutManager(context, 2)
        recyclerView.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        movieAdapter = MovieAdapter(results) {

        }
        recyclerView.adapter = movieAdapter
        presenter = MoviePresenter(this)
        presenter.requestDataFromServer()

        return view

    }

    override fun setData(data: List<Movie>) {
        results.clear()
        data?.let { results.addAll(data) }
        movieAdapter.notifyDataSetChanged()
    }

    override fun showErrorMessage(message: String?) {
    }

    override fun showInfoMessage(message: String?) {
    }

    override fun showLoading() {

    }

    override fun hideLoading() {

    }

}
