package com.psa.backend.controller;

import com.psa.backend.enums.TicketPriorityScaleEnum;
import com.psa.backend.enums.TicketSeverityScaleEnum;
import com.psa.backend.enums.TicketStateEnum;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/ticket/metadata")
@CrossOrigin
public class TicketMetadataController {

    @GetMapping("/metadatos")
    public Map<String, List<Map<String, String>>> getAllMetadata() {
        return Map.of(
                "estados", TicketStateEnum.getAllTicketStates(),
                "prioridades", TicketPriorityScaleEnum.getAllTicketPriorityScales(),
                "severidades", TicketSeverityScaleEnum.getAllTicketSeverityScales()
        );
    }
}
