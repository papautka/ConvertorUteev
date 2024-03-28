package com.uteev.convertoruteev.model.cash

data class SpecificCurrency(
    val CharCode: String,
    val ID: String,
    val Name: String,
    val Nominal: Int,
    val NumCode: String,
    val Previous: Double,
    val Value: Double
)