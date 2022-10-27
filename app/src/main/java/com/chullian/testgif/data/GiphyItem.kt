package com.chullian.testgif.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

/**
 * Created by binMammootty on 27/10/2022.
 */

data class GiphyItem(
    val title: String = "",
    val gif: String = "",
)