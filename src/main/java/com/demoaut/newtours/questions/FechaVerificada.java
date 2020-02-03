package com.demoaut.newtours.questions;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.demoaut.newtours.gui.HomePage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class FechaVerificada implements Question<Boolean> {

	Date date = new Date();
	SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
	String fechaSystemD = formatter.format(date);

	@Override
	public Boolean answeredBy(Actor actor) {

		String fechaPageD = HomePage.DATE.resolveFor(actor).getText();
		String[] fechaPagina = fechaPageD.split("[ ,]");

		switch (fechaPagina[0].toUpperCase()) {
		case "JAN":
			fechaPagina[0] = "01";
			break;
		case "FEB":
			fechaPagina[0] = "02";
			break;
		case "MAR":
			fechaPagina[0] = "03";
			break;
		case "APR":
			fechaPagina[0] = "04";
			break;
		case "MAY":
			fechaPagina[0] = "05";
			break;
		case "JUN":
			fechaPagina[0] = "06";
			break;
		case "JUL":
			fechaPagina[0] = "07";
			break;
		case "AUG":
			fechaPagina[0] = "08";
			break;
		case "SEP":
			fechaPagina[0] = "09";
			break;
		case "OCT":
			fechaPagina[0] = "10";
			break;
		case "NOV":
			fechaPagina[0] = "11";
			break;
		case "DEC":
			fechaPagina[0] = "12";
			break;
		default:
			break;
		}
		
		fechaPageD = fechaPagina[0] + "/" + fechaPagina[1] + "/" + fechaPagina[3];
		if (fechaPageD.contentEquals(fechaSystemD) ) {
			return true;
		} else {
			return false;
		}
	}

	public static FechaVerificada completa() {
		return new FechaVerificada();
	}

}
