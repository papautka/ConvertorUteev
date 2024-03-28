package com.uteev.convertoruteev.data.repository

import com.uteev.convertoruteev.data.api.RetrofitInstance
import com.uteev.convertoruteev.model.cash.CurrencyResponse
import retrofit2.Response

class Repository {
    suspend fun getNal() : Response<CurrencyResponse> {
        return RetrofitInstance.api.getNalMoneys()
    }
}