package com.psa.backend.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public enum TicketPriorityScaleEnum {
    HIGH_PRIORITY(1,"ALTA"),
    MEDIUM_PRIORITY(2,"MEDIA"),
    LOW_PRIORITY(3,"BAJA");

    private Integer id;
    private String es_translation;

    TicketPriorityScaleEnum(Integer value, String esTranslation) {
        this.id = value;
        this.es_translation = esTranslation;
    }

    @JsonValue
    public String getCode() {
        return this.name();
    }

    @JsonCreator
    public static TicketPriorityScaleEnum fromCode(String code) {
        return TicketPriorityScaleEnum.valueOf(code);
    }


    public String getLabel() {
        return es_translation;
    }

    public static List<Map<String, String>> getAllTicketPriorityScales() {
        List<Map<String, String>> list = new ArrayList<>();
        for (TicketPriorityScaleEnum prioridad : TicketPriorityScaleEnum.values()) {
            list.add(Map.of(
                    "code", prioridad.getCode(),
                    "label", prioridad.getLabel()
            ));
        }
        return list;
    }
}
