package com.example.demo_application.`domain-application`.usecase

import com.example.demo_application.`domain-application`.model.ProductResponseDTO
import com.example.demo_application.`domain-application`.model.ResponseEntityCustom

interface IProductUseCase {
    fun getAllProduct () : ResponseEntityCustom<ProductResponseDTO>;
    fun addProduct () : ResponseEntityCustom<ProductResponseDTO>;
    fun updateProduct () : ResponseEntityCustom<ProductResponseDTO>;
    fun deleteProduct () : ResponseEntityCustom<ProductResponseDTO>;
}