package com.chullian.testgif.framgents.main

import com.chullian.testgif.data.GiphyItem

data class MainState(
    val progress:Boolean=false,
    val items:List<GiphyItem> = emptyList(),
)
