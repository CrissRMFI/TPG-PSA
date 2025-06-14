package com.psa.backend.exceptions;

public class ExternalEntityNotFoundException extends RuntimeException {
    public ExternalEntityNotFoundException(String idExternalEntity, String externalSystem) {
        super("La entidad external con el id "+ idExternalEntity +" no existe en el sistema externo "+ externalSystem);
    }
}
