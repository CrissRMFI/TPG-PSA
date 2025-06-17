package com.psa.backend.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public enum TicketStateEnum {
    CREATED(1, "CREADO"),
    IN_PROGRESS(2, "EN PROGRESO"),
    WAITING_FOR_VALIDATION(3, "EN ESPERA DE INFORMACION"),
    BLOCKED(4, "BLOQUEADO"),
    FINISHED(5, "FINALIZADO"),
    CANCEL(6, "CANCELADO"),
    REJECTED(7, "RECHAZADO");

    private final Integer id;
    private final String es_translation;

    TicketStateEnum(Integer value, String esTranslation) {
        this.id = value;
        this.es_translation = esTranslation;
    }

    @JsonValue
    public String getCode() {
        return this.name();
    }

    @JsonCreator
    public static TicketStateEnum fromCode(String code) {
        return TicketStateEnum.valueOf(code);
    }

    public String getLabel() {
        return es_translation;
    }

    public static List<Map<String, String>> getAllTicketStates() {
        List<Map<String, String>> list = new ArrayList<>();
        for (TicketStateEnum estado : TicketStateEnum.values()) {
            list.add(Map.of(
                    "code", estado.getCode(),
                    "label", estado.getLabel()
            ));
        }
        return list;
    }
}
