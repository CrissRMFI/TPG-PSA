package com.psa.backend.dto;

import com.psa.backend.dto.external.ResponseResourceDTO;

import com.psa.backend.enums.TicketPriorityScaleEnum;
import com.psa.backend.enums.TicketSeverityScaleEnum;
import com.psa.backend.enums.TicketStateEnum;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ResponseTicketDataDTO {
    private String internalId;// a4959e17-dd51-4386-8d41-716bf09c1b3e,
    private String codigo;// TCK-1750335319951,
    private String nombre;// Ticket Prueba Deploy,
    private String descripcion;// Prueba,

    private String prioridad;// HIGH_PRIORITY,
    private String prioridadLabel;// Alta,

    private String severidad;// LEVEL_1,
    private String severidadLabel;// 1,

    private String estado;// CREATED,
    private String estadoLabel;// Creado

    private String idCliente;// 3,
    private String nombreCliente;// Desconocido,

    private String idProducto;// P-0001,
    private String version;// 7.50,

    private String idResponsable;// ff14a491-e26d-4092-86ea-d76f20c165d1,
    private String nombreResponsable;// Desconocido,
}
