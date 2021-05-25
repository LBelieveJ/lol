package com.kagome.osiwali_lol.bean

/**
 * 召唤师信息
 * Created  on 2021/5/20 11:08
 *  @author: Osiwali
 */
data class OL_Summoner(
    val platform: LeagueShard?,//服务器
    val revisionDate: Long,
    val puuid: String? = null,
    val id: String?,
    val profileIconId: Int = 0,
    val name: String? = null,
    val summonerLevel: Int = 0,
    val accountId: String? = null
)