package com.example.moviecataloguekotlin.Adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.moviecataloguekotlin.R
import com.example.moviecataloguekotlin.model.Movie
import org.jetbrains.anko.find
import org.jetbrains.anko.lines

class MovieAdapter(private val results: MutableList<Movie>,
                   private val listener: (Movie) -> Unit): RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        return MovieViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent,false))
    }

    override fun getItemCount(): Int = results.size

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.bind(results[position], listener)
    }

    class MovieViewHolder(val view: View): RecyclerView.ViewHolder(view) {

        private val moviesTitle: TextView = view.find(R.id.title_movies)
        private val moviesPoster: ImageView = view.find(R.id.image_poster)
        private val moviesRate: TextView = view.find(R.id.rate_movie)

        fun bind(results: Movie, listener: (Movie) -> Unit) {
            moviesTitle.text = results.title
            moviesRate.text = results.voteAverage.toString()
            Glide.with(view.context).load("https://image.tmdb.org/t/p/w300/" + results.posterPath).into(moviesPoster)

            itemView.setOnClickListener { listener(results) }
        }
    }
}
