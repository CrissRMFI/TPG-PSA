package com.psa.backend.controller;

import com.psa.backend.dao.ProductDAO;
import com.psa.backend.model.ProductEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
@CrossOrigin
public class ProductoController {

    @Autowired
    private ProductDAO productDAO;

    @GetMapping
    public List<ProductEntity> getAll() {
        return productDAO.findAll();
    }
}
