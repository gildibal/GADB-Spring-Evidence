package com.towasoftware.springmvcexample.model;

import java.sql.Time;
import java.sql.Date;

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
public class Cita {
	
	
	
	private int idCita;
	
	private java.sql.Date fecha;
	
	private java.sql.Time hora;
	
	private int idPaciente;
	
	private int idMedico;
	
	private int idConsultorio;
	
	private String presion;
	
	private Float peso;
	
	private Float talla;
	
	private Float temperatura;
	
	private String diagnostico;
	
	private String observacion;
	
	
	public Cita(){};

	public Cita(int idCita, Date fecha, Time hora, int idPaciente, int idMedico, int idConsultorio, String presion,
			Float peso, Float talla, Float temperatura, String diagnostico, String observacion) {
		super();
		this.idCita = idCita;
		this.fecha = fecha;
		this.hora = hora;
		this.idPaciente = idPaciente;
		this.idMedico = idMedico;
		this.idConsultorio = idConsultorio;
		this.presion = presion;
		this.peso = peso;
		this.talla = talla;
		this.temperatura = temperatura;
		this.diagnostico = diagnostico;
		this.observacion = observacion;
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
	 * @return the fecha
	 */
	public java.sql.Date getFecha() {
		return fecha;
	}

	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(java.sql.Date fecha) {
		this.fecha = fecha;
	}

	/**
	 * @return the hora
	 */
	public java.sql.Time getHora() {
		return hora;
	}

	/**
	 * @param hora the hora to set
	 */
	public void setHora(java.sql.Time hora) {
		this.hora = hora;
	}

	/**
	 * @return the idPaciente
	 */
	public int getIdPaciente() {
		return idPaciente;
	}

	/**
	 * @param idPaciente the idPaciente to set
	 */
	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}

	/**
	 * @return the idMedico
	 */
	public int getIdMedico() {
		return idMedico;
	}

	/**
	 * @param idMedico the idMedico to set
	 */
	public void setIdMedico(int idMedico) {
		this.idMedico = idMedico;
	}

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
	 * @return the presion
	 */
	public String getPresion() {
		return presion;
	}

	/**
	 * @param presion the presion to set
	 */
	public void setPresion(String presion) {
		this.presion = presion;
	}

	/**
	 * @return the peso
	 */
	public Float getPeso() {
		return peso;
	}

	/**
	 * @param peso the peso to set
	 */
	public void setPeso(Float peso) {
		this.peso = peso;
	}

	/**
	 * @return the talla
	 */
	public Float getTalla() {
		return talla;
	}

	/**
	 * @param talla the talla to set
	 */
	public void setTalla(Float talla) {
		this.talla = talla;
	}

	/**
	 * @return the temperatura
	 */
	public Float getTemperatura() {
		return temperatura;
	}

	/**
	 * @param temperatura the temperatura to set
	 */
	public void setTemperatura(Float temperatura) {
		this.temperatura = temperatura;
	}

	/**
	 * @return the diagnostico
	 */
	public String getDiagnostico() {
		return diagnostico;
	}

	/**
	 * @param diagnostico the diagnostico to set
	 */
	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	/**
	 * @return the observacion
	 */
	public String getObservacion() {
		return observacion;
	}

	/**
	 * @param observacion the observacion to set
	 */
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Cita [idCita=" + idCita + ", fecha=" + fecha + ", hora=" + hora + ", idPaciente=" + idPaciente
				+ ", idMedico=" + idMedico + ", idConsultorio=" + idConsultorio + ", presion=" + presion + ", peso="
				+ peso + ", talla=" + talla + ", temperatura=" + temperatura + ", diagnostico=" + diagnostico
				+ ", observacion=" + observacion + "]";
	}

	
	
	}
