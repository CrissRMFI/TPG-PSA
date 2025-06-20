package com.psa.backend.controller;

import com.psa.backend.dto.ResponseProductDTO;
import com.psa.backend.services.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
@CrossOrigin
public class ProductoController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public List<ResponseProductDTO> getAll() {
        return productService.getAllProducts();
    }
}
