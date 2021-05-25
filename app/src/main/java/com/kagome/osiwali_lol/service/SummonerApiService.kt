package com.kagome.osiwali_lol.service

import com.kagome.osiwali_lol.bean.OL_Summoner
import com.kagome.osiwali_lol.net.OL_Response
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * 召唤师接口服务
 * Created  on 2021/5/20 14:09
 *  @author: Osiwali
 */
interface SummonerApiService {

    @GET("summoner")
    suspend fun getSummonerByName(@Query("name") name: String): OL_Response<OL_Summoner>

    @GET("summoner")
    suspend fun getSummonerBySummonerId(@Query("summonerId") id: String): OL_Response<OL_Summoner>
}