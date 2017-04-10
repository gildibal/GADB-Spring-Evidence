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
public class Consultorio {
	public Consultorio() {
	}
	
	
	private int idConsultorio;
	
	private int piso;

	/**
	 * @return the idConsultorio
	 */
	public int getIdConsultorio() {
		return idConsultorio;
	}

	/**
	 * @param idConsultorio the idConsultorio to set
	 */
	public void setIdConsultorio(int idConsultorio) {
		this.idConsultorio = idConsultorio;
	}

	/**
	 * @return the piso
	 */
	public int getPiso() {
		return piso;
	}

	/**
	 * @param piso the piso to set
	 */
	public void setPiso(int piso) {
		this.piso = piso;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Consultorio [idConsultorio=" + idConsultorio + ", piso=" + piso + "]";
	}

	public Consultorio(int idConsultorio, int piso) {
		super();
		this.idConsultorio = idConsultorio;
		this.piso = piso;
	}
	
	
	
}
