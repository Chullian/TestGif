package com.chullian.testgif.data

import com.chullian.testgif.data.responses.GiphyResponse
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by binMammootty
 */

const val NETWORK_TIMEOUT = 6000L
const val BASE_URL = "https://api.giphy.com/v1/"
const val API_KEY = "EEjeWKnay8eNwJ091mC2ffGuQe96tdBN"

interface ApiServices {
    @GET("gifs/trending")
    suspend fun fetchGifs(@Query("api_key") apiKey:String = API_KEY): GiphyResponse
}