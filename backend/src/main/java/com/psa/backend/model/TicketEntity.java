package com.psa.backend.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "tfa_support_tickets")
@Data
public class TicketEntity {
    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sec_ticket_id")
    @SequenceGenerator(name = "sec_ticket_id", sequenceName = "sec_ticket_id", allocationSize = 1)
    @Column(name = "NMSEC_TICKET_Id", nullable = false, unique = true)
    Long id;
    // Codigo del Ticket 

    @Column(name = "VA_TICKET_CODE", nullable = false)
    String code;

    @Column(name = "VA_DESCRIPTION")
    String description;

    @Column(name = "NM_SEVERITY", nullable = false)
    Integer severityLevel;

    @Column(name = "VA_CLIENT_ID", nullable = false)
    String clientId;

    @Column(name = "VA_ASIGNED_EMPLOYEE_ID") //TODO: SIEMPRE SE LE ASIGNA?
    String asignedEmployeeId;

    @Column(name = "VA_PROJECT_ID", nullable = false)
    String projectId;

    @OneToMany(fetch = FetchType.LAZY,  mappedBy = "ticketId") //TODO: SIEMPRE TIENE UNA TAREA??
    List<TicketTaskRelationEntity> taskIds = new ArrayList();
}
