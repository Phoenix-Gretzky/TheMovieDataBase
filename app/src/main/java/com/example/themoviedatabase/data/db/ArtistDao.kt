package com.example.themoviedatabase.data.db

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query
import com.example.themoviedatabase.data.model.artist.Artist


@Dao
interface ArtistDao {

    @Insert(onConflict = REPLACE)
    suspend fun savePopularArtists(artistList:List<Artist>)

    @Query("Select * from popular_artists")
    suspend fun getPopularArtists():List<Artist>

    @Query("Delete from popular_artists")
    suspend fun deleteAllPopularArtists()


}