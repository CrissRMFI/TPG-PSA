package com.psa.backend.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RequestTicketDTO {
    Long id;
    String codigo;
    String severidad;
    String impacto;
    String descripcion;
    //Long idResponsable; Reemplazar por EmpleadoDTO 
    //Long idInformador; Reemplazar por ClienteDTO
    //Long idVersionProducto; Reemplazar por ProductoDTO
    //Long idTarea; Reemplazar por TareaDTO
}
