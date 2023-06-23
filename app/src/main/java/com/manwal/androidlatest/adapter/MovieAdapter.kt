package com.manwal.androidlatest.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.manwal.androidlatest.databinding.MovieLayoutBinding
import com.manwal.androidlatest.model.Result

class MovieAdapter : RecyclerView.Adapter<MovieAdapter.ViewHolder>() {
    private var movieList = ArrayList<Result>()

    @SuppressLint("NotifyDataSetChanged")
    fun setMovieList(movieList: List<Result>) {
        this.movieList = movieList as ArrayList<Result>
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            MovieLayoutBinding.inflate(
                LayoutInflater.from(
                    parent.context
                )
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Glide.with(holder.itemView)
            .load("https://image.tmdb.org/t/p/w500" + movieList[position].poster_path)
            .into(holder.binding.movieImage)
        holder.binding.movieName.text = movieList[position].title
    }

    override fun getItemCount(): Int {
        return movieList.size
    }

    class ViewHolder(val binding: MovieLayoutBinding) : RecyclerView.ViewHolder(binding.root) {}

}