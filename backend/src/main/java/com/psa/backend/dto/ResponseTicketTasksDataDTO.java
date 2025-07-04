package com.psa.backend.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResponseTicketTasksDataDTO {
    private Long internalId; 
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
    private String nombreProducto;// P-0001,

    private String idVersion;// P-0001,
    private String version;// 7.50,

    private String idResponsable;// ff14a491-e26d-4092-86ea-d76f20c165d1,
    private String nombreResponsable;// Desconocido,

    private String fechaCreacion;// 25 Dic 2025

    private List<ResponseTaskDTO> tasks;
}
