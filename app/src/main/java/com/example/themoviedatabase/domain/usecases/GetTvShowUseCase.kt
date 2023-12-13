package com.example.themoviedatabase.domain.usecases

import com.example.themoviedatabase.data.model.tvshow.TvShow
import com.example.themoviedatabase.domain.repository.TvShowRepository

class GetTvShowUseCase(var tvShowRepository: TvShowRepository) {
    suspend fun execute():List<TvShow> =tvShowRepository.getTvShow()
}