package com.example.task8.domain

interface AppsRepository {
    suspend fun getApps(): List<AppInfo>

    suspend fun getAppDetails(id: String): AppDetails
}
