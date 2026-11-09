package com.example.task8.data.remote

import com.example.task8.data.remote.dto.AppDetailsDto
import com.example.task8.data.remote.dto.AppDto
import retrofit2.http.GET
import retrofit2.http.Path

interface AppsApi {

    @GET("catalog")
    suspend fun getCatalog(): List<AppDto>

    @GET("catalog/{id}")
    suspend fun getAppDetails(@Path("id") id: String): AppDetailsDto
}
