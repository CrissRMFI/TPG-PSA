package com.psa.backend.dto;

import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
// NO MODIFICAR, USO EXCLUSIVO PARA EL ENDPOINT ticket/state/uncompleted
// caso contrario rompe la integración con el modulo de proyectos
public class ResponseTicketDataDTO {
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
}
