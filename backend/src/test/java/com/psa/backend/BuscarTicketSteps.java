package com.psa.backend;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class BuscarTicketSteps {
    @Given("existen tickets registrados")
    public void existenTicketsRegistrados() {
        // TODO: Implementar
    }

    @When("el soporte busca por el nombre de cliente {string}")
    public void seRealizaUnaBusquedaPorElNombreDeCliente(String clienteBuscado) {
        // TODO: Implementar
    }

    @Then("obtiene los tickets asociados al cliente {string}")
    public void seListanSoloLosTicketsAsociadosAlCliente(String clienteEsperado) {
        // TODO: Implementar
    }

    @When("el soporte busca por estado {string}")
    public void buscaPorEstado(String estado) {
        // TODO: Implementar
    }

    @Then("obtiene los tickets con estado {string}")
    public void obtenerTicketsEnEstado(String estado) {
        // TODO: Implementar
    }

    @When("el soporte busca por prioridad {string}")
    public void buscaPorPrioridad(String prioridad) {
        // TODO: Implementar
    }

    @Then("obtiene los tickets que tienen prioridad {string}")
    public void obitienTicketsPOrPrioridad(String prioridad) {
        // TODO: Implementar
    }

    @When("el soporte busca por severidad {string}")
    public void elSoporteBuscaPorSeveridad(String severidad) {

    }

    @Then("obtiene los tickets que tienen severidad {string}")
    public void obtieneLosTicketsQueTienenSeveridad(String severidad) {
    }
}
