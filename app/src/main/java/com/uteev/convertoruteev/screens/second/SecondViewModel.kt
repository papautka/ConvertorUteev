package com.uteev.convertoruteev.screens.second

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.uteev.convertoruteev.data.repository.Repository
import com.uteev.convertoruteev.model.cash.CurrencyResponse
import kotlinx.coroutines.launch
import retrofit2.Response

class SecondViewModel : ViewModel() {

    var repo = Repository()
    val myMoneyList : MutableLiveData<Response<CurrencyResponse>> = MutableLiveData()

    fun getNalMoney() {
        viewModelScope.launch {
            myMoneyList.value = repo.getNal()
        }
    }
}