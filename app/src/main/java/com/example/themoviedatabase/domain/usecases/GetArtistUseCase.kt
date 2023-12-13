package com.example.themoviedatabase.domain.usecases

import com.example.themoviedatabase.data.model.artist.Artist
import com.example.themoviedatabase.domain.repository.ArtistsRepository

class GetArtistUseCase(var artistsRepository: ArtistsRepository) {
    suspend fun execute():List<Artist> = artistsRepository.getArtists()

}