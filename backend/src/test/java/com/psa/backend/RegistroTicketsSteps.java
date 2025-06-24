package com.psa.backend;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;

import java.time.LocalDate;
import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;

import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.util.StringUtils;

import com.psa.backend.dao.ProductVersionDAO;
import com.psa.backend.dao.TicketDAO;
import com.psa.backend.dto.RequestTicketDTO;
import com.psa.backend.dto.ResponseTicketDTO;
import com.psa.backend.enums.TicketPriorityScaleEnum;
import com.psa.backend.enums.TicketSeverityScaleEnum;
import com.psa.backend.enums.TicketStateEnum;
import com.psa.backend.model.ProductEntity;
import com.psa.backend.model.ProductVersionEntity;
import com.psa.backend.model.TicketEntity;
import com.psa.backend.services.TicketService;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;

@CucumberContextConfiguration
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
@ActiveProfiles("test")
public class RegistroTicketsSteps {
    TicketSeverityScaleEnum severity = null;
    Integer version = null;
    Integer producto = null;
    String idCliente = null;
    String idResponsable = null;
    RuntimeException exception = null;
    ResponseTicketDTO ticket;

    @MockBean
    ProductVersionDAO productVersionDao;

    @MockBean
    TicketDAO ticketDao;

    @Autowired
    TicketService ticketService;

    @Given("existe un portafolio de tickets")
    public void existeUnPortafolioDeTickets() {
        // TODO: Implementar
    }

    @Given("un problema reportado cuya severidad es de nivel {int} y se encuentra en el producto con id {int} con la version identificada con el id {int}")
    public void unProblemaParaReportarEnLaVersionIdentificadaConElIdYSeveridad(Integer severidad, Integer productoId,
            Integer versionId) {
        version = versionId;
        producto = productoId;
        Mockito.when(productVersionDao.findById(versionId.toString()))
                .thenReturn(Optional.of(ProductVersionEntity.builder().id(Long.valueOf(versionId))
                        .producto(ProductEntity.builder().id(Long.valueOf(productoId)).build()).build()));

        switch (severidad) {
            case 1:
                severity = TicketSeverityScaleEnum.LEVEL_1;
                break;
            case 2:
                severity = TicketSeverityScaleEnum.LEVEL_2;
                break;
            case 3:
                severity = TicketSeverityScaleEnum.LEVEL_3;
                break;
            case 4:
                severity = TicketSeverityScaleEnum.LEVEL_4;
                break;
            case 5:
                severity = TicketSeverityScaleEnum.LEVEL_5;
                break;
            default:
        }
    }

    @And("un cliente no identificado")
    public void unClienteNoIdentificado() {
        idCliente = null; // Cliente no identificado
    }

    @Given("un problema reportado cuya severidad es de nivel {int} y se encuentra en el producto con id {int} sin version identificada")
    public void unProblemaReportadoCuyaSeveridadEsDeNivelYSeEncuentraEnElProductoConIdSinVersionIdentificada(
            Integer severidad, Integer idProducto) {
        version = null;
        producto = idProducto;
        Mockito.when(productVersionDao.findById(any(String.class)))
                .thenReturn(Optional.empty());

        switch (severidad) {
            case 1:
                severity = TicketSeverityScaleEnum.LEVEL_1;
                break;
            case 2:
                severity = TicketSeverityScaleEnum.LEVEL_2;
                break;
            case 3:
                severity = TicketSeverityScaleEnum.LEVEL_3;
                break;
            case 4:
                severity = TicketSeverityScaleEnum.LEVEL_4;
                break;
            case 5:
                severity = TicketSeverityScaleEnum.LEVEL_5;
                break;
            default:
        }
    }

    @Given("un problema reportado cuya severidad no se estudió y se encuentra en el producto con id {int} con la version identificada con el id {int}")
    public void unProblemaReportadoCuyaSeveridadNoSeEstudioYSeEncuentraEnElProductoConIdConLaVersionIdentificadaConElId(
            Integer productoId, Integer versionId) {
        version = versionId;
        producto = productoId;
        Mockito.when(productVersionDao.findById(versionId.toString()))
                .thenReturn(Optional.of(ProductVersionEntity.builder().id(Long.valueOf(versionId))
                        .producto(ProductEntity.builder().id(Long.valueOf(productoId)).build()).build()));

        severity = null; // Severidad no estudiada
    }

    @And("un cliente identificado ID {string} que reporta el problema")
    public void unClienteIdentificadoconID(String id) {
        idCliente = id;
    }

    @And("un responsable para solucionar el problema se lo identifica con el ID {string}")
    public void unResponsableParaSolucionarElProblemaQueSeIdentificaConElId(String id) {
        idResponsable = id;
    }

    @When("el soporte solicita agregar un nuevo ticket y asigna el titulo {string}, la descripcion {string} y la prioridad {string}")
    public void soporteSolicitaAgregarTicketAsignandoTituloDescripcionYPrioridad(String titulo, String descripcion,
            String prioridad) {
        TicketPriorityScaleEnum priority = null;
        switch (prioridad.toUpperCase()) {
            case "ALTA":
                priority = TicketPriorityScaleEnum.HIGH_PRIORITY;
                break;
            case "MEDIA":
                priority = TicketPriorityScaleEnum.MEDIUM_PRIORITY;
                break;
            case "BAJA":
                priority = TicketPriorityScaleEnum.LOW_PRIORITY;
                break;
            default:
        }
        RequestTicketDTO ticketInfo = RequestTicketDTO.builder().nombre(titulo).descripcion(descripcion)
                .prioridad(priority).severidad(severity).idCliente(idCliente).idResponsable(idResponsable)
                .build();

        TicketEntity savedTicket = TicketEntity.builder().id(ThreadLocalRandom.current().nextLong())
                .nombre(titulo)
                .descripcion(descripcion).prioridad(priority)
                .severidad(severity).idCliente(idCliente).idResponsable(idResponsable)
                .estado(TicketStateEnum.CREATED)
                .fechaCreacion(LocalDate.now())
                .build();

        if (version != null) {
            savedTicket.setVersion(ProductVersionEntity.builder().id(Long.valueOf(version))
                    .producto(ProductEntity.builder().id(Long.valueOf(producto)).build()).build());
            ticketInfo.setVersion(version.toString());
        }

        Mockito.when(ticketDao.save(any(TicketEntity.class))).thenReturn(savedTicket);

        try {
            ticket = ticketService.createTicket(ticketInfo);
        } catch (RuntimeException e) {
            exception = e;
        }

    }

    @Then("se crea un ticket con identificador unico")
    public void ticketCreadoConIDUnico() {
        // Implementar
        assertNotNull(ticket.getInternalId());
    }

    @Then("se retorna un error al crear un ticket con el siguente mensaje: {string}")
    public void errorTicketCreadoConMensaje(String mensaje) {
        assertThrows(RuntimeException.class, () -> {
            if (exception != null) {
                throw exception;
            } else {
                throw new AssertionError("No se lanzó ninguna excepción");
            }
        });
        assertEquals(mensaje, exception.getMessage());
    }

    @And("el nuevo ticket no fue creado")
    public void ticketCreadoNulo() {
        assertEquals(null, ticket);
    }

    @And("el ticket creado tiene el titulo {string}")
    public void ticketCreadoConTitulo(String titulo) {
        assertEquals(titulo, ticket.getNombre());
    }

    @And("el ticket creado tiene la descripcion {string}")
    public void ticketCreadoConDescripcion(String descripcion) {
        assertEquals(descripcion, ticket.getDescripcion());
    }

    @And("el ticket creado tiene la prioridad {string}")
    public void ticketCreadoconPrioridad(String prioridad) {
        assertEquals(prioridad.toUpperCase(), ticket.getPrioridad().getLabel().toUpperCase());
    }

    @And("el ticket creado marca la severidad como {int}")
    public void ticketCreadoConSeveridad(Integer severidad) {
        assertEquals(severidad.toString(), ticket.getSeveridad().getLabel());
    }

    @And("el ticket creado esta asociado a la version con id {int} del producto con id {int}")
    public void ticketCreadoConVersion(Integer idVersion, Integer idProducto) {
        assertEquals(Long.valueOf(idVersion), ticket.getIdVersion());
        assertEquals(idProducto.toString(), ticket.getIdProducto());
    }

    @And("el ticket creado tiene como responsable al empleado con el id {string}")
    public void ticketCreadoConResponsable(String id) {
        assertEquals(id.toUpperCase(), ticket.getIdResponsable().toUpperCase());
    }

    @And("el ticket creado tiene responsable sin asignar")
    public void ticketCreadoConResponsable() {
        assertNull(ticket.getIdResponsable());
    }

    @And("el ticket creado tiene como reportador al cliente con el id {string}")
    public void ticketCreadoConCliente(String id) {
        assertEquals(id.toUpperCase(), ticket.getIdCliente().toUpperCase());
    }

    @And("el ticket creado se inicia en el estado {string}")
    public void ticketCreadoConEstado(String estado) {
        assertEquals(estado.toUpperCase(), ticket.getEstado().getLabel().toUpperCase());
    }

    @And("el ticket creado tiene la fecha de creacion")
    public void ticketCreadoConFechaCreacion() {
        assertTrue(ticket.getFechaCreacion() != null);
    }

    @When("el soporte solicita agregar un nuevo ticket y asigna el titulo {string}, la descripcion {string} sin priorizar")
    public void elSoporteSolicitaAgregarUnNuevoTicketYAsignaElTituloLaDescripcionSinPriorizar(String titulo,
            String descripcion) {
        TicketPriorityScaleEnum priority = null;
        priority = null;
        RequestTicketDTO ticketInfo = RequestTicketDTO.builder().nombre(titulo).descripcion(descripcion)
                .prioridad(priority).severidad(severity).idCliente(idCliente).idResponsable(idResponsable)
                .version(version.toString()).build();
        try {
            ticket = ticketService.createTicket(ticketInfo);
        } catch (RuntimeException e) {
            exception = e;
        }
    }

    @When("el soporte solicita agregar un nuevo ticket sin titulo pero con descripcion {string} y la prioridad {string}")
    public void elSoporteSolicitaAgregarUnNuevoTicketSinTituloPeroConDescripcionYLaPrioridad(String descripcion,
            String prioridad) {
        TicketPriorityScaleEnum priority = null;
        switch (prioridad.toUpperCase()) {
            case "ALTA":
                priority = TicketPriorityScaleEnum.HIGH_PRIORITY;
                break;
            case "MEDIA":
                priority = TicketPriorityScaleEnum.MEDIUM_PRIORITY;
                break;
            case "BAJA":
                priority = TicketPriorityScaleEnum.LOW_PRIORITY;
                break;
            default:
        }
        RequestTicketDTO ticketInfo = RequestTicketDTO.builder().nombre(null).descripcion(descripcion)
                .prioridad(priority).severidad(severity).idCliente(idCliente).idResponsable(idResponsable)
                .version(version.toString()).build();
        try {
            ticket = ticketService.createTicket(ticketInfo);
        } catch (RuntimeException e) {
            exception = e;
        }
    }

}
