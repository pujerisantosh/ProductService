package com.scaler.productservice;

import com.scaler.productservice.models.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductServiceApplication {

    Product p1 = new Product();


    public static void main(String[] args) {
        SpringApplication.run(ProductServiceApplication.class, args);
    }

}
