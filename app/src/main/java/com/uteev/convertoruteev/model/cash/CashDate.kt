package com.uteev.convertoruteev.model.cash

data class CashDate(
    val Date: String,
    val PreviousDate: String,
    val PreviousURL: String,
    val Timestamp: String,
    val Valute: SpecificCurrency
)