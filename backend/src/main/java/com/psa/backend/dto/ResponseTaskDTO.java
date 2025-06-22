package com.psa.backend.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ResponseTaskDTO {
        Long ticketId;// 4,
        Long tareaId;// 27,
        String tareaTitulo;// "Tarea para prueba",
        String tareaDescripcion;// "Esta es una tarea de prueba de un ciclo de un proyecto",
        String tareaEstado;// "PENDIENTE",
        String tareaPrioridad;// "ALTA",
        String tareaResponsable;// "Martin Garcia",
        String proyectoId;// 20,
        String proyectoNombre;// "Proyecto Prueba",
        //Innecesarios
        //String ticketExternoId;// "1",
        //String ticketCodigo;// "SAP-1",
        //String ticketNombre;// "TEST NOMBRE",
        //String ticketPrioridad;// "HIGH_PRIORITY",
        //String ticketSeveridad;// "LEVEL_1",
        //String ticketEstado;// "ASIGNADO",
        //String ticketIdCliente;// "1",
        //String ticketIdProducto;// "1",
        //String ticketIdResponsable;// "ff14a491-e26d-4092-86ea-d76f20c165d1",
        //String ticketFechaCreacion;// "2025-06-21T13:54:20.268256"
}
