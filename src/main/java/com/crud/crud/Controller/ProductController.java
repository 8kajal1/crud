package com.crud.crud.Controller;

import com.crud.crud.model.ProductService;
import com.crud.crud.payload.ProductDto;
import com.crud.crud.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/products")
@RestController
public class ProductController {
    @Autowired
    private ProductService productService;
@PostMapping
    public ResponseEntity<ProductDto>createProduct(@RequestBody ProductDto productDto){
       return new ResponseEntity<>(productService.createProduct(productDto),HttpStatus.CREATED);
    }

}
