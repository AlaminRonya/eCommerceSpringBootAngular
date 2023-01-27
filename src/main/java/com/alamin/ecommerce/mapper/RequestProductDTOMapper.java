package com.alamin.ecommerce.mapper;

import com.alamin.ecommerce.dto.request.RequestProductDTO;
import com.alamin.ecommerce.entity.Product;
import org.springframework.stereotype.Service;

import java.util.function.Function;
@Service
public class RequestProductDTOMapper implements Function<RequestProductDTO, Product> {
    @Override
    public Product apply(RequestProductDTO dto) {
        Product product = new Product();
        product.setName(dto.name());
        product.setDescription(dto.description());
        product.setSku(dto.sku());
        product.setUnitPrice(dto.unitPrice());
        product.setUnitsInStock(dto.unitsInStock());

        return product;
    }
}
