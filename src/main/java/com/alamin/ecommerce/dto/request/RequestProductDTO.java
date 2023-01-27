package com.alamin.ecommerce.dto.request;


import java.math.BigDecimal;

public record RequestProductDTO(
        String categoryName,
        String sku,
        String name,
        String description,
        BigDecimal unitPrice,
        Integer unitsInStock
) {

}
