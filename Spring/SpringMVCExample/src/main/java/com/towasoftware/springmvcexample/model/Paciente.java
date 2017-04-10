package com.towasoftware.springmvcexample.model;

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
public class Paciente {
	
	
	private int idPaciente;
	
	private String nombre;
	
	private String apellido;
	
	private String direccion;
	
	private String telefono;
	
	private String email;
	
	private String tipoSangre;
	
	private String alergias;
	
	private String NSS;
	
	private String sexo;
	
	private java.sql.Date fechaNacimiento;

	public Paciente(){};
	
	public Paciente(int idPaciente, String nombre, String apellido, String direccion, String telefono, String email,
			String tipoSangre, String alergias, String nSS, String sexo, Date fechaNacimiento) {
		super();
		this.idPaciente = idPaciente;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.telefono = telefono;
		this.email = email;
		this.tipoSangre = tipoSangre;
		this.alergias = alergias;
		NSS = nSS;
		this.sexo = sexo;
		this.fechaNacimiento = fechaNacimiento;
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
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the tipoSangre
	 */
	public String getTipoSangre() {
		return tipoSangre;
	}

	/**
	 * @param tipoSangre the tipoSangre to set
	 */
	public void setTipoSangre(String tipoSangre) {
		this.tipoSangre = tipoSangre;
	}

	/**
	 * @return the alergias
	 */
	public String getAlergias() {
		return alergias;
	}

	/**
	 * @param alergias the alergias to set
	 */
	public void setAlergias(String alergias) {
		this.alergias = alergias;
	}

	/**
	 * @return the nSS
	 */
	public String getNSS() {
		return NSS;
	}

	/**
	 * @param nSS the nSS to set
	 */
	public void setNSS(String nSS) {
		NSS = nSS;
	}

	/**
	 * @return the sexo
	 */
	public String getSexo() {
		return sexo;
	}

	/**
	 * @param sexo the sexo to set
	 */
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	/**
	 * @return the fechaNacimiento
	 */
	public java.sql.Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	/**
	 * @param fechaNacimiento the fechaNacimiento to set
	 */
	public void setFechaNacimiento(java.sql.Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Paciente [idPaciente=" + idPaciente + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion="
				+ direccion + ", telefono=" + telefono + ", email=" + email + ", tipoSangre=" + tipoSangre
				+ ", alergias=" + alergias + ", NSS=" + NSS + ", sexo=" + sexo + ", fechaNacimiento=" + fechaNacimiento
				+ "]";
	}
	
	
	
}
