package com.psa.backend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "tfa_support_tickets_task_relation")
@Data
public class TicketTaskRelationEntity {
    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sec_ticket_task_realtion_id")
    @SequenceGenerator(name = "sec_ticket_task_relation_id", sequenceName = "sec_ticket_task_realtion_id", allocationSize = 1)
    @Column(name = "NMSEC_TICKET_TASK_RELATION_ID", nullable = false, unique = true)
    Long id;

    @Column(name = "NMSEC_TICKET_ID")
    String ticketId;

    @Column(name = "VA_TASK_CODE")
    String taskCode;
}
