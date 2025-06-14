package com.psa.backend.enums;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public enum TicketPriorityScaleEnum {
    HIGH_PRIORITY(1,"ALTA"),
    MEDIUM_PRIORITY(2,"MEDIA"),
    LOW_PROORITY(3,"BAJA");

    private Integer id;
    private String es_translation;

    TicketPriorityScaleEnum(Integer value, String esTranslation) {
        this.id = value;
        this.es_translation = esTranslation;
    }

    public static List<Map<String,String>> getAllTicketPriorityScales() {
        List<Map<String,String>> list = new ArrayList<>();
        for ( TicketPriorityScaleEnum ticket : TicketPriorityScaleEnum.values() ) {
            Map<String,String> map = Map.of("id", ticket.id.toString(), "descripcion", ticket.es_translation);
            list.add(map);
        }
        return list;
    }
}
