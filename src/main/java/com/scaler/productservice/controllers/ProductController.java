package com.scaler.productservice.controllers;

import com.scaler.productservice.dtos.CreateProductDto;
import com.scaler.productservice.models.Product;
import com.scaler.productservice.services.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    private ProductService productService ;
    public  ProductController(ProductService productService){
        this.productService = productService;
    }




    /*
    * GET/products GET ALL PRODUCT
    * */
@GetMapping("/products")
    public List<Product> getAllProducts(){

    return productService.getALlProducts();

    }


    /*
     * GET/products{id}
     * */
@GetMapping("/products/{id}")
    public  Product getSingleProduct(@PathVariable("id") long id){

    return productService.getSingleProduct(id);
    }

    /*
     * POST creat new product
     * */

    @PostMapping("/products")
    public void createProduct(CreateProductDto createProductDto){
productService.CreateProduct(createProductDto);
    }



}
