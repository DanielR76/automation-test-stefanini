package com.demoaut.newtours.tasks;

import com.demoaut.newtours.gui.FlightPage;
import com.demoaut.newtours.gui.HomePage;
import com.demoaut.newtours.gui.RegisterPage;
import com.demoaut.newtours.interactions.WaitElement;
import com.demoaut.newtours.models.Flight;
import com.demoaut.newtours.models.Usuario;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.thucydides.core.annotations.Step;

public class FlightTask implements Task {

	@Override
	@Step("{0} intenta consultar un vuelo")
	public <T extends Actor> void performAs(T actor) {

		String[] fechaInicio = Flight.LeerDatosDelVuelo(0).getFromDate().split("-");
		String[] fechaFin = Flight.LeerDatosDelVuelo(0).getReturnDate().split("-");
		String fromDay = fechaInicio[0];
		String fromMonth = fechaInicio[1];
		String toDay = fechaFin[0];
		String toMonth = fechaFin[1];

		//Primera pagina
		actor.attemptsTo(Click.on(HomePage.FLAGHTS), WaitElement.untilAppears(FlightPage.PASSENGERS));

		switch (Flight.LeerDatosDelVuelo(0).getType()) {
		case "Round Trip":
			actor.attemptsTo(Click.on(FlightPage.TYPE_ROUND_TRIP));
			break;
		case "One Way":
			actor.attemptsTo(Click.on(FlightPage.TYPE_ONE_WAY));
			break;
		default:
			break;
		}
		actor.attemptsTo(
				SelectFromOptions.byValue(Flight.LeerDatosDelVuelo(0).getPassengers()).from(FlightPage.PASSENGERS),
				SelectFromOptions.byVisibleText(Flight.LeerDatosDelVuelo(0).getDepartingFrom())
						.from(FlightPage.DEPARTING_FROM),
				SelectFromOptions.byValue(fromDay).from(FlightPage.FROM_DAY),
				SelectFromOptions.byVisibleText(fromMonth).from(FlightPage.FROM_MONTH),
				SelectFromOptions.byVisibleText(Flight.LeerDatosDelVuelo(0).getArriving()).from(FlightPage.ARRIVING),
				SelectFromOptions.byValue(toDay).from(FlightPage.TO_DAY),
				SelectFromOptions.byVisibleText(toMonth).from(FlightPage.TO_MONTH),
				SelectFromOptions.byVisibleText(Flight.LeerDatosDelVuelo(0).getAirline()).from(FlightPage.AIRLINE),
				Click.on(FlightPage.CONTINUE));

		//Segunda pagina
		actor.attemptsTo(Click.on(FlightPage.PRICE_DEPART.of(Flight.LeerDatosDelVuelo(0).getDepart())),
				Click.on(FlightPage.PRICE_RETURN.of(Flight.LeerDatosDelVuelo(0).getBack())),
				Click.on(FlightPage.CONTINUE_PRICE));
		//Tercera pagina
		actor.attemptsTo(Enter.keyValues(Usuario.LeerDatosDelUsuario(0).getFirtsName()).into(FlightPage.P_FIRST_NAME),
				Enter.keyValues(Usuario.LeerDatosDelUsuario(0).getLastName()).into(FlightPage.P_LAST_NAME),
				Enter.keyValues(Usuario.LeerDatosDelUsuario(0).getPhone()).into(FlightPage.P_NUMBER),
				Click.on(FlightPage.SECURE_PURCHASE)
		);
	}

	public static FlightTask finish() {
		return Tasks.instrumented(FlightTask.class);

	}

}
