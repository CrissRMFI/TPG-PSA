package com.psa.backend.dto.external;

import com.fasterxml.jackson.annotation.JsonAlias;

import lombok.Data;

@Data
public class ResponseClientDTO {
    public String id;
    @JsonAlias("razon social")
    public String razon_social;
    @JsonAlias("CUIT")
    public String codCUIT;
}
