package com.demoaut.newtours.gui;

import net.serenitybdd.screenplay.targets.Target;

public class FlightPage {

	public static Target TYPE_ROUND_TRIP = Target.the("Type").locatedBy("//input[@value='roundtrip']");
	public static Target TYPE_ONE_WAY = Target.the("Type").locatedBy("//input[@value='oneway']");
	public static Target PASSENGERS = Target.the("Passengers").locatedBy("//select[@name='passCount']");
	public static Target DEPARTING_FROM = Target.the("Departing from").locatedBy("//select[@name='fromPort']");
	public static Target FROM_DAY = Target.the("From day").locatedBy("//select[@name='fromDay']");
	public static Target FROM_MONTH = Target.the("From month").locatedBy("//select[@name='fromMonth']");
	public static Target ARRIVING = Target.the("Arriving").locatedBy("//select[@name='toPort']");
	public static Target TO_DAY = Target.the("To Day").locatedBy("//select[@name='toDay']");
	public static Target TO_MONTH = Target.the("To Month").locatedBy("//select[@name='toMonth']");
	public static Target SERVICE_CLASS = Target.the("Service class").locatedBy("");
	public static Target AIRLINE = Target.the("Airline").locatedBy("//select[@name='airline']");
	public static Target CONTINUE = Target.the("Continue").locatedBy("//input[@name='findFlights']");
	public static Target PRICE_DEPART = Target.the("Depart").locatedBy("//table[@cellspacing='1'][1]//b[contains(text(),'{0}')]/preceding::tr[1]/td/input");
	public static Target PRICE_RETURN = Target.the("Return").locatedBy("//table[@cellspacing='1'][2]//b[contains(text(),'{0}')]/preceding::tr[1]/td/input");
	public static Target CONTINUE_PRICE = Target.the("Continue price").locatedBy("//input[@name='reserveFlights']");
	public static Target SECURE_PURCHASE = Target.the("Secure purchase").locatedBy("//input[@name='buyFlights']");
	public static Target P_FIRST_NAME = Target.the("First name").locatedBy("//input[@name='passFirst0']");
	public static Target P_LAST_NAME = Target.the("Last name").locatedBy("//input[@name='passLast0']");
	public static Target P_NUMBER = Target.the("Number").locatedBy("//input[@name='creditnumber']");
	public static Target SUCCESSFULY = Target.the("Successfully").locatedBy("//font[contains(text(),'Your ')]");
	public static Target BACK_HOME = Target.the("Back_Home").locatedBy("//img[@src='/images/forms/home.gif']");

}
