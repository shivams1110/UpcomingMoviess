package com.ssalphax.upcomingmovie.ui.main

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.ssalphax.upcomingmovie.R
import com.ssalphax.upcomingmovie.data.model.Movies

class MainAdapter(context: Context, data: List<Movies>) : RecyclerView.Adapter<MainAdapter.ViewHolder>() {

    val context = context
    val data = data
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.layout_main_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val movies = data.get(position)

        holder.txtMovieName?.text = movies.name
        holder.txtMovieDate?.text = movies.releaseDate

        if (movies.adult){
            holder.txtAdult?.text = "(A)"
        }else{
            holder.txtAdult?.text = "(U/A)"
        }
        Glide.with(context).load(context.getString(R.string.image_path)+movies.image).into(holder.imagePoster!!)


    }

    class ViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {

        val imagePoster = itemView?.findViewById<ImageView>(R.id.imagePoster)
        val txtMovieName = itemView?.findViewById<TextView>(R.id.txtMovieName)
        val txtMovieDate = itemView?.findViewById<TextView>(R.id.txtMovieDate)
        val txtAdult = itemView?.findViewById<TextView>(R.id.txtMovieType)
    }
}