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

    public static List<Map<String,String>> getAllTicketPriorityScales() {
        List<Map<String,String>> list = new ArrayList<>();
        for ( TicketSeverityScaleEnum ticket : TicketSeverityScaleEnum.values() ) {
            Map<String,String> map = Map.of("id", ticket.level.toString(), "nivel", ticket.level.toString());
            list.add(map);
        }
        return list;
    }
}
