package com.example.productcategoryapi.repository;

import com.example.productcategoryapi.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
