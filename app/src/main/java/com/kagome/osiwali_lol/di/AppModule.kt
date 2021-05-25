package com.kagome.osiwali_lol.di

import com.kagome.osiwali_lol.net.RetrofitFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton


@InstallIn(SingletonComponent::class)
@Module
class AppModule {

    @Singleton
    @Provides
    fun getRetrofit(): Retrofit {
        return RetrofitFactory.instance.retrofit
    }
}