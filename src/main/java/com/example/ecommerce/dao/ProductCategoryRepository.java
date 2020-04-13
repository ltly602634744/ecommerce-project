package com.example.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.ecommerce.entity.ProductCatagory;

@RepositoryRestResource(collectionResourceRel = "productRepository", path = "product-repository")
public interface ProductCategoryRepository extends JpaRepository<ProductCatagory, Long> {

}
