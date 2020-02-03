package com.demoaut.newtours.tasks;

import com.demoaut.newtours.gui.RegisterPage;
import com.demoaut.newtours.interactions.WaitElement;
import com.demoaut.newtours.models.Usuario;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.thucydides.core.annotations.Step;

public class RegisterTask implements Task {

	Usuario user = new Usuario();
	
	@Override
	@Step("{0} intenta registrarse en la página")
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(WaitElement.untilAppears(RegisterPage.CONTACT_FIRTS_NAME),
				Enter.theValue(Usuario.LeerDatosDelUsuario(0).getFirtsName()).into(RegisterPage.CONTACT_FIRTS_NAME),				
				Enter.theValue(Usuario.LeerDatosDelUsuario(0).getLastName()).into(RegisterPage.CONTACT_LAST_NAME),
				Enter.theValue(Usuario.LeerDatosDelUsuario(0).getPhone()).into(RegisterPage.CONTACT_PHONE),
				Enter.theValue(Usuario.LeerDatosDelUsuario(0).getEmail()).into(RegisterPage.CONTACT_EMAIL),
				Enter.theValue(Usuario.LeerDatosDelUsuario(0).getAddress()).into(RegisterPage.ADDRESS),
				Enter.theValue(Usuario.LeerDatosDelUsuario(0).getCity()).into(RegisterPage.CITY),
				Enter.theValue(Usuario.LeerDatosDelUsuario(0).getStateProvince()).into(RegisterPage.STATE_PROVINCE),
				Enter.theValue(Usuario.LeerDatosDelUsuario(0).getPostalCode()).into(RegisterPage.POSTAL_CODE),
				SelectFromOptions.byVisibleText(Usuario.LeerDatosDelUsuario(0).getCountry() + " ").from(RegisterPage.COUNTRY),
				Enter.theValue(Usuario.LeerDatosDelUsuario(0).getUserName()).into(RegisterPage.USER_NAME),
				Enter.theValue(Usuario.LeerDatosDelUsuario(0).getPass()).into(RegisterPage.PASSWORD),
				Enter.theValue(Usuario.LeerDatosDelUsuario(0).getConfirmPass()).into(RegisterPage.CONFIRM_PASSWORD),
				Click.on(RegisterPage.SUBMIT), WaitElement.untilAppears(RegisterPage.REGISTER_DONE)
				
				);
	}

	public static RegisterTask exitoso() {
		return Tasks.instrumented(RegisterTask.class);

	}

}
