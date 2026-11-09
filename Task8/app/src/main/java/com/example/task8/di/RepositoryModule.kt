package com.example.task8.di

import com.example.task8.data.AppsRepositoryImpl
import com.example.task8.domain.AppsRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
interface RepositoryModule {

    @Binds
    @Singleton
    fun bindAppsRepository(impl: AppsRepositoryImpl): AppsRepository
}
