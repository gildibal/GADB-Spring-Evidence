package com.towasoftware.springmvcexample.BaseDatos;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.towasoftware.springmvcexample.model.Cita;
import com.towasoftware.springmvcexample.model.Consultorio;
import com.towasoftware.springmvcexample.model.Departamento;
import com.towasoftware.springmvcexample.model.Especialidad;
import com.towasoftware.springmvcexample.model.Medico;
import com.towasoftware.springmvcexample.model.Paciente;
import com.towasoftware.springmvcexample.model.Receta;



public class Update {

	private Connection conexion;
	private Statement statement;
	private String query;


	
	public void updatePaciente(Paciente paciente, int id) throws SQLException
	{
		String updateTableSQL = "UPDATE Paciente  SET" + 
				" `Nombre` = '"+paciente.getNombre()+"' ,"
				+ " `Apellido` = '"+paciente.getApellido()+"' ,"
				+ " `Direccion` = '"+paciente.getDireccion()+"', "
				+ "`Telefono` = '"+paciente.getTelefono()+"',"
				+ " `Email`= '"+paciente.getEmail()+"', "
				+ "`TipoSangre` = '"+paciente.getTipoSangre()+"',"
				+ " `Alergias` = '"+paciente.getAlergias()+"', "
				+ "`NSS` = '"+paciente.getNSS()+"',"
				+ " `Sexo` = '"+paciente.getSexo()+"',"
				+ " `FechaNacimiento` = '"+paciente.getFechaNacimiento()+"' "
				+ "WHERE `idPaciente` = "+id
						+ " ;"; 
		
		this.query =updateTableSQL;
		this.actualizar();
		
	}
	
	public void updateDepartamento(Departamento depto, int id) throws SQLException
	{
		String updateTableSQL = "UPDATE Departamento SET "
				+ "`Nombre` =  '"+depto.getNombre()+"'"
				+ " WHERE idDepartamento = "+id; 
		
		this.query = updateTableSQL;
		this.actualizar();
	}
	
	
	public void updateConsultorio(Consultorio consultorio, int id) throws SQLException
	{
		String updateTableSQL = "UPDATE Consultorio SET "
				+ "`Piso` = "+consultorio.getPiso()+" "
				+ " WHERE idConsultorio = "+id;
				
		
		this.query = updateTableSQL;
		this.actualizar();
	}
	
	
	public void updateEspecialidad(Especialidad especialidad, int id) throws SQLException
	{
		String updateTableSQL = "UPDATE Especialidad SET "
				+ "`Nombre` = '"+especialidad.getNombre()+"', "
				+ "`idDepartamento` = "+especialidad.getIdDepartamento()+" "
				+ "WHERE idEspecialidad = "+id; 
		
		this.query = updateTableSQL;
		this.actualizar();
	}
	
	public void updateCita(Cita cita, int id) throws SQLException
	{
		String updateTableSQL = "UPDATE `cita` SET "
				+ "`Fecha` = '"+cita.getFecha()+"',"
				+ " `Hora` = '"+cita.getHora()+"',"
				+ " `idPaciente` = "+cita.getIdPaciente()+","
				+ " `idMedico` = "+cita.getIdMedico()+","
				+ " `idConsultorio` = "+cita.getIdConsultorio()+", "
				+ "`Presion` = '"+cita.getPresion()+"', "
				+ "`Peso` = "+cita.getPeso()+", "
				+ "`Talla` = "+cita.getTalla()+", "
				+ "`Temperatura` = "+cita.getTemperatura()+", "
				+ "`Diagnostico` = '"+cita.getDiagnostico()+"',"
				+ " `Observacion` = '"+cita.getObservacion()+"' "
				+ " WHERE idCita = "+ id; 
		
		this.query = updateTableSQL;
		this.actualizar();
	}
	
	public void updateMedico(Medico medico, int id) throws SQLException
	{
		String updateTableSQL = "UPDATE Medico  SET" 
				+" `Nombre` = '"+medico.getNombre()+"',"
				+ " `Apellido` = '"+medico.getApellido()+"',"
				+ " `idEspecialidad` = "+medico.getIdEspecialidad()+","
				+ " `Telefono` = '"+medico.getTelefono()+"',"
				+ " `Correo` = '"+medico.getCorreo()+"',"
				+ "`Direccion`= '"+medico.getDireccion()+"',"
				+ "`CedulaProfesional` = '"+medico.getCedulaProfesional()+"'"
				+ ", `Horario` = '"+medico.getHorario()+"'; "; 
		
		this.query =updateTableSQL;
		this.actualizar();
		
	}
	
	public void updateReceta(Receta receta, int id) throws SQLException
	{
		String updateTableSQL = "UPDATE Receta SET "
				+ "`idCita` = "+receta.getIdCita()+", "
				+ "`Prescripcion` = '"+receta.getPrescripcion()+"' "
				+ "WHERE idReceta = "+id; 
		
		this.query = updateTableSQL;
		this.actualizar();
	}
	
	public Update() {
		this.conexion = new Conexion().getConnection();
	}

	public void actualizar() throws SQLException {
		try {
			
			this.statement = this.conexion.createStatement();

			System.out.println(this.query);

			// execute update SQL stetement
			statement.executeUpdate(this.query);

			System.out.println("Record is updated into DBUSER table!");

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		} finally {

			if (statement != null) {
				statement.close();
			}

			if ( this.conexion!= null) {
				this.conexion.close();
			}
		}
	}
}
