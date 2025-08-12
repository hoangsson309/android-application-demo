package com.example.demo_application.commons

import com.google.firebase.appdistribution.gradle.ApiService
import java.util.Objects

interface MockBaseApiConfig {
     suspend fun ApiClient(base_url: String, end_point: String): ApiService;
}