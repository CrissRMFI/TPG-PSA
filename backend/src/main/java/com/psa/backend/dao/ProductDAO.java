package com.psa.backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.psa.backend.model.ProductEntity;

public interface ProductDAO extends JpaRepository<ProductEntity, String> {
}
