package com.serranodev.horoscapp.data.providers

import com.serranodev.horoscapp.domain.model.HoroscopeInfo
import com.serranodev.horoscapp.domain.model.HoroscopeInfo.*
import javax.inject.Inject

class HoroscopeProvider @Inject constructor() {
    fun getHoroscopes(): List<HoroscopeInfo> {
        return listOf(
            Aries,
            Taurus,
            Gemeni,
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
}