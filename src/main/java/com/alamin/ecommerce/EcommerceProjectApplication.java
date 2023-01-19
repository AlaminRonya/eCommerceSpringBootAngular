package com.alamin.ecommerce;

import com.alamin.ecommerce.entity.ProductCategory;
import com.alamin.ecommerce.repository.ProductCategoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EcommerceProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(EcommerceProjectApplication.class, args);
    }


//    @Bean
//    CommandLineRunner category(ProductCategoryRepository repository){
//        return args -> {
//            ProductCategory  category = new ProductCategory();
//            category.setCategoryName("Java Advance");
//            repository.save(category);
//        };
//    }
}


//('BOOK-TECH-1000', 'JavaScript - The Fun Parts', 'Learn JavaScript',
//        'assets/images/products/placeholder.png'
//        ,1,100,19.99,1, NOW());

