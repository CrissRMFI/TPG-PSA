package com.psa.backend.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public enum TicketSeverityScaleEnum {
    LEVEL_1(1),
    LEVEL_2(2),
    LEVEL_3(3),
    LEVEL_4(4),
    LEVEL_5(5);

    private final Integer level;

    TicketSeverityScaleEnum(Integer level) {
        this.level = level;
    }

    @JsonValue
    public String getCode() {
        return this.name();
    }

    @JsonCreator
    public static TicketSeverityScaleEnum fromCode(String code) {
        return TicketSeverityScaleEnum.valueOf(code);
    }


    public String getLabel() {
        return level.toString();
    }

    public static List<Map<String, String>> getAllTicketSeverityScales() {
        List<Map<String, String>> list = new ArrayList<>();
        for (TicketSeverityScaleEnum s : TicketSeverityScaleEnum.values()) {
            list.add(Map.of(
                    "code", s.getCode(),
                    "label", s.getLabel()
            ));
        }
        return list;
    }
}
