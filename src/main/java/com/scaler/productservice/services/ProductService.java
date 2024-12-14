package com.scaler.productservice.services;

import com.scaler.productservice.dtos.CreateProductDto;
import com.scaler.productservice.models.Product;

import java.util.List;

public interface ProductService {
    List<Product> getALlProducts();
    Product getSingleProduct(long id);

    void CreateProduct(CreateProductDto createProductDto);

}
