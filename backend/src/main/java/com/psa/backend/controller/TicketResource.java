package com.psa.backend.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.psa.backend.dto.RequestTicketDTO;
import com.psa.backend.dto.ResponseTicketDTO;
import com.psa.backend.dto.ResponseTicketDataDTO;
import com.psa.backend.dto.ResponseTicketTasksDataDTO;
import com.psa.backend.services.TicketService;

@CrossOrigin
@RestController
@RequestMapping("/ticket")
public class TicketResource {
    @Autowired 
    public TicketService ticketService;


    @PostMapping
    public ResponseEntity createTicket(@RequestBody RequestTicketDTO ticket) {
        try {
            ResponseTicketDTO output = ticketService.createTicket(ticket);
            return ResponseEntity.ok().body(output.getCodigo());
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PutMapping("/{ticketId}")
    public ResponseEntity updateTicket(
        @PathVariable String ticketId,
        @RequestBody RequestTicketDTO ticket) {
        try {
            ResponseTicketDTO output = ticketService.updateTicket(ticketId,ticket);
            return ResponseEntity.ok().body(output.getCodigo());
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }


    @PutMapping("cancel/{ticketId}")
    public ResponseEntity cancelTicket(@PathVariable String ticketId) {
        try {
            String id = ticketService.cancelTicket(ticketId);
            return ResponseEntity.ok().body(id);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @GetMapping("/state/uncompleted")
    public List<ResponseTicketDataDTO> getUncompletedTicketsData() {
        return ticketService.getUncompletedTicketsData();
    }

    @GetMapping("/data")
    public List<ResponseTicketTasksDataDTO> getAllTicketsData() {
        return ticketService.getAllTicketsData();
    }

    @GetMapping("data/{id}")
    public ResponseEntity<?> getTicketDataById(@PathVariable String id) {
        try {
            ResponseTicketTasksDataDTO ticket = ticketService.getTicketDataById(id);
            return ResponseEntity.ok(ticket);
        } catch (Exception e) {
            return ResponseEntity.status(404).body(e.getMessage());
        }
    }

    @GetMapping("/version/{idVersion}")
    public List<ResponseTicketTasksDataDTO> getTicketDeVersion(
            @PathVariable String idVersion 
    ) {
        return ticketService.getTicketsDataByVersionId(idVersion);
    }

}
