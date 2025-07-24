package com.serranodev.horoscapp.motherobject

import com.serranodev.horoscapp.data.network.response.PredictionResponse
import com.serranodev.horoscapp.domain.model.HoroscopeInfo.Aquarius
import com.serranodev.horoscapp.domain.model.HoroscopeInfo.Aries
import com.serranodev.horoscapp.domain.model.HoroscopeInfo.Cancer
import com.serranodev.horoscapp.domain.model.HoroscopeInfo.Capricorn
import com.serranodev.horoscapp.domain.model.HoroscopeInfo.Gemini
import com.serranodev.horoscapp.domain.model.HoroscopeInfo.Leo
import com.serranodev.horoscapp.domain.model.HoroscopeInfo.Libra
import com.serranodev.horoscapp.domain.model.HoroscopeInfo.Pisces
import com.serranodev.horoscapp.domain.model.HoroscopeInfo.Sagittarius
import com.serranodev.horoscapp.domain.model.HoroscopeInfo.Scorpio
import com.serranodev.horoscapp.domain.model.HoroscopeInfo.Taurus
import com.serranodev.horoscapp.domain.model.HoroscopeInfo.Virgo

object HoroscopeMotherObject {

    val anyResponse = PredictionResponse("date", "prediction", "taurus")

    val horoscopeInfoList = listOf(
        Aries,
        Taurus,
        Gemini,
        Cancer,
        Leo,
        Virgo,
        Libra,
        Scorpio,
        Sagittarius,
        Capricorn,
        Aquarius,
        Pisces
    )
}