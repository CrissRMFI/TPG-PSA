package com.psa.backend.dto;

import com.psa.backend.enums.TicketPriorityScaleEnum;
import com.psa.backend.enums.TicketSeverityScaleEnum;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ResponseProductDTO {
    private String idProducto;
    private String nombreProducto;
    private List<ResponseProductVersionDTO> versiones; // códigos de tareas asociadas
}
