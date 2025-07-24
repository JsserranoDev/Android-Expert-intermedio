package com.serranodev.horoscapp.data.network.response

import com.serranodev.horoscapp.domain.model.PredictionModel
import com.serranodev.horoscapp.motherobject.HoroscopeMotherObject.anyResponse
import io.kotlintest.shouldBe
import org.junit.Test

class PredictionResponseTest {
    @Test
    fun `toDomain should return a correct PredictionModel`() {
        //Given
        val horoscopeResponse: PredictionResponse = anyResponse

        //When
        val predictionModel: PredictionModel = horoscopeResponse.toDomain()

        //then
        predictionModel.sign shouldBe horoscopeResponse.sign
        predictionModel.horoscope shouldBe horoscopeResponse.horoscope
    }
}