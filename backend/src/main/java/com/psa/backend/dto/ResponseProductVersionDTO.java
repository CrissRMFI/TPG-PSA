package com.psa.backend.dto;

import com.psa.backend.enums.TicketPriorityScaleEnum;
import com.psa.backend.enums.TicketSeverityScaleEnum;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ResponseProductVersionDTO {
    private String idVersion;
    private String nombreVersion;
}
