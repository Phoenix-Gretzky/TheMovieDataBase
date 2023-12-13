package com.example.themoviedatabase.data.api

import com.example.themoviedatabase.data.model.artist.ArtistList
import com.example.themoviedatabase.data.model.movie.MoviesList
import com.example.themoviedatabase.data.model.tvshow.TvShowList
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface TBDMService {


    @GET("/movie/popular")
    suspend fun getPopularMovies(@Query("api_key") api_key : String):Response<MoviesList>

    @GET("/tv/popular")
    suspend fun getPopularTvShows(@Query("api_key") api_key : String):Response<TvShowList>

    @GET("/person/popular")
    suspend fun getPopularArtists(@Query("api_key") api_key : String):Response<ArtistList>

}