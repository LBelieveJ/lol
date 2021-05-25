package com.kagome.osiwali_lol.data

import com.kagome.osiwali_lol.bean.LeagueShard
import com.kagome.osiwali_lol.bean.OL_Summoner
import com.kagome.osiwali_lol.net.OL_Response
import com.kagome.osiwali_lol.service.SummonerApiService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton

//召唤师数据仓库
@Singleton
class SummonerRepository @Inject constructor(private val summonerApiService: SummonerApiService) {

    //根据召唤师id查询召唤师信息
    suspend fun getSummonerById(summonerId: String): OL_Summoner? {
        return withContext(Dispatchers.IO) {
            var result = summonerApiService.getSummonerBySummonerId(summonerId)

            result.data
        }
    }

    //根据召唤师 name 查询召唤师信息
    suspend fun getSummonerByName(summonerName: String): OL_Summoner? {
        return withContext(Dispatchers.IO) {
            var result = summonerApiService.getSummonerByName(summonerName)
            result.data
        }
    }
}