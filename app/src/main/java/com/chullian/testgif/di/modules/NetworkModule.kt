package com.chullian.testgif.di.modules

import com.chullian.testgif.data.ApiServices
import com.chullian.testgif.data.BASE_URL
import com.chullian.testgif.data.NETWORK_TIMEOUT
import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

/**
 * Created by binMammootty on 27/10/2022.
 */


@Module
@InstallIn(SingletonComponent::class)
class NetworkModule {


    @Singleton
    @Provides
    fun provideJson() = Json {
        ignoreUnknownKeys = true

    }

    @ExperimentalSerializationApi
    @Singleton
    @Provides
    fun provideRetrofitService(json: Json): ApiServices {
        val interceptor = HttpLoggingInterceptor()
        interceptor.level = HttpLoggingInterceptor.Level.BODY
        val client = OkHttpClient.Builder()
            .addInterceptor(interceptor)
            .callTimeout(NETWORK_TIMEOUT, TimeUnit.SECONDS)
            .build()
        val contentType = "application/json".toMediaType()
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(client)
            .addConverterFactory(json.asConverterFactory(contentType))
            .build()
            .create(ApiServices::class.java)
    }
}
