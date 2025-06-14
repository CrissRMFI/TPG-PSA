package com.psa.backend.dto;

import com.psa.backend.dto.external.ResponseResourceDTO;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ResponseTicketDTO {
    Long internalId;
    String codigo;
    String severidad;
    String impacto;
    String descripcion;
    ResponseResourceDTO responsable; // Empleado responsable
    //Long idInformador; Reemplazar por ClienteDTO
    //Long idVersionProducto; Reemplazar por ProductoDTO
    //Long idTarea; Reemplazar por TareaDTO
}
