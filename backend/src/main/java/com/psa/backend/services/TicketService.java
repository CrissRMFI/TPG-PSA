package com.psa.backend.services;

import java.util.List;
import java.util.UUID;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import com.psa.backend.dao.ProductVersionDAO;
import com.psa.backend.dao.TicketDAO;
import com.psa.backend.dto.RequestAsignTicketDTO;
import com.psa.backend.dto.RequestTicketDTO;
import com.psa.backend.dto.ResponseTicketDTO;
import com.psa.backend.dto.ResponseTicketDataDTO;
import com.psa.backend.dto.ResponseTicketScoresDTO;
import com.psa.backend.dto.external.ResponseClientDTO;
import com.psa.backend.dto.external.ResponseResourceDTO;
import com.psa.backend.enums.*;
import com.psa.backend.model.ProductEntity;
import com.psa.backend.model.ProductVersionEntity;
import com.psa.backend.model.TicketEntity;
import com.psa.backend.services.external.ClientsService;
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
    public ProductVersionDAO productVersionDao;
    @Autowired
    public ResourceService resourceService;
    @Autowired
    public ClientsService clientService;

    private ResponseTicketDTO convertToDTO(TicketEntity ticket) {
        return ResponseTicketDTO.builder()
                .internalId(ticket.getId().toString())
                .codigo(ticket.getVersion().getProducto().getPrefix() + ticket.getId())
                .nombre(ticket.getNombre())
                .prioridad(ticket.getPrioridad())
                .severidad(ticket.getSeveridad())
                .estado(ticket.getEstado())
                .descripcion(ticket.getDescripcion())
                .version(ticket.getVersion().getVersion())
                .idCliente(ticket.getIdCliente())
                .idProducto(ticket.getVersion().getProducto().getId().toString())
                .idResponsable(ticket.getIdResponsable())
                .build();
    }

    private ResponseTicketDataDTO convertToTicketData(TicketEntity ticket) {
        ResponseResourceDTO resource = resourceService.getResourceById(ticket.getIdResponsable(), false);
        ResponseClientDTO client = clientService.getClientById(ticket.getIdCliente(), false);
        return ResponseTicketDataDTO.builder()
                .internalId(ticket.getId())
                .codigo(ticket.getVersion().getProducto().getPrefix() + "-" + ticket.getId())
                .nombre(ticket.getNombre())
                .prioridad(ticket.getPrioridad().getCode())
                .prioridadLabel(ticket.getPrioridad().getLabel())
                .severidad(ticket.getSeveridad().getCode())
                .severidadLabel(ticket.getSeveridad().getLabel())
                .estado(ticket.getEstado().getCode())
                .estadoLabel(ticket.getEstado().getLabel())
                .descripcion(ticket.getDescripcion())
                .version(ticket.getVersion().getVersion())
                .idCliente(ticket.getIdCliente())
                .nombreCliente(client.getRazon_social())
                .idProducto(ticket.getVersion().getProducto().getId().toString())
                .nombreProducto(ticket.getVersion().getProducto().getNombre())
                .idVersion(ticket.getVersion().getId().toString())
                .version(ticket.getVersion().getVersion())
                .idResponsable(ticket.getIdResponsable())
                .nombreResponsable(StringUtils.hasText(resource.getNombre()) ? resource.getNombre() +" "+ resource.getApellido() : "Desconocido" )
                .build();
    }

    private TicketEntity convertToEditEntity(RequestTicketDTO dto) {
        TicketEntity ticket = new TicketEntity();
        ticket.setNombre(dto.getNombre());
        ticket.setPrioridad(dto.getPrioridad());
        ticket.setSeveridad(dto.getSeveridad());
        ticket.setDescripcion(dto.getDescripcion());
        ticket.setIdCliente(dto.getIdCliente());
        ticket.setVersion(ProductVersionEntity.builder().id(Long.valueOf(dto.getVersion())).build());
        ticket.setIdResponsable(dto.getIdResponsable());
        ticket.setEstado(TicketStateEnum.CREATED);

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

    private TicketEntity convertToCreateEntity(RequestTicketDTO dto) {
        TicketEntity ticket = new TicketEntity();
        ticket.setNombre(dto.getNombre());
        ticket.setPrioridad(dto.getPrioridad());
        ticket.setSeveridad(dto.getSeveridad());
        ticket.setDescripcion(dto.getDescripcion());
        ticket.setIdCliente(dto.getIdCliente());
        ticket.setVersion(productVersionDao.findById(dto.getVersion()).get());
        ticket.setIdResponsable(dto.getIdResponsable());
        ticket.setEstado(TicketStateEnum.CREATED);
        return ticket;
    }

    private TicketEntity updateTicket(TicketEntity old, RequestTicketDTO ticket) {
        old.setDescripcion(ticket.getDescripcion());
        return old;
    }

    @Transactional
    public ResponseTicketDTO createTicket(RequestTicketDTO dto) {
        TicketEntity entity = convertToCreateEntity(dto);
        entity = ticketDao.save(entity);
        ResponseTicketDTO createdDto = convertToDTO(entity);
        log.info("Guardando ticket: {}", createdDto);
        return createdDto;
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

    @Transactional(readOnly = true)
    public List<ResponseTicketDTO> getTicketsPorProductoYVersion(String id) {
        return ticketDao.findAllByVersionId(Long.valueOf(id)).map(this::convertToDTO).toList();
    }

    @Transactional(readOnly = true)
    public List<ResponseTicketDataDTO> getTicketsDataByVersionId(String idVersion) {
        Stream<TicketEntity> tickets = ticketDao.findAllByVersionId(Long.valueOf(idVersion));
        return tickets.map(ticket -> convertToTicketData(ticket)).toList();
        
    }

    public ResponseTicketDTO getById(String id) throws Exception {
        TicketEntity ticket = ticketDao.findById(id)
                .orElseThrow(() -> new Exception("Ticket no encontrado"));
        return convertToDTO(ticket);
    }

    public ResponseTicketDataDTO getTicketDataById(String id) throws Exception {
        TicketEntity ticket = ticketDao.findById(id)
                .orElseThrow(() -> new Exception("Ticket no encontrado"));
        return convertToTicketData(ticket);
    }

    public List<ResponseTicketDataDTO> getAllTicketsData() {
        return ticketDao.findAll()
                .stream()
                .map(this::convertToTicketData)
                .toList();
    }

}
