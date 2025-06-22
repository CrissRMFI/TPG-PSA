package com.psa.backend.services;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Locale;
import java.util.stream.Stream;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import com.psa.backend.dao.ProductVersionDAO;
import com.psa.backend.dao.TicketDAO;
import com.psa.backend.dto.RequestTicketDTO;
import com.psa.backend.dto.ResponseTicketDTO;
import com.psa.backend.dto.ResponseTicketDataDTO;
import com.psa.backend.dto.ResponseTicketTasksDataDTO;
import com.psa.backend.dto.external.ResponseClientDTO;
import com.psa.backend.dto.external.ResponseResourceDTO;
import com.psa.backend.model.TicketEntity;
import com.psa.backend.services.external.ClientsService;
import com.psa.backend.services.external.ProjectTaskService;
import com.psa.backend.services.external.ResourceService;
import com.psa.backend.enums.TicketStateEnum;

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
    @Autowired
    public ProjectTaskService projectTaskService;

    private DateTimeFormatter dateFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).withLocale(Locale.forLanguageTag("es-ES"));;

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
                .nombreResponsable(
                        StringUtils.hasText(resource.getNombre()) ? resource.getNombre() + " " + resource.getApellido()
                                : "Desconocido")
                .fechaCreacion(dateFormatter.format(ticket.getFechaCreacion()))
                .build();
    }

    private ResponseTicketTasksDataDTO convertToTicketTaskData(TicketEntity ticket) {
        ResponseResourceDTO resource = resourceService.getResourceById(ticket.getIdResponsable(), false);
        ResponseClientDTO client = clientService.getClientById(ticket.getIdCliente(), false);
        return ResponseTicketTasksDataDTO.builder()
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
                .nombreResponsable(
                        StringUtils.hasText(resource.getNombre()) ? resource.getNombre() + " " + resource.getApellido()
                                : "Desconocido")
                .build();
    }

    private TicketEntity convertToEditEntity(TicketEntity ticket, RequestTicketDTO dto) {
        ticket.setNombre(dto.getNombre());
        ticket.setDescripcion(dto.getDescripcion());
        ticket.setSeveridad(dto.getSeveridad());
        ticket.setPrioridad(dto.getPrioridad());
        ticket.setEstado(dto.getEstado());
        ticket.setIdResponsable(dto.getIdResponsable());

        // ticket.setVersion(ProductVersionEntity.builder().id(Long.valueOf(dto.getVersion())).build());
        // ticket.setIdCliente(dto.getIdCliente());
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
        ticket.setFechaCreacion(LocalDate.now());
        return ticket;
    }

    @Transactional
    public ResponseTicketDTO createTicket(RequestTicketDTO dto) {
        TicketEntity entity = convertToCreateEntity(dto);
        entity = ticketDao.save(entity);
        ResponseTicketDTO createdDto = convertToDTO(entity);
        log.info("Guardando ticket: {}", createdDto);
        return createdDto;
    }

    @Transactional
    public ResponseTicketDTO updateTicket(String id, RequestTicketDTO dto) throws Exception {
        TicketEntity ticket = ticketDao.findById(id)
                .orElseThrow(() -> new Exception("No existe la entidad con id: " + id));
        TicketEntity updated = this.convertToEditEntity(ticket, dto);
        return convertToDTO(ticketDao.save(updated));
    }

    @Transactional
    public String deleteTicket(String id) {
        ticketDao.deleteById(id);
        return id;
    }

    @Transactional(readOnly = true)
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

    @Transactional(readOnly = true)
    public ResponseTicketDTO getById(String id) throws Exception {
        TicketEntity ticket = ticketDao.findById(id)
                .orElseThrow(() -> new Exception("Ticket no encontrado"));
        return convertToDTO(ticket);
    }

    @Transactional(readOnly = true)
    public ResponseTicketTasksDataDTO getTicketDataById(String id) throws Exception {
        TicketEntity ticket = ticketDao.findById(id)
                .orElseThrow(() -> new Exception("Ticket no encontrado"));
        ResponseTicketDataDTO dto = convertToTicketData(ticket);
        ResponseTicketTasksDataDTO response = new ResponseTicketTasksDataDTO();
        BeanUtils.copyProperties(dto, response);
        response.setTasks(projectTaskService.getTasksByTicketId(id));
        return response;
    }

    @Transactional(readOnly = true)
    public List<ResponseTicketDataDTO> getAllTicketsData() {
        return ticketDao.findAll()
                .stream()
                .map(this::convertToTicketData)
                .toList();
    }

    @Transactional(readOnly = true)
    public List<ResponseTicketDataDTO> getUncompletedTicketsData() {
        return ticketDao.findAllByEstadoIn(List.of(
                TicketStateEnum.CREATED,
                TicketStateEnum.IN_PROGRESS,
                TicketStateEnum.WAITING_FOR_VALIDATION))
                .map(this::convertToTicketData)
                .collect(Collectors.toList());
    }

}
