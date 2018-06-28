package com.ssalphax.upcomingmovie.ui.main

import android.content.Context
import com.ssalphax.upcomingmovie.data.model.MovieResponse
import com.ssalphax.upcomingmovie.data.rest.ApiClient
import com.ssalphax.upcomingmovie.data.rest.ApiInterface
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainPresenterImpl(mainActivity: MainView, applicationContext: Context) : MainPresenter {

    val mainView = mainActivity
    val context = applicationContext


    override fun loadData(api_key: String) {
        val apiInterface = ApiClient.getClient().create(ApiInterface::class.java)

//        val call = apiInterface.loadMovies(api_key);

        val call: Call<MovieResponse> = apiInterface.loadMovies(api_key)

        call.enqueue(object: Callback<MovieResponse>{
            override fun onFailure(call: Call<MovieResponse>?, t: Throwable?) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onResponse(call: Call<MovieResponse>?, response: Response<MovieResponse>?) {

                response?.body()?.movies?.let { mainView.loadData(it) }
                mainView.hideProgress()
            }
        })

    }



}