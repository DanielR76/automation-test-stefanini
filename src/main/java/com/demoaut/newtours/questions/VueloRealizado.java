package com.demoaut.newtours.questions;

import com.demoaut.newtours.gui.FlightPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class VueloRealizado implements Question<Boolean> {

	@Override
	public Boolean answeredBy(Actor actor) {

		String completado = FlightPage.SUCCESSFULY.resolveFor(actor).getText();
		if (completado.equals("Your itinerary has been booked!")) {
			return true;
		} else {
			return false;
		}
	}

	public static VueloRealizado porCompleto() {
		return new VueloRealizado();
	}

}
