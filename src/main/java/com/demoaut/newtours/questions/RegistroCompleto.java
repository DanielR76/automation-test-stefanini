package com.demoaut.newtours.questions;

import com.demoaut.newtours.gui.RegisterPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class RegistroCompleto implements Question<Boolean> {

	@Override
	public Boolean answeredBy(Actor actor) {

		if (RegisterPage.REGISTER_DONE.resolveFor(actor)
				.getText().contentEquals("Thank you for registering. You may now sign-in using the user name and password you've just entered.")) {
			System.out.println(RegisterPage.REGISTER_NAME.resolveFor(actor).getText());
			return true;
		} else {
			System.out.println("No apareció exitoso");
			return false;
		}
	}

	public static RegistroCompleto correcto() {
		return new RegistroCompleto();

	}

}
