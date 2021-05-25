package com.kagome.osiwali_lol.net

import android.os.Build
import com.kagome.osiwali_lol.BuildConfig
import com.kagome.osiwali_lol.config.AppConfig
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

/**
 * 网络请求
 * Created  on 2021/5/20 14:27
 *  @author: Osiwali
 */
class RetrofitFactory {
    val retrofit: Retrofit

    init {
        val logging = HttpLoggingInterceptor()
        logging.level = if (BuildConfig.DEBUG) {
            HttpLoggingInterceptor.Level.BODY
        } else {
            HttpLoggingInterceptor.Level.NONE
        }
        val okhttpClient =
            OkHttpClient.Builder().connectTimeout(AppConfig.HTTP_TIME_OUT, TimeUnit.SECONDS)
                .addInterceptor(logging).build()
        retrofit = Retrofit.Builder().baseUrl(AppConfig.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create()).client(okhttpClient).build()
    }

    companion object {
        @Volatile
        private var mRetrofitFactory: RetrofitFactory? = null

        val instance: RetrofitFactory
            get() {
                if (mRetrofitFactory == null) {
                    synchronized(RetrofitFactory::class.java) {
                        if (mRetrofitFactory == null)
                            mRetrofitFactory = RetrofitFactory()
                    }

                }
                return mRetrofitFactory!!
            }

    }

}