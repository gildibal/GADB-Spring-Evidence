package com.towasoftware.springmvcexample.BaseDatos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.towasoftware.springmvcexample.model.Cita;
import com.towasoftware.springmvcexample.model.Consultorio;
import com.towasoftware.springmvcexample.model.Departamento;
import com.towasoftware.springmvcexample.model.Especialidad;
import com.towasoftware.springmvcexample.model.Medico;
import com.towasoftware.springmvcexample.model.Paciente;
import com.towasoftware.springmvcexample.model.Receta;

import java.sql.Statement;


public class Consulta {

	private Connection conexion;
	private Statement statement;
	private String query;
	private ResultSet resultSet;

	public Consulta() {
		this.conexion = new Conexion().getConnection();
	}

	public List<Paciente> consultaPacientes() throws SQLException {
		 this.query = "Select * FROM Paciente;";
		try {
			this.statement = this.conexion.createStatement();
			this.resultSet = this.statement.executeQuery(this.query);
			MapPaciente mapPaciente = new MapPaciente();
			return mapPaciente.mapPacientes(resultSet);
		} catch (Exception e) {
			return null;
		} finally {
			this.conexion.close();
		}
	}

	
	public Paciente consultaUltimoPaciente() throws SQLException {
		 this.query = "SELECT * FROM paciente ORDER BY idPaciente DESC LIMIT 1";
		try {
			this.statement = this.conexion.createStatement();
			this.resultSet = this.statement.executeQuery(this.query);
			MapPaciente mapPaciente = new MapPaciente();
			return mapPaciente.mapPaciente(resultSet);
		} catch (Exception e) {
			return null;
		} finally {
			this.conexion.close();
		}
	}
	
	
	public Paciente consultaPacienteId(int id) throws SQLException
	{
		this.setQuery("SELECT * FROM paciente WHERE idPaciente = " + id + ";");
		return consultaPaciente();
	}

	public Paciente consultaPaciente() throws SQLException {
		
		try {
			this.statement = this.conexion.createStatement();
			this.resultSet = this.statement.executeQuery(this.query);
			MapPaciente mapPaciente = new MapPaciente();
			return mapPaciente.mapPaciente(resultSet);
		} catch (Exception e) {
			return null;
		} finally {
			this.conexion.close();
		}
	}

	

	
	
	

	public Medico consultaUltimoMedico() throws SQLException {
		 this.query = "SELECT * FROM medico ORDER BY idMedico DESC LIMIT 1";
		try {
			this.statement = this.conexion.createStatement();
			this.resultSet = this.statement.executeQuery(this.query);
			MapMedico mapMedico = new MapMedico();
			return mapMedico.mapMedico(resultSet);
		} catch (Exception e) {
			return null;
		} finally {
			this.conexion.close();
		}
	}
	
	public Medico consultaMedicoId(int id) throws SQLException {
		 this.query = "SELECT * FROM medico WHERE idMedico = "+ id + ";";
		try {
			this.statement = this.conexion.createStatement();
			this.resultSet = this.statement.executeQuery(this.query);
			MapMedico mapMedico = new MapMedico();
			return mapMedico.mapMedico(resultSet);
		} catch (Exception e) {
			System.out.println(e);
			return null;
		} finally {
			this.conexion.close();
		}
	}
	
	public List<Medico> consultaMedicos() throws SQLException {
		 this.query = "Select * FROM Medico;";
		try {
			this.statement = this.conexion.createStatement();
			this.resultSet = this.statement.executeQuery(this.query);
			MapMedico mapMedico = new MapMedico();
			return mapMedico.mapMedicos(resultSet);
		} catch (Exception e) {
			return null;
		} finally {
			this.conexion.close();
		}
	}

	
	public Cita consultaUltimoCita() throws SQLException {
		 this.query = "SELECT * FROM Cita ORDER BY idCita DESC LIMIT 1";
		try {
			this.statement = this.conexion.createStatement();
			this.resultSet = this.statement.executeQuery(this.query);
			MapCita mapCita = new MapCita();
			return mapCita.mapCita(resultSet);
		} catch (Exception e) {
			return null;
		} finally {
			this.conexion.close();
		}
	}
	
	public Cita consultaCitaId(int id) throws SQLException {
		 this.query = "SELECT * FROM Cita WHERE idCita = "+ id + ";";
		try {
			this.statement = this.conexion.createStatement();
			this.resultSet = this.statement.executeQuery(this.query);
			MapCita mapCita = new MapCita();
			return mapCita.mapCita(resultSet);
		} catch (Exception e) {
			System.out.println(e);
			return null;
		} finally {
			this.conexion.close();
		}
	}
	
	public List<Cita> consultaCitas() throws SQLException {
		 this.query = "Select * FROM Cita;";
		try {
			this.statement = this.conexion.createStatement();
			this.resultSet = this.statement.executeQuery(this.query);
			MapCita mapCita = new MapCita();
			return mapCita.mapCitas(resultSet);
		} catch (Exception e) {
			System.out.println(e);
			return null;
		} finally {
			this.conexion.close();
		}
	}

	
	public Consultorio consultaUltimoConsultorio() throws SQLException {
		 this.query = "SELECT * FROM consultorio ORDER BY idConsultorio DESC LIMIT 1";
		try {
			this.statement = this.conexion.createStatement();
			this.resultSet = this.statement.executeQuery(this.query);
			MapConsultorio mapConsultorio = new MapConsultorio();
			return mapConsultorio.mapConsultorio(resultSet);
		} catch (Exception e) {
			return null;
		} finally {
			this.conexion.close();
		}
	}
	
	public Consultorio consultaConsultorioId(int id) throws SQLException {
		 this.query = "SELECT * FROM consultorio WHERE idConsultorio = "+ id + ";";
		try {
			this.statement = this.conexion.createStatement();
			this.resultSet = this.statement.executeQuery(this.query);
			MapConsultorio mapConsultorio = new MapConsultorio();
			return mapConsultorio.mapConsultorio(resultSet);
		} catch (Exception e) {
			System.out.println(e);
			return null;
		} finally {
			this.conexion.close();
		}
	}
	
	public List<Consultorio> consultaConsultorios() throws SQLException {
		 this.query = "Select * FROM Consultorio;";
		try {
			this.statement = this.conexion.createStatement();
			this.resultSet = this.statement.executeQuery(this.query);
			MapConsultorio mapConsultorio = new MapConsultorio();
			return mapConsultorio.mapConsultorios(resultSet);
		} catch (Exception e) {
			return null;
		} finally {
			this.conexion.close();
		}
	}

	public Departamento consultaUltimoDepartamento() throws SQLException {
		 this.query = "SELECT * FROM departamento ORDER BY idDepartamento DESC LIMIT 1";
		try {
			this.statement = this.conexion.createStatement();
			this.resultSet = this.statement.executeQuery(this.query);
			MapDepartamento mapDepartamento = new MapDepartamento();
			return mapDepartamento.mapDepartamento(resultSet);
		} catch (Exception e) {
			return null;
		} finally {
			this.conexion.close();
		}
	}
	
	public Departamento consultaDepartamentoId(int id) throws SQLException {
		 this.query = "SELECT * FROM departamento WHERE idDepartamento = "+ id + ";";
		try {
			this.statement = this.conexion.createStatement();
			this.resultSet = this.statement.executeQuery(this.query);
			MapDepartamento mapDepartamento = new MapDepartamento();
			return mapDepartamento.mapDepartamento(resultSet);
		} catch (Exception e) {
			System.out.println(e);
			return null;
		} finally {
			this.conexion.close();
		}
	}
	
	public List<Departamento> consultaDepartamentos() throws SQLException {
		 this.query = "Select * FROM Departamento;";
		try {
			this.statement = this.conexion.createStatement();
			this.resultSet = this.statement.executeQuery(this.query);
			MapDepartamento mapDepartamento = new MapDepartamento();
			return mapDepartamento.mapDepartamentos(resultSet);
		} catch (Exception e) {
			return null;
		} finally {
			this.conexion.close();
		}
	}

	public Especialidad consultaUltimoEspecialidad() throws SQLException {
		 this.query = "SELECT * FROM especialidad ORDER BY idEspecialidad DESC LIMIT 1";
		try {
			this.statement = this.conexion.createStatement();
			this.resultSet = this.statement.executeQuery(this.query);
			MapEspecialidad mapEspecialidad = new MapEspecialidad();
			return mapEspecialidad.mapEspecialidad(resultSet);
		} catch (Exception e) {
			return null;
		} finally {
			this.conexion.close();
		}
	}
	
	public Especialidad consultaEspecialidadId(int id) throws SQLException {
		 this.query = "SELECT * FROM especialidad WHERE idEspecialidad = "+ id + ";";
		try {
			this.statement = this.conexion.createStatement();
			this.resultSet = this.statement.executeQuery(this.query);
			MapEspecialidad mapEspecialidad = new MapEspecialidad();
			return mapEspecialidad.mapEspecialidad(resultSet);
		} catch (Exception e) {
			System.out.println(e);
			return null;
		} finally {
			this.conexion.close();
		}
	}
	
	public List<Especialidad> consultaEspecialidads() throws SQLException {
		 this.query = "Select * FROM Especialidad;";
		try {
			this.statement = this.conexion.createStatement();
			this.resultSet = this.statement.executeQuery(this.query);
			MapEspecialidad mapEspecialidad = new MapEspecialidad();
			return mapEspecialidad.mapEspecialidads(resultSet);
		} catch (Exception e) {
			return null;
		} finally {
			this.conexion.close();
		}
	}
	
	public Receta consultaUltimoReceta() throws SQLException {
		 this.query = "SELECT * FROM Receta ORDER BY idReceta DESC LIMIT 1";
		try {
			this.statement = this.conexion.createStatement();
			this.resultSet = this.statement.executeQuery(this.query);
			MapReceta mapReceta = new MapReceta();
			return mapReceta.mapReceta(resultSet);
		} catch (Exception e) {
			return null;
		} finally {
			this.conexion.close();
		}
	}
	
	public Receta consultaRecetaId(int id) throws SQLException {
		 this.query = "SELECT * FROM Receta WHERE idReceta = "+ id + ";";
		try {
			this.statement = this.conexion.createStatement();
			this.resultSet = this.statement.executeQuery(this.query);
			MapReceta mapReceta = new MapReceta();
			return mapReceta.mapReceta(resultSet);
		} catch (Exception e) {
			System.out.println(e);
			return null;
		} finally {
			this.conexion.close();
		}
	}
	
	public List<Receta> consultaRecetas() throws SQLException {
		 this.query = "Select * FROM Receta;";
		try {
			this.statement = this.conexion.createStatement();
			this.resultSet = this.statement.executeQuery(this.query);
			MapReceta mapReceta = new MapReceta();
			return mapReceta.mapRecetas(resultSet);
		} catch (Exception e) {
			return null;
		} finally {
			this.conexion.close();
		}
	}


	/**
	 * @return the conexion
	 */
	public Connection getConexion() {
		return conexion;
	}

	/**
	 * @param conexion
	 *            the conexion to set
	 */
	public void setConexion(Connection conexion) {
		this.conexion = conexion;
	}

	/**
	 * @return the statement
	 */
	public Statement getStatement() {
		return statement;
	}

	/**
	 * @param statement
	 *            the statement to set
	 */
	public void setStatement(Statement statement) {
		this.statement = statement;
	}

	/**
	 * @return the query
	 */
	public String getQuery() {
		return query;
	}

	/**
	 * @param query
	 *            the query to set
	 */
	public void setQuery(String query) {
		this.query = query;
	}

}
