package com.alamin.ecommerce.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Table(name="product_category")
@Data
public class ProductCategory {

    @SequenceGenerator(
            name = "product_category_sequence",
            sequenceName = "product_category_sequence",
            allocationSize = 1
    )
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "product_category_sequence"
    )
    @Column(name = "id")
    private Long id;

    @Column(name = "category_name")
    private String categoryName;

//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "category")
//    private Set<Product> products;

}