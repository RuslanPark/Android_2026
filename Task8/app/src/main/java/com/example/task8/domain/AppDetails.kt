package com.example.task8.domain

data class AppDetails(
    val id: String,
    val name: String,
    val developer: String,
    val category: String,
    val ageRating: String,
    val sizeMb: Double,
    val iconUrl: String,
    val screenshotUrls: List<String>,
    val description: String,
)
