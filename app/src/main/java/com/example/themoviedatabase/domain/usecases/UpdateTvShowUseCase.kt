package com.example.themoviedatabase.domain.usecases

import com.example.themoviedatabase.data.model.tvshow.TvShow
import com.example.themoviedatabase.domain.repository.TvShowRepository

class UpdateTvShowUseCase (var tvShowRepository: TvShowRepository) {
    suspend fun execute(tvShowList:ArrayList<TvShow>) = tvShowRepository.updateTvShow(tvShowList)
}