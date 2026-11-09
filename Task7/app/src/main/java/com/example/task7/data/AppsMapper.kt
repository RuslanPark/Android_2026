package com.example.task7.data

import com.example.task7.domain.AppInfo
import javax.inject.Inject

class AppsMapper @Inject constructor() {

    fun toDomain(entity: AppEntity): AppInfo = AppInfo(
        id = entity.id,
        name = entity.title,
        description = entity.shortDescription,
        category = entity.categoryName,
    )
}
