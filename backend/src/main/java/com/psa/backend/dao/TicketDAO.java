package com.psa.backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.psa.backend.model.TicketEntity;

public interface TicketDAO extends JpaRepository<TicketEntity, Long> {
    
}
