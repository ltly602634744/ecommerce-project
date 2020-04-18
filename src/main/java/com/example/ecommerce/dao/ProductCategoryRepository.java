package com.example.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.ecommerce.entity.ProductCatagory;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "productRepository", path = "product-repository")
public interface ProductCategoryRepository extends JpaRepository<ProductCatagory, Long> {

}
