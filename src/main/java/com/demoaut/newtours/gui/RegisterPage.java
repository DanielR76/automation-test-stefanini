package com.demoaut.newtours.gui;

import net.serenitybdd.screenplay.targets.Target;

public class RegisterPage {

	public static Target CONTACT_FIRTS_NAME = Target.the("First Name").locatedBy("//input[@name='firstName']");
	public static Target CONTACT_LAST_NAME = Target.the("Last Name").locatedBy("//input[@name='lastName']");
	public static Target CONTACT_PHONE = Target.the("Phone").locatedBy("//input[@name='phone']");
	public static Target CONTACT_EMAIL = Target.the("Email").locatedBy("//input[@id='userName']");
	public static Target ADDRESS = Target.the("Address").locatedBy("//input[@name='address1']");
	public static Target CITY = Target.the("City").locatedBy("//input[@name='city']");
	public static Target STATE_PROVINCE = Target.the("State/Province").locatedBy("//input[@name='state']");
	public static Target POSTAL_CODE = Target.the("Postal Code").locatedBy("//input[@name='postalCode']");
	public static Target COUNTRY = Target.the("Country").locatedBy("//select[@name='country']");
	public static Target USER_NAME = Target.the("User Name").locatedBy("//input[@id='email']");
	public static Target PASSWORD = Target.the("Password").locatedBy("//input[@name='password']");
	public static Target CONFIRM_PASSWORD = Target.the("Confirm Password").locatedBy("//input[@name='confirmPassword']");
	public static Target SUBMIT = Target.the("Confirm Password").locatedBy("//input[@name='register']");
	public static Target REGISTER_DONE = Target.the("Register Done").locatedBy("//font[contains(text(),'Thank you for registering.')]");
	public static Target REGISTER_NAME = Target.the("Note").locatedBy("//b[contains(text(),'Note: Your user name is')]");
	
	//Thank you for registering. You may now sign-in using the user name and password you've just entered
}
