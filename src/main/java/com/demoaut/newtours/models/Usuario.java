package com.demoaut.newtours.models;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

	private String firtsName, lastName, phone, email, address, city, stateProvince, postalCode, country, userName, pass,
			confirmPass;

	public static List<Usuario> users = new ArrayList<>();

	public static void GuardarDatosDelUsuario(Usuario user) {
		users.add(user);
	}

	public static Usuario LeerDatosDelUsuario(int index) {
		return users.get(index);
	}

	public static void vaciarListaUsuarios() {
		users = new ArrayList<>();
	}
	
	public String getFirtsName() {
		return firtsName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getPhone() {
		return phone;
	}

	public String getEmail() {
		return email;
	}

	public String getAddress() {
		return address;
	}

	public String getCity() {
		return city;
	}

	public String getStateProvince() {
		return stateProvince;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public String getCountry() {
		return country;
	}

	public String getUserName() {
		return userName;
	}

	public String getPass() {
		return pass;
	}

	public String getConfirmPass() {
		return confirmPass;
	}

	
}
