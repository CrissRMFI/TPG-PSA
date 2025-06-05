package com.psa.backend;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class CambiarEstadoDeTicketsSteps {
    @Given("existe un ticket con estado {string}")
    public void existe_un_ticket_con_estado(String estadoInicial) {
        // TODO: Implementar
    }

    @When("el soporte cambia su estado a {string}")
    public void elSoporteCambiaSuEstadoA(String nuevoEstado) {
        // TODO: Implementar
    }

    @Then("el ticket cambia al estado {string}")
    public void elTicketCambiaAlEstado(String estadoEsperado) {
        // TODO: Implementar
    }

    @Then("el historial registra el cambio de estado")
    public void elHistorialRegistraElCambioDeEstado() {
        // TODO: Implementar
    }

    @When("el soporte intenta cambiar su estado a {string}")
    public void intentaCambiarDeEstadoA(String nuevoEstado) {
        // TODO: Implementar
    }

    @Then("se imforma un mensaje indicando que no es posible ese cambio de estado")
    public void errorIndicandoQueNoEsPosibleElCambioDeEstado() {
        // TODO: Implementar
    }

    @And("el ticket permanece en {string}")
    public void ticketPermaneceEnEstadoInicial(String estadoInicial) {
        // TODO: Implementar
    }
}
