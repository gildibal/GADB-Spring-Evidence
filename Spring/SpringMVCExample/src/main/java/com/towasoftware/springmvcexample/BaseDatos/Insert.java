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



public class Insert {

	private Connection conexion;
	private Statement statement;
	private String query;
	
	public void InsertarPaciente(Paciente paciente) throws SQLException
	{
		String insertTableSQL = "INSERT INTO Paciente" + " (`Nombre`, `Apellido`,"
				+ " `Direccion`, `Telefono`, `Email`, `TipoSangre`, `Alergias`, `NSS`, `Sexo`,"
				+ " `FechaNacimiento`) "
				+ "VALUES ('"+paciente.getNombre()+"','"+paciente.getApellido()+"',"
				+ "'"+paciente.getDireccion()+"','"+paciente.getTelefono()+"',"
				+ "'"+paciente.getEmail()+"','"+paciente.getTipoSangre()+"',"
				+ "'"+paciente.getAlergias()+"','"+paciente.getNSS()+"',"
						+ "'"+paciente.getSexo()+"','"+paciente.getFechaNacimiento()+"')"; 
		
		this.query =insertTableSQL;
		this.insertar();
		
	}
	
	public void InsertarDepartamento(Departamento depto) throws SQLException
	{
		String insertTableSQL = "INSERT INTO Departamento" + " ( `Nombre`)"
				+ "VALUES ('"+depto.getNombre()
				+"')"; 
		
		this.query = insertTableSQL;
		this.insertar();
	}
	
	public void InsertarConsultorio(Consultorio consultorio) throws SQLException
	{
		String insertTableSQL = "INSERT INTO Consultorio" + " ( `idConsultorio`,`Piso`)"
				+ "VALUES ("+consultorio.getIdConsultorio()+","+consultorio.getPiso()
				+")"; 
		
		this.query = insertTableSQL;
		this.insertar();
	}
	
	public void InsertarEspecialidad(Especialidad especialidad) throws SQLException
	{
		String insertTableSQL = "INSERT INTO Especialidad" + " ( `Nombre`, `idDepartamento`)"
				+ "VALUES ('"+especialidad.getNombre()+"',"+especialidad.getIdDepartamento()
				+")"; 
		
		this.query = insertTableSQL;
		this.insertar();
	}
	
	public void InsertarCita(Cita cita) throws SQLException
	{
		String insertTableSQL = "INSERT INTO `cita`( `Fecha`, `Hora`, `idPaciente`,"
				+ " `idMedico`, `idConsultorio`, `Presion`, `Peso`, `Talla`, `Temperatura`, "
				+ "`Diagnostico`, `Observacion`) "
				+ "VALUES ('"+cita.getFecha()+"','"+cita.getHora()+"',"+cita.getIdPaciente()+","
				+ ""+cita.getIdMedico()+","+cita.getIdConsultorio()+",'"+cita.getPresion()+"',"
				+ ""+cita.getPeso()+","+cita.getTalla()+","+cita.getTemperatura()+","
				+ "'"+cita.getDiagnostico()+"','"+cita.getObservacion()+"'"
				+")"; 
		
		this.query = insertTableSQL;
		this.insertar();
	}
	
	public void InsertarMedico(Medico medico) throws SQLException
	{
		String insertTableSQL = "INSERT INTO Medico" + " (`Nombre`, `Apellido`,"
				+ " `idEspecialidad`, `Telefono`, `Correo`,`Direccion`, `CedulaProfesional`"
				+ ", `Horario`) "
				+ "VALUES ('"+medico.getNombre()+"','"+medico.getApellido()+"',"
				+ " "+medico.getIdEspecialidad()+",'"+medico.getTelefono()+"',"
				+ "'"+medico.getCorreo()+"','"+medico.getDireccion()+"',"
				+ "'"+medico.getCedulaProfesional()+"','"+medico.getHorario()+"')"; 
		
		this.query =insertTableSQL;
		this.insertar();
		
	}
	
	public void InsertarReceta(Receta receta) throws SQLException
	{
		String insertTableSQL = "INSERT INTO Receta " + " ( `idCita`, `Prescripcion`)"
				+ "VALUES ("+receta.getIdCita()+",'"+ receta.getPrescripcion()
				+"');"; 
		
		this.query = insertTableSQL;
		this.insertar();
	}
	
	public Insert() {
		this.conexion = new Conexion().getConnection();
	}

	public void insertar() throws SQLException {
		try {
			
			this.statement = this.conexion.createStatement();

			System.out.println(this.query);

			// execute insert SQL stetement
			statement.executeUpdate(this.query);

			System.out.println("Record is inserted into DBUSER table!");

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
