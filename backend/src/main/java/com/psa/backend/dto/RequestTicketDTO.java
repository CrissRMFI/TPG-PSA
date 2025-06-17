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
    private String idCliente;
    private String idProducto;
    private String version;
    private String idResponsable; // opcional
    private List<String> taskCodes; // códigos de tareas asociadas
    private String descripcion;


}
