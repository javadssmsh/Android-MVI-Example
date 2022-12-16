package com.example.android_mvi_example.api

import com.example.android_mvi_example.model.Animal
import retrofit2.http.GET

interface AnimalApi {

    @GET("animals.json")
    suspend fun getAnimals(): List<Animal>

}