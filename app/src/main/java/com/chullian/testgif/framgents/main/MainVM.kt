package com.chullian.testgif.framgents.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.chullian.testgif.data.GiphyItem
import com.chullian.testgif.repositories.GifRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainVM @Inject constructor(
    private val repo: GifRepository
) : ViewModel() {

    private var _state = MutableStateFlow(MainState())
    val state = _state.asStateFlow()

    fun fetchGifs() = viewModelScope.launch {
        _state.value = _state.value.copy(
            progress = true
        )
        repo.fetchGifs().collect { result: List<GiphyItem?> ->
            _state.value = _state.value.copy(
                progress = false,
                items = result as List<GiphyItem>,
            )
        }

    }

}
