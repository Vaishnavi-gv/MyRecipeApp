package com.example.myrecipeapp

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET



private val retrofit= Retrofit.Builder().baseUrl("https://www.themealdb.com/api/json/v1/1/")
    .addConverterFactory(GsonConverterFactory.create())
    .build()   // Preparing endpoint and adding json converter  //creating objects corresponding to interface

val recipeService = retrofit.create(ApiService::class.java)  //using ApiService(categories)  //creating objects corresponding to interface

interface ApiService{
    @GET("Categories.php")
    suspend fun getCategories(): categoriesResponse
}