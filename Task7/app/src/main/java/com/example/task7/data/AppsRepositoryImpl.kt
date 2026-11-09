package com.example.task7.data

import com.example.task7.domain.AppInfo
import com.example.task7.domain.AppsRepository
import javax.inject.Inject

class AppsRepositoryImpl @Inject constructor(
    private val mapper: AppsMapper,
) : AppsRepository {

    private val apps = listOf(
        AppEntity("1", "QuickNote", "Лёгкое приложение для заметок и напоминаний", "Производительность"),
        AppEntity("2", "Calmalist", "Списки дел с расслабляющими напоминаниями", "Производительность"),
        AppEntity("3", "FitRiver", "Трекер прогулок и пробежек", "Здоровье и фитнес"),
        AppEntity("4", "TaskLoop", "Управление повседневными задачами", "Производительность"),
        AppEntity("5", "Pixtrix", "Фоторедактор с фильтрами", "Фото и видео"),
    )

    override fun getApps(): List<AppInfo> = apps.map(mapper::toDomain)
}
