package com.serranodev.horoscapp.data

import android.util.Log
import com.serranodev.horoscapp.data.network.HoroscopeApiService
import com.serranodev.horoscapp.domain.Repository
import com.serranodev.horoscapp.domain.model.PredictionModel
import javax.inject.Inject

class RepositoryImpl @Inject constructor(private val apiService: HoroscopeApiService) : Repository {
    override suspend fun getPrediction(sign: String):PredictionModel? {
        runCatching { apiService.getHoroscope(sign) }
            .onSuccess { return it.toDomain() }
            .onFailure { Log.i("Pepe","ha ocurrido un error ${it.message}") }
        return null
    }

}