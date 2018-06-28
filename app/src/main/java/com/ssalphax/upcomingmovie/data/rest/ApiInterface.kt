package com.ssalphax.upcomingmovie.data.rest

import com.ssalphax.upcomingmovie.data.model.MovieResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiInterface {

    @GET("upcoming")
    fun loadMovies(@Query("api_key") api_key: String): Call<MovieResponse>
}