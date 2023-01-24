package com.alamin.ecommerce.mapper;

import com.alamin.ecommerce.dto.CategoryDTO;
import com.alamin.ecommerce.dto.ProductDTO;
import com.alamin.ecommerce.entity.Product;
import org.springframework.stereotype.Service;

import java.util.function.Function;
@Service
public class ProductDTOMapper implements Function<Product, ProductDTO> {
    @Override
    public ProductDTO apply(Product p) {
        return new ProductDTO(
                p.getId(),
                new CategoryDTO(p.getCategory().getId(), p.getCategory().getCategoryName()),
                p.getSku(),
                p.getName(),
                p.getDescription(),
                p.getUnitPrice(),
                p.getImageUrl(),
                p.isActive(),
                p.getUnitsInStock(),
                p.getDateCreated(),
                p.getLastUpdated()
        );
    }
}
