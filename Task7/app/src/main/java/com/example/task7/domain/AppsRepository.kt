package com.example.task7.domain

interface AppsRepository {
    fun getApps(): List<AppInfo>
}
