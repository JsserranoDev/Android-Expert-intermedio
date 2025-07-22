package com.serranodev.horoscapp.data.network

import com.serranodev.horoscapp.data.network.response.PredictionResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface HoroscopeApiService {
    @GET("/{sign}")
    suspend fun getHoroscope(@Path("sign") sign:String): PredictionResponse
}