package com.example.task8.data

import com.example.task8.data.remote.dto.AppDetailsDto
import com.example.task8.data.remote.dto.AppDto
import com.example.task8.domain.AppDetails
import com.example.task8.domain.AppInfo
import javax.inject.Inject

class AppsMapper @Inject constructor() {

    fun toDomain(dto: AppDto): AppInfo = AppInfo(
        id = dto.id,
        name = dto.name,
        description = dto.description,
        category = dto.category,
        iconUrl = dto.iconUrl,
    )

    fun toDomain(dto: AppDetailsDto): AppDetails = AppDetails(
        id = dto.id,
        name = dto.name,
        developer = dto.developer,
        category = dto.category,
        ageRating = "${dto.ageRating}+",
        sizeMb = dto.size,
        iconUrl = dto.iconUrl,
        screenshotUrls = dto.screenshotUrlList,
        description = dto.description,
    )
}
