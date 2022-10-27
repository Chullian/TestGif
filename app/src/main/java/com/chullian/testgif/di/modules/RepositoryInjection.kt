package com.chullian.testgif.di.modules

import com.chullian.testgif.repositories.GifRepository
import com.chullian.testgif.repositories.GifRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryInjection {

    @Binds
    abstract fun bindGiphyRepository(
        giphyRepositoryImpl: GifRepositoryImpl
    ): GifRepository

}