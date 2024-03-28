package com.uteev.convertoruteev.data.api

import com.uteev.convertoruteev.model.cash.CurrencyResponse
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("daily_json.js")
    suspend fun getNalMoneys() : Response<CurrencyResponse>
}