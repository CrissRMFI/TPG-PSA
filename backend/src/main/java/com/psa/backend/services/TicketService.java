package com.psa.backend.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import com.psa.backend.dao.TicketDAO;
import com.psa.backend.dto.RequestAsignTicketDTO;
import com.psa.backend.dto.RequestTicketDTO;
import com.psa.backend.dto.ResponseTicketDTO;
import com.psa.backend.dto.ResponseTicketScoresDTO;
import com.psa.backend.enums.*;
import com.psa.backend.model.TicketEntity;
import com.psa.backend.services.external.ResourceService;
import com.psa.backend.model.TicketTaskRelationEntity;
import com.psa.backend.dto.ResponseTicketDTO;




import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class TicketService {
    @Autowired
    public TicketDAO ticketDao;
    @Autowired
    public ResourceService resourceService;

    private ResponseTicketDTO convertToDTO(TicketEntity ticket) {
        return ResponseTicketDTO.builder()
                .internalId(ticket.getId())
                .codigo(ticket.getCodigo())
                .nombre(ticket.getNombre())
                .prioridad(ticket.getPrioridad())
                .severidad(ticket.getSeveridad())
                .estado(ticket.getEstado())
                .descripcion(ticket.getDescripcion())
                .version(ticket.getVersion())
                .idCliente(ticket.getIdCliente())
                .idProducto(ticket.getIdProducto())
                .idResponsable(ticket.getIdResponsable())
                .build();
    }


    private TicketEntity crearDesdeDTO(RequestTicketDTO dto) {
        TicketEntity ticket = new TicketEntity();
        ticket.setId(UUID.randomUUID().toString());
        ticket.setNombre(dto.getNombre());
        ticket.setPrioridad(dto.getPrioridad());
        ticket.setSeveridad(dto.getSeveridad());
        ticket.setDescripcion(dto.getDescripcion());
        ticket.setIdCliente(dto.getIdCliente());
        ticket.setIdProducto(dto.getIdProducto());
        ticket.setVersion(dto.getVersion());
        ticket.setIdResponsable(dto.getIdResponsable());
        ticket.setEstado(TicketStateEnum.CREATED);
        ticket.setCodigo("TCK-" + System.currentTimeMillis());

        if (dto.getTaskCodes() != null && !dto.getTaskCodes().isEmpty()) {
            List<TicketTaskRelationEntity> tareas = dto.getTaskCodes().stream()
                    .map(code -> {
                        TicketTaskRelationEntity tarea = new TicketTaskRelationEntity();
                        tarea.setTaskCode(code);
                        tarea.setTicket(ticket);
                        return tarea;
                    }).toList();

            ticket.setTareas(tareas);
        }

        return ticket;
    }

    private TicketEntity updateTicket(TicketEntity old, RequestTicketDTO ticket) {
        old.setDescripcion(ticket.getDescripcion());
        return old;
    }

    @Transactional
    public ResponseTicketDTO createTicket(RequestTicketDTO dto) {
        TicketEntity entity = crearDesdeDTO(dto);
        log.info("Guardando ticket: {}", entity);
        return convertToDTO(ticketDao.save(entity));
    }

    public ResponseTicketDTO updateTicket(String id, RequestTicketDTO ticket) throws Exception {
        TicketEntity old = ticketDao.findById(id).orElseThrow(() -> new Exception("No existe la entidad con id: " + id));
        TicketEntity updated = this.updateTicket(old, ticket);
        return convertToDTO(ticketDao.save(updated));
    }

    public ResponseTicketDTO updateAsignedResource(String id, RequestAsignTicketDTO asignTicket) throws Exception {
        //TODO
        return null;
    }

    public String deleteTicket(String id) {
        ticketDao.deleteById(id);
        return id;
    }

    public List<ResponseTicketDTO> getAllTickets() {
        return ticketDao.findAll()
                .stream()
                .map(this::convertToDTO)
                .toList();
    }


    public ResponseTicketScoresDTO getTicketScores() {
        return ResponseTicketScoresDTO.builder()
                .severityScores(TicketSeverityScaleEnum.getAllTicketSeverityScales())
                .prorityScores(TicketPriorityScaleEnum.getAllTicketPriorityScales())
                .states(TicketStateEnum.getAllTicketStates())
                .build();
    }

    public List<ResponseTicketDTO> getTicketsPorProductoYVersion(String idProducto, String version) {
        return ticketDao.findAll().stream()
                .filter(t -> t.getIdProducto().equals(idProducto))
                .filter(t -> t.getVersion().equals(version))
                .map(this::convertToDTO)
                .toList();
    }

    public ResponseTicketDTO getById(String id) throws Exception {
        TicketEntity ticket = ticketDao.findById(id)
                .orElseThrow(() -> new Exception("Ticket no encontrado"));
        return convertToDTO(ticket);
    }


}
