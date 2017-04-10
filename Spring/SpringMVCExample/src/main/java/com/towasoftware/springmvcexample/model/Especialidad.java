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
 * Licensee: License Type: Evaluation
 */
public class Especialidad {

	private int idEspecialidad;

	private String nombre;

	private int idDepartamento;

	/**
	 * @return the idEspecialidad
	 */
	public int getIdEspecialidad() {
		return idEspecialidad;
	}

	/**
	 * @param idEspecialidad the idEspecialidad to set
	 */
	public void setIdEspecialidad(int idEspecialidad) {
		this.idEspecialidad = idEspecialidad;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the idDepartamento
	 */
	public int getIdDepartamento() {
		return idDepartamento;
	}

	/**
	 * @param idDepartamento the idDepartamento to set
	 */
	public void setIdDepartamento(int idDepartamento) {
		this.idDepartamento = idDepartamento;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Especialidad [idEspecialidad=" + idEspecialidad + ", nombre=" + nombre + ", idDepartamento="
				+ idDepartamento + "]";
	}
}
