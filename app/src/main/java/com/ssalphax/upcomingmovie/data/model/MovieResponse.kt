package com.ssalphax.upcomingmovie.data.model

import com.google.gson.annotations.SerializedName

data class MovieResponse(@SerializedName("results") val results: List<Movies>) {

    val movies get() = results
}