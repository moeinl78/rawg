package ir.ariyana.vg_market.repository.remote

import ir.ariyana.vg_market.model.VideoGameDetail
import ir.ariyana.vg_market.model.VideoGameGenre
import ir.ariyana.vg_market.model.VideoGameList
import ir.ariyana.vg_market.model.VideoGameRelated
import ir.ariyana.vg_market.utils.Constants
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ServiceAPI {

    @GET("games/")
    suspend fun getVideoGameList(
        @Query("key") key: String = Constants.API_KEY
    ): Response<VideoGameList>

    @GET("games/{game_pk}/game-series")
    suspend fun getVideoGameRelated(
        @Path("game_pk") gamePk : Int,
        @Query("key") key: String = Constants.API_KEY
    ): Response<VideoGameRelated>

    @GET("games/{id}")
    suspend fun getVideoGameDetail(
        @Path("id") id: Int,
        @Query("key") key: String = Constants.API_KEY
    ): Response<VideoGameDetail>

    @GET("games/genres")
    suspend fun getVideoGenreList(
        @Query("key") key: String = Constants.API_KEY
    ): Response<VideoGameGenre>
}