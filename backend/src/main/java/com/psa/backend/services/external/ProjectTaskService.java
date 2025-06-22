package com.psa.backend.services.external;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.psa.backend.dto.ResponseTaskDTO;


@Service
public class ProjectTaskService {
    private final String NAME_EXTERNAL_SERVICE = "Servicio de Modulo de Proyectos";

    @Value("${external.api.project.url}")
    private String baseUrl; 

    public List<ResponseTaskDTO> getTasksByTicketId(String ticketId) {
        if (!StringUtils.hasText(ticketId)) {
            throw new IllegalArgumentException("El ID del ticket no puede ser nulo o vacío");
        }

        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        String url = baseUrl + "/tickets/externo/"+ticketId+"/tareas";

        ResponseEntity<String> response = new RestTemplate().exchange(url, HttpMethod.GET, null, String.class);
        String json = response.getBody();

        List<ResponseTaskDTO> output = null;
        try {
            output = mapper.readValue(json, new TypeReference<List<ResponseTaskDTO>>() {
            });
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

        return output;
    }
}