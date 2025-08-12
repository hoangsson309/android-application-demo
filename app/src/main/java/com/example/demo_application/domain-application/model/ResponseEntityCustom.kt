package com.example.demo_application.`domain-application`.model

data class ResponseEntityCustom<T>(
    val data : List<T>,
    val message : String,
)