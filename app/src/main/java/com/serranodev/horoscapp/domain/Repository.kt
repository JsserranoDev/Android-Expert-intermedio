package com.serranodev.horoscapp.domain

import com.serranodev.horoscapp.domain.model.PredictionModel

interface Repository {
    suspend fun getPrediction(sign:String):PredictionModel?
}