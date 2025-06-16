package com.psa.backend.dto;

import com.psa.backend.enums.TicketPriorityScaleEnum;
import com.psa.backend.enums.TicketSeverityScaleEnum;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class RequestTicketDTO {
    private String nombre;
    private TicketPriorityScaleEnum prioridad;
    private TicketSeverityScaleEnum severidad;
    private Long idCliente;
    private Long idProducto;
    private String version;
    private Long idResponsable; // opcional
    private List<String> taskCodes; // códigos de tareas asociadas
    private String descripcion;


}
