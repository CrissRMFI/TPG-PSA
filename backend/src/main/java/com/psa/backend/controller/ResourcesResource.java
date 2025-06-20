package com.psa.backend.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.psa.backend.dto.external.ResponseResourceDTO;
import com.psa.backend.services.external.ResourceService;

@CrossOrigin
@RestController
@RequestMapping("external/resources")
public class ResourcesResource {
    @Autowired 
    public ResourceService resourceService;

    @GetMapping
    public List<ResponseResourceDTO> getAllResources() {
        return resourceService.getAllResources();
    }
}
