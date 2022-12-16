package com.example.android_mvi_example.api

import com.example.android_mvi_example.api.AnimalApi

class AnimalRepo(private val api: AnimalApi) {
    suspend fun getAnimals() = api.getAnimals()
}