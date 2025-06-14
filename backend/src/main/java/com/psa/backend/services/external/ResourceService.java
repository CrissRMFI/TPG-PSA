package com.psa.backend.services.external;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.psa.backend.dto.RequestTicketDTO;
import com.psa.backend.dto.external.ResponseResourceDTO;
import com.psa.backend.exceptions.ExternalEntityNotFoundException;
import com.psa.backend.model.TicketEntity;


@Service
public class ResourceService {
    private final String NAME_EXTERNAL_SERVICE = "Servicio de Recursos";

    @Value("${external.api.resources.url}")
    private String baseUrl; 

    private List<ResponseResourceDTO> getResourcesFromExternalAPI() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        ResponseEntity<String> response = new RestTemplate().exchange(baseUrl, HttpMethod.GET, null, String.class);
        String json = response.getBody();

        List<ResponseResourceDTO> output = null;
        try {
            output = mapper.readValue(json, new TypeReference<List<ResponseResourceDTO>>() {
            });
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        return output;
    }

    public List<ResponseResourceDTO> getAllResources() {
        return getResourcesFromExternalAPI();
    }

    public ResponseResourceDTO getResourceById(String responsableId, boolean throwIfNotFound) {
        if (!StringUtils.hasText(responsableId)) {
            throw new IllegalArgumentException("El ID del responsable no puede ser nulo o vacío");
        }

        Optional<ResponseResourceDTO> resource = getResourcesFromExternalAPI().stream()
                .filter(r -> Objects.equals(responsableId, r.getId()))
                .findFirst();

        if (throwIfNotFound && resource.isEmpty()) {
            throw new ExternalEntityNotFoundException(responsableId, NAME_EXTERNAL_SERVICE);
        }

        return resource.orElse(null);
    }
}