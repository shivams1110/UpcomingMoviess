package com.ssalphax.upcomingmovie.data.rest

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ApiClient {

    companion object {
        val BASE_URL: String = "https://api.themoviedb.org/3/movie/"

        fun getClient(): Retrofit {
            val retrofit = Retrofit.Builder()
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl(BASE_URL)
                    .build()

            return retrofit
        }

    }

}