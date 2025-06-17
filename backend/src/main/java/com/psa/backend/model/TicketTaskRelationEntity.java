package com.psa.backend.model;

import jakarta.persistence.*;
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
    private Long id;

    @ManyToOne
    @JoinColumn(name = "NMSEC_TICKET_ID", referencedColumnName = "NMSEC_TICKET_ID")
    private TicketEntity ticket;

    @Column(name = "VA_TASK_CODE")
    private String taskCode;
}
