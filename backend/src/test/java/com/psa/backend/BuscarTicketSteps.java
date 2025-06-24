package com.psa.backend;

import com.psa.backend.dto.ResponseTicketDTO;
import com.psa.backend.enums.TicketPriorityScaleEnum;
import com.psa.backend.enums.TicketSeverityScaleEnum;
import com.psa.backend.enums.TicketStateEnum;
import com.psa.backend.services.mocks.MockTicketFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Before;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BuscarTicketSteps {

    private List<ResponseTicketDTO> ticketsMockeados;
    private List<ResponseTicketDTO> resultadosBusqueda;

    @Given("existen tickets registrados")
    public void existenTicketsRegistrados() {
        ticketsMockeados = MockTicketFactory.crearTicketsDeEjemplo();
    }

    @When("el soporte busca por el nombre de cliente {string}")
    public void seRealizaUnaBusquedaPorElNombreDeCliente(String clienteBuscado) {
        resultadosBusqueda = ticketsMockeados.stream()
                .filter(ticket -> ticket.getIdCliente().equalsIgnoreCase(clienteBuscado))
                .collect(Collectors.toList());
    }

    @Then("obtiene los tickets asociados al cliente {string}")
    public void seListanSoloLosTicketsAsociadosAlCliente(String clienteEsperado) {
        boolean todosCoinciden = resultadosBusqueda.stream()
                .allMatch(ticket -> ticket.getIdCliente().equalsIgnoreCase(clienteEsperado));

        assertEquals(true, todosCoinciden, "Hay tickets que no pertenecen al cliente esperado.");
    }

    @When("el soporte busca por estado {string}")
    public void buscaPorEstado(String estado) {
        TicketStateEnum estadoEnum = TicketStateEnum.valueOf(estado.toUpperCase(Locale.ROOT));
        resultadosBusqueda = ticketsMockeados.stream()
                .filter(ticket -> ticket.getEstado().equals(estadoEnum))
                .collect(Collectors.toList());
    }

    @Then("obtiene los tickets con estado {string}")
    public void obtenerTicketsEnEstado(String estado) {
        TicketStateEnum estadoEnum = TicketStateEnum.valueOf(estado.toUpperCase(Locale.ROOT));
        boolean todosCoinciden = resultadosBusqueda.stream()
                .allMatch(ticket -> ticket.getEstado().equals(estadoEnum));

        assertEquals(true, todosCoinciden, "Hay tickets que no tienen el estado esperado.");
    }

    @When("el soporte busca por prioridad {string}")
    public void buscaPorPrioridad(String prioridad) {
        TicketPriorityScaleEnum prioridadEnum = TicketPriorityScaleEnum.valueOf(prioridad.toUpperCase(Locale.ROOT));
        resultadosBusqueda = ticketsMockeados.stream()
                .filter(ticket -> ticket.getPrioridad().equals(prioridadEnum))
                .collect(Collectors.toList());
    }

    @Then("obtiene los tickets que tienen prioridad {string}")
    public void obitienTicketsPOrPrioridad(String prioridad) {
        TicketPriorityScaleEnum prioridadEnum = TicketPriorityScaleEnum.valueOf(prioridad.toUpperCase(Locale.ROOT));
        boolean todosCoinciden = resultadosBusqueda.stream()
                .allMatch(ticket -> ticket.getPrioridad().equals(prioridadEnum));

        assertEquals(true, todosCoinciden, "Hay tickets que no tienen la prioridad esperada.");
    }

    @When("el soporte busca por severidad {string}")
    public void elSoporteBuscaPorSeveridad(String severidad) {
        TicketSeverityScaleEnum severidadEnum = TicketSeverityScaleEnum.valueOf(severidad.toUpperCase(Locale.ROOT));
        resultadosBusqueda = ticketsMockeados.stream()
                .filter(ticket -> ticket.getSeveridad().equals(severidadEnum))
                .collect(Collectors.toList());
    }

    @Then("obtiene los tickets que tienen severidad {string}")
    public void obtieneLosTicketsQueTienenSeveridad(String severidad) {
        TicketSeverityScaleEnum severidadEnum = TicketSeverityScaleEnum.valueOf(severidad.toUpperCase(Locale.ROOT));
        boolean todosCoinciden = resultadosBusqueda.stream()
                .allMatch(ticket -> ticket.getSeveridad().equals(severidadEnum));

        assertEquals(true, todosCoinciden, "Hay tickets que no tienen la severidad esperada.");
    }
}
