package com.demoaut.newtours.step_definitions;

import com.demoaut.newtours.questions.RegistroCompleto;

import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

public class RegisterStep {

	@Then("^Se visualiza el estado del registro$")
	public void seVisualizaElEstadoDelRegistro() {
		OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(RegistroCompleto.correcto()));
	}

}
