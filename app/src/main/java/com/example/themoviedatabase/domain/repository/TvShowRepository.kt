package com.example.themoviedatabase.domain.repository

import com.example.themoviedatabase.data.model.tvshow.TvShow
import com.example.themoviedatabase.data.model.tvshow.TvShowList

interface TvShowRepository {

    suspend fun getTvShow():List<TvShow>
    suspend fun updateTvShow(tvShowList: ArrayList<TvShow>)

}