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
public class Receta {
	public Receta() {
	}
	
	private int idReceta;
	
	private int idCita;
	
	private String prescripcion;

	/**
	 * @return the idReceta
	 */
	public int getIdReceta() {
		return idReceta;
	}

	/**
	 * @param idReceta the idReceta to set
	 */
	public void setIdReceta(int idReceta) {
		this.idReceta = idReceta;
	}

	/**
	 * @return the idCita
	 */
	public int getIdCita() {
		return idCita;
	}

	/**
	 * @param idCita the idCita to set
	 */
	public void setIdCita(int idCita) {
		this.idCita = idCita;
	}

	/**
	 * @return the prescripcion
	 */
	public String getPrescripcion() {
		return prescripcion;
	}


	/**
	 * @param prescripcion the prescripcion to set
	 */
	public void setPrescripcion(String prescripcion) {
		this.prescripcion = prescripcion;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Receta [idReceta=" + idReceta + ", idCita=" + idCita + ", prescripcion=" + prescripcion + "]";
	}
	
	public Receta(int idReceta, int idCita, String prescripcion) {
		super();
		this.idReceta = idReceta;
		this.idCita = idCita;
		this.prescripcion = prescripcion;
	}
	
}
