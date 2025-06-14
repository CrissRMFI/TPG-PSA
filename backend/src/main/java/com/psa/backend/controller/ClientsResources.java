package com.psa.backend.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.psa.backend.dto.RequestAsignTicketDTO;
import com.psa.backend.dto.RequestTicketDTO;
import com.psa.backend.dto.ResponseTicketDTO;
import com.psa.backend.dto.external.ResponseClientDTO;
import com.psa.backend.dto.external.ResponseResourceDTO;
import com.psa.backend.model.TicketEntity;
import com.psa.backend.services.external.ClientsService;
import com.psa.backend.services.external.ResourceService;
import com.psa.backend.services.TicketService;

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
