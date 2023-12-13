package com.example.themoviedatabase.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.themoviedatabase.data.model.movie.Movie
import com.example.themoviedatabase.data.model.tvshow.TvShow

@Dao
interface TvShowsDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun savePopularTvShows(tvShowList:List<TvShow>)

    @Query("Select * from popular_tv_shows")
    suspend fun getPopularTvShows():List<TvShow>

    @Query("Delete from popular_tv_shows")
    suspend fun deleteAllPopularTvShows()
}