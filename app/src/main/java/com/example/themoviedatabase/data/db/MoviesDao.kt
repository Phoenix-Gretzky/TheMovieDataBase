package com.example.themoviedatabase.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.themoviedatabase.data.model.movie.Movie

@Dao
interface MoviesDao {


        @Insert(onConflict = OnConflictStrategy.REPLACE)
        suspend fun savePopularMovies(movieList:List<Movie>)

        @Query("Select * from popular_movies")
        suspend fun getPopularMovies():List<Movie>

        @Query("Delete from popular_movies")
        suspend fun deleteAllPopularMovies()

}