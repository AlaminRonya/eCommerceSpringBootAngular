package com.alamin.ecommerce.dto;

import com.alamin.ecommerce.entity.ProductCategory;

import java.math.BigDecimal;
import java.util.Date;

public record ProductDTO(
        Long id,
        CategoryDTO categoryDTO,
        String sku,
        String name,
        String description,
        BigDecimal unitPrice,
        String imageUrl,
        boolean active,
        int unitsInStock,
        Date dateCreated,
        Date lastUpdated
) {

}
