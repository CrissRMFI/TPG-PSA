package com.psa.backend.dao;

import java.util.stream.Stream;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.psa.backend.model.TicketEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketDAO extends JpaRepository<TicketEntity, String> {

    @Query("SELECT te FROM TicketEntity te WHERE te.idProducto = :idProducto AND te.version = :version")
    public Stream<TicketEntity> findAllByIdProductoYVersion(String idProducto, String version);
    
}
