package com.ssalphax.upcomingmovie.ui.main

import com.ssalphax.upcomingmovie.data.model.Movies

interface MainView {

    fun hideProgress()

    fun loadData(data: List<Movies>)
}