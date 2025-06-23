package com.psa.backend;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;
import io.cucumber.java.en.Then;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Optional;

import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.psa.backend.dao.ProductVersionDAO;
import com.psa.backend.dto.RequestTicketDTO;
import com.psa.backend.enums.TicketPriorityScaleEnum;
import com.psa.backend.enums.TicketSeverityScaleEnum;
import com.psa.backend.model.ProductVersionEntity;
import com.psa.backend.model.TicketEntity;
import com.psa.backend.services.TicketService;

import io.cucumber.java.en.And;

@CucumberContextConfiguration
@SpringBootTest
public class RegistroTicketsSteps {
    TicketSeverityScaleEnum severity = null;
    String version = null;
    String idCliente = null;
    String idResponsable = null;
    TicketEntity ticket = null;

    @MockBean
    ProductVersionDAO productVersionDao;

    @Autowired
    TicketService ticketService;

    

    @Given("existe un portafolio de tickets")
    public void existeUnPortafolioDeTickets() {
        // TODO: Implementar
    }

    @Given("un problema reportado en la version identificada con el id {string} cuya severidad es de nivel {int}")
    public void unProblemaParaReportarEnLaVersionIdentificadaConElIdYSeveridad(String id, Integer severidad) {
        version = id;
        Mockito.when(productVersionDao.findById(id)).thenReturn(Optional.of(ProductVersionEntity.builder().id(Long.valueOf(id)).build()));

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

    @And("un cliente identificado ID {string} que reporta el problema")
    public void unClienteIdentificadoconID(String id) {
        idCliente = id;
    }

    @And("un responsable para solucionar el problema se lo identifica con el ID {string}")
    public void unResponsableParaSolucionarElProblemaQueSeIdentificaConElId(String id) {
        idResponsable = id;
    }

    @When("el soporte solicita agregar un nuevo ticket y asigna el titulo {string}, la descripcion {string} y la prioridad {string}")
    public void soporteSolicitaAgregarTicketAsignandoTituloDescripcionYPrioridad(String titulo, String descripcion, String prioridad) {
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
        RequestTicketDTO ticketInfo = RequestTicketDTO.builder().nombre(titulo).descripcion(descripcion).prioridad(priority).severidad(severity).idCliente(idCliente).idResponsable(idResponsable).version(version).build();

        ticket = ticketService.convertToCreateEntity(ticketInfo);
    }

    @Then("se crea un ticket con identificador unico")
    public void ticketCreadoConIDUnico() {
        //Implementar
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

    @And("el ticket creado esta asociado a la version con id {string}")
    public void ticketCreadoConVersion(String id) {
        assertEquals(id.toUpperCase(), ticket.getVersion().getId().toString());
    }

    @And("el ticket creado tiene como responsable al empleado con el id {string}")
    public void ticketCreadoConResponsable(String id) {
        assertEquals(id.toUpperCase(), ticket.getIdResponsable().toUpperCase());
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
    /*
     * @Given("un cliente reporta un problema en un producto y modulo funcional")
     * public void unClienteReportaUnProblemaEnUnProductoYModuloFuncional() {
     * // TODO: Implementar
     * }
     * 
     * @When("el soporte solicita agregar un nuevo ticket")
     * public void elSoporteSolicitaAgregarUnNuevoTicket() {
     * // TODO: Implementar
     * }
     * 
     * @Then("se genera un ticket con identificador unico, titulo, version, cliente, modulo funcional, prioridad y severidad"
     * )
     * public void seGeneranLosDatosCompletosDelTicket() {
     * // TODO: Implementar
     * }
     * 
     * @Then("se agrega al portafolio")
     * public void seAgregaAlPortafolio() {
     * // TODO: Implementar
     * }
     * 
     * @Then("inicia en estado {string}")
     * public void iniciaEnEstado(String estadoEsperado) {
     * // TODO: Implementar
     * }
     * 
     * @And("el ticket debe tener registrada la fecha de creacion")
     * public void seRegistraFechaDeCreacionActual() {
     * // TODO: Acá hardcodear la fecha actual, creo que con un LocalDate.now()
     * // no pasan las pruebas. Ver después...
     * }
     * 
     * @When("el soporte intenta registrar un ticket sin especificar el cliente")
     * public void registrarTicketSinEspecificarCliente() {
     * // TODO: Implementar
     * }
     * 
     * @Then("el ticket no se registra")
     * public void elTicketNoSeRegistra() {
     * // TODO: Implementar
     * }
     * 
     * @And("se informa un mensaje indicando que el cliente es obligatorio")
     * public void errorClienteObligatorio() {
     * // TODO: Implementar
     * }
     * 
     * @When("el soporte intenta registrar un ticket sin descripcion del incidente")
     * public void intentaRegistrarUnTicketSinDescripcionDelIncidente() {
     * // TODO: Implementar
     * }
     * 
     * @Then("se informa un mensaje indicando que la descripcion del incidente es obligatoria"
     * )
     * public void errorDescripcionOblitaria() {
     * // TODO: Implementar
     * }
     * 
     * @When("el soporte solicita agregar un nuevo ticket con severidad {string}")
     * public void registrarTicketSinEspecificarSeveridad(String severidad) {
     * // TODO: Implementar
     * }
     * 
     * @And("se informa un mensaje indicando que la severidad debe estar entre 1 y 5"
     * )
     * public void errorSeveridadFueraDeRango() {
     * // TODO: Implementar
     * }
     * 
     * @When("el soporte intenta registrar un ticket sin modulo funcional")
     * public void intentaRegistrarUnTicketSinModuloFuncional() {
     * // TODO: Implementar
     * }
     * 
     * @And("se informa un mensaje indicando que el modulo funcional es obligatorio"
     * )
     * public void errorModuloFuncionalObligatorio() {
     * // TODO: Implementar
     * }
     * 
     * @When("el soporte selecciona un modulo funcional que no pertenece al producto"
     * )
     * public void
     * registrarTicketParaUnProductoConModuloFuncionalNoCorrespondiente() {
     * // TODO: Implementar
     * }
     * 
     * @And("se informa un mensaje indicando que el modulo funcional no corresponde al producto seleccionado"
     * )
     * public void errorModuloFuncionalNoCorresponde() {
     * // TODO: Implementar
     * }
     * 
     * @When("el soporte intenta registrar un ticket sin version")
     * public void intentaRegistrarUnTicketSinVersion() {
     * // TODO: Implementar
     * }
     * 
     * @And("se informa un mensaje indicando que la version es obligatoria")
     * public void errorVersionObligatoria() {
     * // TODO: Implementar
     * }
     */
    }
