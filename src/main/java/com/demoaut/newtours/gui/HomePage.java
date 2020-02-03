package com.demoaut.newtours.gui;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {

	public static Target REGISTER = Target.the("Register").locatedBy("//a[contains(text(),'REGISTER')]");
	public static Target HOME = Target.the("Home").locatedBy("//a[contains(text(),'Home')]");
	public static Target FLAGHTS = Target.the("Flaghts").locatedBy("//a[contains(text(),'Flights')]");
	public static Target DATE = Target.the("Date").locatedBy("//img[@src='/images/hdr_findflight.gif']/ancestor::tr/preceding-sibling::tr[@align]/td/font");
	
	
}
