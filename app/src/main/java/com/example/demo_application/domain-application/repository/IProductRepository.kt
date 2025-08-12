package com.example.demo_application.`domain-application`.repository

import com.example.demo_application.`domain-application`.model.ProductResponseDTO
import com.example.demo_application.`domain-application`.model.ResponseEntityCustom

interface IProductRepository {
    fun getAllProduct () : ResponseEntityCustom<ProductResponseDTO>;
    fun addProduct () : ResponseEntityCustom<ProductResponseDTO>;
    fun updateProduct () : ResponseEntityCustom<ProductResponseDTO>;
    fun deleteProduct () : ResponseEntityCustom<ProductResponseDTO>;
}