package com.example.themoviedatabase.domain.usecases

import com.example.themoviedatabase.data.model.artist.Artist
import com.example.themoviedatabase.domain.repository.ArtistsRepository

class UpdateArtistsUseCase(var artistsRepository: ArtistsRepository) {
    suspend fun execute(artistsList:ArrayList<Artist>) = artistsRepository.updateArtists(artistsList)

}