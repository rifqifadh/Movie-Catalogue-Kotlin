package com.example.moviecataloguekotlin.feature.Movies

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.moviecataloguekotlin.R
import com.example.moviecataloguekotlin.model.MovieDiscover

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class MoviesFragment : Fragment(), MovieContract.View {

    private lateinit var presenter: MovieContract.Presenter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view  = inflater.inflate(R.layout.fragment_movies, container, false)
        presenter = MoviePresenter(this)
        presenter.requestDataFromServer()

        return view
    }

    override fun showErrorMessage(message: String?) {

    }

    override fun showInfoMessage(message: String?) {
    }

    override fun showLoading() {

    }

    override fun hideLoading() {

    }

    override fun setData(movieItemList: ArrayList<MovieDiscover>?) {
    }

}
