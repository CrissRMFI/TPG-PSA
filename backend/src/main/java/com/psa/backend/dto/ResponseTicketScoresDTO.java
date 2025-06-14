package com.psa.backend.dto;

import java.util.List;
import java.util.Map;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ResponseTicketScoresDTO {
    List<Map<String,String>> severityScores;
    List<Map<String,String>> prorityScores;
    List<Map<String,String>> states;
    
}
