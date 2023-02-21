package com.alamin.ecommerce.service;

import com.alamin.ecommerce.dto.request.RequestProductDTO;
import com.alamin.ecommerce.dto.response.ProductDTO;
import com.alamin.ecommerce.entity.Product;
import com.alamin.ecommerce.entity.ProductCategory;
import com.alamin.ecommerce.mapper.ProductDTOMapper;
import com.alamin.ecommerce.mapper.RequestProductDTOMapper;
import com.alamin.ecommerce.repository.ProductCategoryRepository;
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
    @Autowired
    private ProductCategoryRepository categoryRepository;
    @Autowired
    private RequestProductDTOMapper requestProductDTOMapper;

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

    public void add(RequestProductDTO dto) {
        final Product product = requestProductDTOMapper.apply(dto);
        final ProductCategory category = categoryRepository.findByCategoryName(dto.categoryName()).orElse(null);
        if (category == null){
            return;
        }
        product.setCategory(category);
        productRepository.save(product);
    }

    public void delete(Long i) {
        productRepository.deleteById(i);
    }
}
