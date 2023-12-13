package com.example.themoviedatabase.domain.repository

import com.example.themoviedatabase.data.model.movie.Movie

interface MoviesRepository {

    suspend fun getMovies():List<Movie>
    suspend fun updateMovies(movieList:ArrayList<Movie>)


}