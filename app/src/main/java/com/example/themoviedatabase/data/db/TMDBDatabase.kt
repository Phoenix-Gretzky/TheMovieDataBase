package com.example.themoviedatabase.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.themoviedatabase.data.model.artist.Artist
import com.example.themoviedatabase.data.model.movie.Movie
import com.example.themoviedatabase.data.model.tvshow.TvShow

@Database(entities=[Movie::class,Artist::class,TvShow::class],
    version = 1,
    exportSchema = false
)
abstract class TMDBDatabase :RoomDatabase(){

    abstract fun getMovieDao():MoviesDao
    abstract fun getArtistsDao():ArtistDao
    abstract fun getTvShowDao():TvShowsDao
}