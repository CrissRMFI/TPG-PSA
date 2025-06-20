package com.psa.backend.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.psa.backend.dto.external.ResponseClientDTO;
import com.psa.backend.services.external.ClientsService;

@CrossOrigin
@RestController
@RequestMapping("external/clients")
public class ClientsResources{
    @Autowired 
    public ClientsService clientsService;

    @GetMapping
    public List<ResponseClientDTO> getAllClients() {
        return clientsService.getAllClients();
    }
}
