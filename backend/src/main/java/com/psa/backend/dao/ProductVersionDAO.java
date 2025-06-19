package com.psa.backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.psa.backend.model.ProductVersionEntity;

public interface ProductVersionDAO extends JpaRepository<ProductVersionEntity, String> {
}
