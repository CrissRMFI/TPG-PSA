package com.psa.backend.model;

import java.util.ArrayList;
import java.util.List;

import com.psa.backend.enums.TicketPriorityScaleEnum;
import com.psa.backend.enums.TicketSeverityScaleEnum;
import com.psa.backend.enums.TicketStateEnum;
import jakarta.persistence.*;
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
    String id;
    // Codigo del Ticket 

    @Column(name = "VA_NOMBRE", nullable = false)
    private String nombre;

    @Enumerated(EnumType.STRING)
    @Column(name = "VA_PRIORIDAD", nullable = false)
    private TicketPriorityScaleEnum prioridad;

    @Column(name = "VA_TICKET_CODE", nullable = false)
    String codigo;

    @Column(name = "ID_CLIENTE", nullable = false)
    private String idCliente;

    @Column(name = "ID_PRODUCTO", nullable = false)
    private String idProducto;

    @Column(name = "VA_VERSION", nullable = false)
    private String version;

    @Column(name = "VA_DESCRIPTION")
    String descripcion;

    @Enumerated(EnumType.STRING)
    @Column(name = "NM_SEVERITY", nullable = false)
    TicketSeverityScaleEnum severidad;

    @Column(name = "ID_RESPONSABLE")
    private String idResponsable;

    @Enumerated(EnumType.STRING)
    @Column(name = "VA_ESTADO", nullable = false)
    private TicketStateEnum estado;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "ticket", cascade = CascadeType.ALL)
    List<TicketTaskRelationEntity> tareas = new ArrayList();
}
