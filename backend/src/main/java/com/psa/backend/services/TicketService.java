package com.psa.backend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.psa.backend.dao.TicketDAO;
import com.psa.backend.dto.RequestAsignTicketDTO;
import com.psa.backend.dto.RequestTicketDTO;
import com.psa.backend.dto.ResponseTicketDTO;
import com.psa.backend.dto.ResponseTicketScoresDTO;
import com.psa.backend.enums.*;
import com.psa.backend.model.TicketEntity;
import com.psa.backend.services.external.ResourceService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class TicketService {
    @Autowired
    public TicketDAO ticketDao;
    @Autowired
    public ResourceService resourceService;

    private TicketEntity convertToEntity(RequestTicketDTO ticket) {
        TicketEntity output = new TicketEntity();

        output.setId(ticket.getId());
        output.setCode(ticket.getCodigo());
        output.setDescription(ticket.getDescripcion());
        //output.setImpacto(ticket.getImpacto());
        return output;
    }

    private ResponseTicketDTO convertToDTO(TicketEntity ticket) {
        ResponseTicketDTO output = ResponseTicketDTO.builder()
        .codigo(ticket.getCode())
        .descripcion(ticket.getDescription())
        .internalId(ticket.getId()).build();

        return output;
    }

    private TicketEntity updateTicket(TicketEntity old, RequestTicketDTO ticket) {
        old.setDescription(ticket.getDescripcion());
        return old;
    }


    public ResponseTicketDTO createTicket(RequestTicketDTO ticket) {
        TicketEntity entity = convertToEntity(ticket);
        log.info("Try to connect to de DB to save the client: " + entity.toString());
        return convertToDTO(ticketDao.save(entity));
    }

    public ResponseTicketDTO updateTicket(Long id, RequestTicketDTO ticket) throws Exception {
        TicketEntity old = ticketDao.findById(id).orElseThrow(() -> new Exception("No existe la entidad con id: " + id));
        TicketEntity updated = this.updateTicket(old, ticket);
        return convertToDTO(ticketDao.save(updated));
    }

    public ResponseTicketDTO updateAsignedResource(Long id, RequestAsignTicketDTO asignTicket) throws Exception {
        //TODO
        return null;
    }

    public Long deleteTicket(Long id) {
        ticketDao.deleteById(id);
        return id;
    }

    public List<ResponseTicketDTO> getAllTickets() {
        return ticketDao.findAll().stream().map(x -> convertToDTO(x)).toList();
    }

    public ResponseTicketScoresDTO getTicketScores() {
        return ResponseTicketScoresDTO.builder()
                .severityScores(TicketSeverityScaleEnum.getAllTicketPriorityScales())
                .prorityScores(TicketPriorityScaleEnum.getAllTicketPriorityScales())
                .states(TicketStateEnum.getAllTicketStates())
                .build();
    }

    
}
