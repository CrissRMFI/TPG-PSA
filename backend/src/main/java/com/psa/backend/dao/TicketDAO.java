package com.psa.backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.psa.backend.model.TicketEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketDAO extends JpaRepository<TicketEntity, String> {
    
}
