package com.example.apiproducto.repositories

import com.example.apiproducto.models.Product
import kotlinx.coroutines.flow.Flow
import org.springframework.data.repository.kotlin.CoroutineCrudRepository
import org.springframework.stereotype.Repository

@Repository
interface ProductRepository: CoroutineCrudRepository<Product, Long> {
    fun findProductsByCategory(category: String): Flow<Product>
}