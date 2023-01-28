package com.alamin.ecommerce.controller;

import com.alamin.ecommerce.dto.request.RequestProductDTO;
import com.alamin.ecommerce.dto.response.ProductDTO;
import com.alamin.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin("http://localhost:4200")
public class ProductApiRestController {
    @Autowired
    private ProductService productService;

    @GetMapping("/all")
    public ResponseEntity<List<ProductDTO>> getAllProduct(){
        //final List<ProductDTO> all = productService.getAll();
        //all.stream().forEach(System.out::println);
        return new ResponseEntity<>(productService.getAll(), HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<String> addProduct(@RequestBody RequestProductDTO dto){
        productService.add(dto);
        return new ResponseEntity<>("Add product!", HttpStatus.CREATED);
    }
    @GetMapping("/delete/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable("id") String id){
        try {

        }catch (Exception e){

        }
        return new ResponseEntity<>("Product deleted!", HttpStatus.ACCEPTED);
    }
}
