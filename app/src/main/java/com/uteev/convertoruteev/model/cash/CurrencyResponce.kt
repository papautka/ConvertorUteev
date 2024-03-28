package com.uteev.convertoruteev.model.cash

data class CurrencyResponse(
    val Date: String,
    val Valute: Map<String, Currency>
)