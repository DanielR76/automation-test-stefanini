package com.demoaut.newtours.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.thucydides.core.annotations.Step;

public class DateTask implements Task {

	@Override
	@Step("{0} verificar la fecha")
	public <T extends Actor> void performAs(T actor) {
		
		

	}

	public static DateTask visible() {
		return Tasks.instrumented(DateTask.class);

	}

}
