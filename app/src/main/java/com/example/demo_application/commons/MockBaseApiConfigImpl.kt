package com.example.demo_application.commons

import com.google.firebase.appdistribution.gradle.ApiService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
class MockBaseApiConfigImpl : MockBaseApiConfig{
    override suspend fun ApiClient(base_url: String, end_point: String): ApiService{
        return Retrofit.Builder()
            .baseUrl(base_url +  end_point)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiService::class.java)
    }
}
