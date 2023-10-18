package com.crud.crud.model.impl;

import com.crud.crud.entity.Product;
import com.crud.crud.model.ProductService;
import com.crud.crud.payload.ProductDto;
import com.crud.crud.repository.ProductRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepo;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public ProductDto createProduct(ProductDto productDto) {
        Product product=modelMapper.map(productDto,Product.class);
        Product product1=productRepo.save(product);
     ProductDto dto=modelMapper.map(product1,ProductDto.class);

        return dto;
    }
}
