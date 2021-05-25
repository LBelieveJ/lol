package com.kagome.osiwali_lol.di

import com.kagome.osiwali_lol.service.SummonerApiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton


/**
 * Created  on 2021/5/20 14:55
 *  @author: Osiwali
 */
@InstallIn(SingletonComponent::class)
@Module
class NetworkModule {
    @Singleton
    @Provides
    fun provideSummonerService(retrofit: Retrofit): SummonerApiService {
        return retrofit.create(SummonerApiService::class.java)
    }
}