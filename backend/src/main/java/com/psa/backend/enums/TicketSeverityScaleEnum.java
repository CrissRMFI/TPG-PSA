package com.psa.backend.enums;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public enum TicketSeverityScaleEnum {
    LEVEL_1(1),
    LEVEL_2(2),
    LEVEL_3(3),
    LEVEL_4(4),
    LEVEL_5(5);

    private Integer level;

    TicketSeverityScaleEnum(Integer level) {
        this.level = level;
    }

    public static List<Map<String,String>> getAllTicketSeverityScales() {
        List<Map<String,String>> list = new ArrayList<>();
        for (TicketSeverityScaleEnum severidad : TicketSeverityScaleEnum.values()) {
            list.add(Map.of(
                    "code", severidad.name(),
                    "label", severidad.level.toString()
            ));
        }
        return list;
    }
}
