package ir.ariyana.vg_market.repository

import ir.ariyana.vg_market.repository.remote.ServiceAPI

class MainRepository(private val serviceAPI: ServiceAPI) {

    suspend fun getVideoGameList() =
        serviceAPI.getVideoGameList()

    suspend fun getVideoGameRelated(pk: Int) =
        serviceAPI.getVideoGameRelated(pk)

    suspend fun getVideoGameDetail(id: Int) =
        serviceAPI.getVideoGameDetail(id)

    suspend fun getVideoGenreList() =
        serviceAPI.getVideoGenreList()
}