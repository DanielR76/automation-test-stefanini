package com.demoaut.newtours.step_definitions;

import java.util.List;

import com.demoaut.newtours.gui.RegisterPage;
import com.demoaut.newtours.interactions.WaitElement;
import com.demoaut.newtours.models.Flight;
import com.demoaut.newtours.questions.VueloRealizado;
import com.demoaut.newtours.tasks.FlightTask;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

public class FlightStep {

	@When("^Realizo la busqueda y seleccion de vuelo$")
	public void realizoLaBusquedaYSeleccionDeVuelo(List<Flight> dato) {
		Flight.GuardarDatosDelVuelo(dato.get(0));
		OnStage.theActorInTheSpotlight().attemptsTo(WaitElement.untilAppears(RegisterPage.REGISTER_DONE),
				FlightTask.finish());		
	}

	@Then("^Se confirma la solicitud del vuelo$")
	public void seConfirmaLaSolicitudDelVuelo() {
		OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VueloRealizado.porCompleto()));

	}

}
