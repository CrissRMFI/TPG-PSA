package com.psa.backend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.psa.backend.dao.ProductDAO;
import com.psa.backend.dto.ResponseProductDTO;
import com.psa.backend.dto.ResponseProductVersionDTO;
import com.psa.backend.model.ProductEntity;
import com.psa.backend.model.ProductVersionEntity;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ProductService {
    @Autowired
    public ProductDAO productDAO;

    public List<ResponseProductDTO> getAllProducts() {
        return productDAO.findAll().stream().map(this::convertToDTO).toList();
    }

    private ResponseProductDTO convertToDTO(ProductEntity product) {
        return ResponseProductDTO.builder()
        .idProducto(product.getId().toString())
        .nombreProducto(product.getNombre())
        .versiones(product.getVersiones().stream().map(this::convertToVersionDTO).toList())
        .build();
    }

    private ResponseProductVersionDTO convertToVersionDTO(ProductVersionEntity version) {
        return ResponseProductVersionDTO.builder()
        .idVersion(version.getId().toString())
        .nombreVersion(version.getVersion())
        .build();
    }

}
