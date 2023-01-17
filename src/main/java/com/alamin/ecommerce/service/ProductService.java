package com.alamin.ecommerce.service;

import com.alamin.ecommerce.entity.Product;
import com.alamin.ecommerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    public List<Product> getAll(){
        return productRepository.findAll();
    }
}
