package com.kagome.osiwali_lol.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.kagome.osiwali_lol.base.BaseViewModel
import com.kagome.osiwali_lol.bean.OL_Summoner
import com.kagome.osiwali_lol.data.SummonerRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.*
import javax.inject.Inject

//Summoner ViewModel

@HiltViewModel
class SummonerViewModel @Inject constructor(private val summonerRepository: SummonerRepository) :
    BaseViewModel() {
    private var _summoner = MutableLiveData<OL_Summoner>();
    var summoner: LiveData<OL_Summoner> = _summoner

    fun getSummonerByName(summonerName: String) {
        viewModelScope.launch {
            _summoner.value = summonerRepository.getSummonerByName(summonerName)
        }
    }
}