package com.example.themoviedatabase.domain.repository

import com.example.themoviedatabase.data.model.artist.Artist
import com.example.themoviedatabase.data.model.artist.ArtistList

interface ArtistsRepository {

    suspend fun getArtists():List<Artist>
    suspend fun updateArtists(artistList: ArrayList<Artist>)
}