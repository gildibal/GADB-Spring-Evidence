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
public class Medico {
	public Medico() {
	}
	
	private int idMedico;
	
	private String nombre;
	
	private String apellido;
	
	private int idEspecialidad;
	
	private String telefono;
	
	private String correo;
	
	private String direccion;
	
	private String cedulaProfesional;
	
	private String horario;

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
	 * @return the correo
	 */
	public String getCorreo() {
		return correo;
	}

	/**
	 * @param correo the correo to set
	 */
	public void setCorreo(String correo) {
		this.correo = correo;
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
	 * @return the cedulaProfesional
	 */
	public String getCedulaProfesional() {
		return cedulaProfesional;
	}

	/**
	 * @param cedulaProfesional the cedulaProfesional to set
	 */
	public void setCedulaProfesional(String cedulaProfesional) {
		this.cedulaProfesional = cedulaProfesional;
	}

	/**
	 * @return the horario
	 */
	public String getHorario() {
		return horario;
	}

	/**
	 * @param horario the horario to set
	 */
	public void setHorario(String horario) {
		this.horario = horario;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Medico [idMedico=" + idMedico + ", nombre=" + nombre + ", apellido=" + apellido + ", idEspecialidad="
				+ idEspecialidad + ", telefono=" + telefono + ", correo=" + correo + ", direccion=" + direccion
				+ ", cedulaProfesional=" + cedulaProfesional + ", horario=" + horario + "]";
	}

	public Medico(int idMedico, String nombre, String apellido, int idEspecialidad, String telefono, String correo,
			String direccion, String cedulaProfesional, String horario) {
		super();
		this.idMedico = idMedico;
		this.nombre = nombre;
		this.apellido = apellido;
		this.idEspecialidad = idEspecialidad;
		this.telefono = telefono;
		this.correo = correo;
		this.direccion = direccion;
		this.cedulaProfesional = cedulaProfesional;
		this.horario = horario;
	}
	
	
	
}
