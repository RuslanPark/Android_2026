package com.example.task8.data

import com.example.task8.data.remote.AppsApi
import com.example.task8.domain.AppDetails
import com.example.task8.domain.AppInfo
import com.example.task8.domain.AppsRepository
import javax.inject.Inject

class AppsRepositoryImpl @Inject constructor(
    private val api: AppsApi,
    private val mapper: AppsMapper,
) : AppsRepository {

    override suspend fun getApps(): List<AppInfo> =
        api.getCatalog().map(mapper::toDomain)

    override suspend fun getAppDetails(id: String): AppDetails =
        mapper.toDomain(api.getAppDetails(id))
}
