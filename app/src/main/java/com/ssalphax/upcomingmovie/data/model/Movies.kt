package com.ssalphax.upcomingmovie.data.model

import com.google.gson.annotations.SerializedName

data class Movies(
        @SerializedName("id")
        val _id: Integer,
        @SerializedName("title")
        val _name: String,
        @SerializedName("poster_path")
        val _imagePath: String,
        @SerializedName("adult")
        val _adult: Boolean,
        @SerializedName("release_date")
        val _releaseDate: String
) {

    val id get() = _id
    val name get() = _name
    val image get() = _imagePath
    val adult get() = _adult
    val releaseDate get() = _releaseDate
}