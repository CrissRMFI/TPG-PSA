package com.psa.backend.enums;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public enum TicketStateEnum {
    CREATED(1,"CREADO"),
    IN_PROGRESS(2,"EN PROGRESO"),
    WAITING_FOR_VALIDATION(3,"EN ESPERA DE INFORMACION"),
    BLOCKED(4,"BLOQUEADO"),
    FINISHED(5,"FINALIZADO");

    private Integer id;
    private String es_translation;

    TicketStateEnum(Integer value, String esTranslation) {
        id = value;
        es_translation = esTranslation;
    }

    public static List<Map<String, String>> getAllTicketStates() {
        List<Map<String, String>> list = new ArrayList<>();
        for (TicketStateEnum estado : TicketStateEnum.values()) {
            list.add(Map.of(
                    "code", estado.name(),
                    "label", estado.es_translation
            ));
        }
        return list;
    }

}
