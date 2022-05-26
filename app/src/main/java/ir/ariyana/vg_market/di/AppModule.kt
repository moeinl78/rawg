package ir.ariyana.vg_market.di

import ir.ariyana.vg_market.repository.MainRepository
import ir.ariyana.vg_market.repository.remote.ServiceAPI
import ir.ariyana.vg_market.utils.Constants
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val appModule = module {

    single {
        Retrofit
            .Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ServiceAPI::class.java)
    }

    factory {
        MainRepository(get())
    }
}