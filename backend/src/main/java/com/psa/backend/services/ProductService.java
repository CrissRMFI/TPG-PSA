package com.psa.backend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.psa.backend.dao.ProductDAO;
import com.psa.backend.model.ProductEntity;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ProductService {
    @Autowired
    public ProductDAO productDAO;

    public List<ProductEntity> getAllProducts() {
        return productDAO.findAll();
    }

}
