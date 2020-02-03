package com.demoaut.newtours.models;

import java.util.ArrayList;
import java.util.List;

public class Flight {

	private String fechaPage, fechaSystem;
	private String type, passengers, departingFrom, fromDate, arriving, returnDate, serviceClass, airline, depart, back;

	public Flight(String fechaPage, String fechaSystem) {
		this.fechaPage = fechaPage;
		this.fechaSystem = fechaSystem;
	}

	public static List<Flight> flights = new ArrayList<>();

	public static void GuardarDatosDelVuelo(Flight flight) {
		flights.add(flight);
	}

	public static Flight LeerDatosDelVuelo(int index) {
		return flights.get(index);
	}

	public static void vaciarListaVuelos() {
		flights = new ArrayList<>();
	}

	public String getFechaPage() {
		return fechaPage;
	}

	public void setFechaPage(String fechaPage) {
		this.fechaPage = fechaPage;
	}

	public String getFechaSystem() {
		return fechaSystem;
	}
	
	public void setFechaSystem(String fechaSystem) {
		this.fechaSystem = fechaSystem;
	}
	
	public String getType() {
		return type;
	}

	public String getPassengers() {
		return passengers;
	}

	public String getDepartingFrom() {
		return departingFrom;
	}

	public String getFromDate() {
		return fromDate;
	}

	public String getArriving() {
		return arriving;
	}

	public String getReturnDate() {
		return returnDate;
	}

	public String getServiceClass() {
		return serviceClass;
	}

	public String getAirline() {
		return airline;
	}

	public String getDepart() {
		return depart;
	}

	public String getBack() {
		return back;
	}
}
