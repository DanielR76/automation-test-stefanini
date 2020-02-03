package com.demoaut.newtours;

public class Empresa {

	String nombre, ciudad, numEmpleado, anoFundacion;
	int nit;
	public Empresa(String nombre, String ciudad, String numEmpleado, String anoFundacion, int nit) {
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.numEmpleado = numEmpleado;
		this.anoFundacion = anoFundacion;
		this.nit = nit;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getNumEmpleado() {
		return numEmpleado;
	}
	public void setNumEmpleado(String numEmpleado) {
		this.numEmpleado = numEmpleado;
	}
	public String getAnoFundacion() {
		return anoFundacion;
	}
	public void setAnoFundacion(String anoFundacion) {
		this.anoFundacion = anoFundacion;
	}
	public int getNit() {
		return nit;
	}
	public void setNit(int nit) {
		this.nit = nit;
	}
	
	public void verPersona() {
		Persona per = new Persona();

	}
	
	
}
