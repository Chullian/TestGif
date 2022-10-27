package com.chullian.testgif.repositories

import com.chullian.testgif.data.GiphyItem
import kotlinx.coroutines.flow.Flow

/**
 * Created by binMammootty on 27/10/2022.
 */
interface GifRepository {
    suspend fun fetchGifs(): Flow<List<GiphyItem?>>

}