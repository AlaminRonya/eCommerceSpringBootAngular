package com.alamin.ecommerce.controller;

import com.alamin.ecommerce.entity.Product;
import com.alamin.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@CrossOrigin("http://localhost:4200")
public class ProductApiRestController {
    @Autowired
    private ProductService productService;
    @GetMapping("/all")
    public List<Product> getAllProduct(){
        return productService.getAll();
    }
}
