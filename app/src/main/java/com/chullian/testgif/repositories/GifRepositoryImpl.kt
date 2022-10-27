package com.chullian.testgif.repositories

import com.chullian.testgif.data.ApiServices
import com.chullian.testgif.data.GiphyItem
import com.chullian.testgif.data.responses.toGiphyItem
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf
import javax.inject.Inject

class GifRepositoryImpl @Inject constructor(
    private val network: ApiServices,
) : GifRepository {

    override suspend fun fetchGifs(): Flow<List<GiphyItem?>> {
        val response = network.fetchGifs()
        val items = response.data?.map { it?.toGiphyItem() } ?: emptyList()
        return flowOf(items)
    }
}