package com.scaler.productservice.services;

import com.scaler.productservice.dtos.CreateProductDto;
import com.scaler.productservice.dtos.FakeStoreProductDto;
import com.scaler.productservice.models.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class FakeStoreProductService implements ProductService
{
    private RestTemplate restTemplate;

    public  FakeStoreProductService(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }


    @Override
    public List<Product> getALlProducts() {
        return List.of();
    }
    /*
    this method used to fetch third party API
    https://fakestoreapi.com/products/1
     */

    @Override
    public Product getSingleProduct(long id) {
        FakeStoreProductDto fakeStoreProductDto = restTemplate.getForObject("https://fakestoreapi.com/products/1"+id, FakeStoreProductDto.class)  ;
    return  fakeStoreProductDto.toProduct();
    }

    @Override
    public void CreateProduct(CreateProductDto createProductDto) {

    }
}
