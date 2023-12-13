package com.example.themoviedatabase.domain.usecases

import com.example.themoviedatabase.data.model.movie.Movie
import com.example.themoviedatabase.domain.repository.MoviesRepository

class GetMoviesUseCase(var moviesRepository: MoviesRepository) {

    suspend operator fun invoke():List<Movie> = moviesRepository.getMovies()
}