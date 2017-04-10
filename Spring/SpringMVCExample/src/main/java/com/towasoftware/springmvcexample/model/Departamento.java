package com.towasoftware.springmvcexample.model;

/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: 
 * License Type: Evaluation
 */
public class Departamento {
	
	private String nombre;
	
	private int idDepartamento;
	
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setIdDepartamento(int value) {
		this.idDepartamento = value;
	}
	
	public int getIdDepartamento() {
		return idDepartamento;
	}
	
	
	

	/* Departamento
	 * Muestra los atributos del bean Departamento en forma de String
	 */
	@Override
	public String toString() {
		return "Departamento [nombre=" + nombre + ", idDepartamento=" + idDepartamento + "]";
	}

	
	

}
