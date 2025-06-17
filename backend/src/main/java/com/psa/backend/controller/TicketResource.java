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
import com.psa.backend.dto.ResponseTicketScoresDTO;
import com.psa.backend.dto.external.ResponseResourceDTO;
import com.psa.backend.model.TicketEntity;
import com.psa.backend.services.external.ResourceService;
import com.psa.backend.services.TicketService;

@CrossOrigin
@RestController
@RequestMapping("/ticket")
public class TicketResource {
    @Autowired 
    public TicketService ticketService;

    @GetMapping
    public List<ResponseTicketDTO> getAllTickets() {
        return ticketService.getAllTickets();
    }

    @GetMapping("scores")
    public ResponseTicketScoresDTO getTicketScores() {
        return ticketService.getTicketScores();
    }

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


    @DeleteMapping("/{ticketId}")
    public ResponseEntity deleteTicket(@PathVariable String ticketId) {
        try {
            String id = ticketService.deleteTicket(ticketId);
            return ResponseEntity.ok().body(id);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

}
