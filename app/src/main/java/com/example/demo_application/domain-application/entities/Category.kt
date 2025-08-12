package com.example.demo_application.`domain-application`.entities

import java.util.Date

class Category(
    val id_code : String,
    val product_id : String,
    val product_code : String,
    val product_name : String,
    val create_dt : Date,
    val update_dt : Date,
    val insert_by : String,
    val upadte_by : String,
    val des : String,
    val update_cnt : Number,
    )