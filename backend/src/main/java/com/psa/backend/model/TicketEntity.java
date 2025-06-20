package com.psa.backend.model;

import com.psa.backend.enums.TicketPriorityScaleEnum;
import com.psa.backend.enums.TicketSeverityScaleEnum;
import com.psa.backend.enums.TicketStateEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tfa_support_tickets")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TicketEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sec_tfa_ticket_code")
    @SequenceGenerator(name = "sec_tfa_ticket_code", sequenceName = "sec_tfa_ticket_code", allocationSize = 1)
    @Column(name = "NMSEC_TICKET_ID", nullable = false, unique = true)
    Long id;

    @Column(name = "VA_NOMBRE", nullable = false)
    private String nombre;

    @Enumerated(EnumType.STRING)
    @Column(name = "VA_PRIORIDAD", nullable = false)
    private TicketPriorityScaleEnum prioridad;

    @ManyToOne
    @JoinColumn(name = "NM_SEC_VERSION_ID", nullable = false)
    private ProductVersionEntity version;

    @Column(name = "VA_DESCRIPTION")
    String descripcion;

    @Enumerated(EnumType.STRING)
    @Column(name = "NM_SEVERITY", nullable = false)
    TicketSeverityScaleEnum severidad;

    @Column(name = "VA_EXTERNAL_CLIENTE_ID", nullable = false)
    private String idCliente;

    @Column(name = "VA_EXTERNAL_RESPONSABLE_ID")
    private String idResponsable;

    @Enumerated(EnumType.STRING)
    @Column(name = "VA_ESTADO", nullable = false)
    private TicketStateEnum estado;
}
