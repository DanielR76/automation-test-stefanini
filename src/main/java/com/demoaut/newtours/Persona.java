package com.demoaut.newtours;

public class Persona {

	int cedula;
	String nombre, apellido, edad, movil;

//	public Persona(int cedula, String nombre, String apellido, String edad, String m�vil) {
//		this.cedula = cedula;
//		this.nombre = nombre;
//		this.apellido = apellido;
//		this.edad = edad;
//		this.m�vil = m�vil;
//	}

	public int getCedula() {
		return cedula;
	}

	public void setCedula(int cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getMovil() {
		return movil;
	}

	public void setMovil(String movil) {
		this.movil = movil;
	}

}
