package com.psa.backend.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ResponseProductVersionDTO {
    private String idVersion;
    private String nombreVersion;
}
