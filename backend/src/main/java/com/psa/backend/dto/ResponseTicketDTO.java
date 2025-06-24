package com.psa.backend.dto;

import java.time.LocalDate;

import com.psa.backend.enums.TicketPriorityScaleEnum;
import com.psa.backend.enums.TicketSeverityScaleEnum;
import com.psa.backend.enums.TicketStateEnum;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ResponseTicketDTO {
    private String internalId;
    private String codigo;
    private String nombre;
    private TicketPriorityScaleEnum prioridad;
    private TicketSeverityScaleEnum severidad;
    private TicketStateEnum estado;
    private String descripcion;
    private String version;
    private Long idVersion;
    private String idProducto;
    private String idResponsable;
    private String idCliente;
    private LocalDate fechaCreacion;
}
