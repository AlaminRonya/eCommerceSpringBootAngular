package com.alamin.ecommerce.service;

import com.alamin.ecommerce.dto.CategoryDTO;
import com.alamin.ecommerce.dto.ProductDTO;
import com.alamin.ecommerce.entity.Product;
import com.alamin.ecommerce.mapper.ProductDTOMapper;
import com.alamin.ecommerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private ProductDTOMapper productDTOMapper;

    public List<ProductDTO> getAll(){
//        return productRepository.findAll().stream()
//                .map(p-> new ProductDTO(
//                        p.getId(),
//                        new CategoryDTO(p.getCategory().getId(), p.getCategory().getCategoryName()),
//                        p.getSku(),
//                        p.getName(),
//                        p.getDescription(),
//                        p.getUnitPrice(),
//                        p.getImageUrl(),
//                        p.isActive(),
//                        p.getUnitsInStock(),
//                        p.getDateCreated(),
//                        p.getLastUpdated()
//                )).collect(Collectors.toList());
        return productRepository.findAll().stream()
                .map(productDTOMapper).collect(Collectors.toList());
    }
}
