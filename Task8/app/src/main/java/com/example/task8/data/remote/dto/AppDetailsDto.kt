package com.example.task8.data.remote.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class AppDetailsDto(
    @SerialName("id") val id: String,
    @SerialName("name") val name: String,
    @SerialName("developer") val developer: String,
    @SerialName("category") val category: String,
    @SerialName("ageRating") val ageRating: Int,
    @SerialName("size") val size: Double,
    @SerialName("iconUrl") val iconUrl: String,
    @SerialName("screenshotUrlList") val screenshotUrlList: List<String> = emptyList(),
    @SerialName("description") val description: String,
)
