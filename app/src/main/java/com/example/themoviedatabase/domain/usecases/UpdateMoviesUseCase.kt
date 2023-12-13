package com.example.themoviedatabase.domain.usecases

import com.example.themoviedatabase.data.model.movie.Movie
import com.example.themoviedatabase.domain.repository.MoviesRepository

class UpdateMoviesUseCase(var moviesRepository: MoviesRepository) {
    suspend fun execute (moviesList:ArrayList<Movie>) = moviesRepository.updateMovies(moviesList)
}