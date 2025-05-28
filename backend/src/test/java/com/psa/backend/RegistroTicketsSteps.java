package com.psa.backend;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;


public class RegistroTicketsSteps {

    @Given("existe un portafolio de tickets")
    public void existeUnPortafolioDeTickets() {
        // TODO: Implementar
    }

    @Given("un cliente reporta un problema en un producto y modulo funcional")
    public void unClienteReportaUnProblemaEnUnProductoYModuloFuncional() {
        // TODO: Implementar
    }

    @When("el soporte solicita agregar un nuevo ticket")
    public void elSoporteSolicitaAgregarUnNuevoTicket() {
        // TODO: Implementar
    }

    @Then("se genera un ticket con identificador unico, titulo, version, cliente, modulo funcional, prioridad y severidad")
    public void seGeneranLosDatosCompletosDelTicket() {
        // TODO: Implementar
    }

    @Then("se agrega al portafolio")
    public void seAgregaAlPortafolio() {
        // TODO: Implementar
    }

    @Then("inicia en estado {string}")
    public void iniciaEnEstado(String estadoEsperado) {
        // TODO: Implementar
    }

    @And("el ticket debe tener registrada la fecha de creacion")
    public void seRegistraFechaDeCreacionActual() {
        // TODO: Acá hardcodear la fecha actual, creo que con un LocalDate.now()
        // no pasan las pruebas. Ver después...
    }

    @When("el soporte intenta registrar un ticket sin especificar el cliente")
    public void registrarTicketSinEspecificarCliente() {
        // TODO: Implementar
    }
    @Then("el ticket no se registra")
    public void elTicketNoSeRegistra() {
        // TODO: Implementar
    }

    @And("se informa un mensaje indicando que el cliente es obligatorio")
    public void errorClienteObligatorio() {
        // TODO: Implementar
    }

    @When("el soporte intenta registrar un ticket sin descripcion del incidente")
    public void intentaRegistrarUnTicketSinDescripcionDelIncidente() {
        // TODO: Implementar
    }

    @Then("se informa un mensaje indicando que la descripcion del incidente es obligatoria")
    public void errorDescripcionOblitaria() {
        // TODO: Implementar
    }

    @When("el soporte solicita agregar un nuevo ticket con severidad {string}")
    public void registrarTicketSinEspecificarSeveridad(String severidad) {
        // TODO: Implementar
    }

    @And("se informa un mensaje indicando que la severidad debe estar entre 1 y 5")
    public void errorSeveridadFueraDeRango() {
        // TODO: Implementar
    }

    @When("el soporte intenta registrar un ticket sin modulo funcional")
    public void intentaRegistrarUnTicketSinModuloFuncional() {
        // TODO: Implementar
    }

    @And("se informa un mensaje indicando que el modulo funcional es obligatorio")
    public void errorModuloFuncionalObligatorio() {
        // TODO: Implementar
    }

    @When("el soporte selecciona un modulo funcional que no pertenece al producto")
    public void registrarTicketParaUnProductoConModuloFuncionalNoCorrespondiente() {
        // TODO: Implementar
    }

    @And("se informa un mensaje indicando que el modulo funcional no corresponde al producto seleccionado")
    public void errorModuloFuncionalNoCorresponde() {
        // TODO: Implementar
    }

    @When("el soporte intenta registrar un ticket sin version")
    public void intentaRegistrarUnTicketSinVersion() {
        // TODO: Implementar
    }

    @And("se informa un mensaje indicando que la version es obligatoria")
    public void errorVersionObligatoria() {
        // TODO: Implementar
    }
}
