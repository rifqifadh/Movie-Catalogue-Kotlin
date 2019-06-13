package com.example.moviecataloguekotlin.Adapter

import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.moviecataloguekotlin.R
import com.example.moviecataloguekotlin.model.Movie

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

        private val moviesTitle: TextView = view.findViewById(R.id.title_movies)
        private val moviesPoster: ImageView = view.findViewById(R.id.image_poster)

        fun bind(results: Movie, listener: (Movie) -> Unit) {
            moviesTitle.text = results.title
            // Glide.with(view.context).load(results.posterPath).into(moviesPoster)
            Glide.with(view.context).load("https://image.tmdb.org/t/p/w300/" + results.posterPath).into(moviesPoster)
            // Log.d("IMAGE", results.posterPath)

            itemView.setOnClickListener { listener(results) }
        }
    }
}
