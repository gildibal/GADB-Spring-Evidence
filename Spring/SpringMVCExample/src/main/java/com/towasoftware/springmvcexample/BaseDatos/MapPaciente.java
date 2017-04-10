/**
 * 
 */
package com.towasoftware.springmvcexample.BaseDatos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.towasoftware.springmvcexample.model.Paciente;


/**
 * @author TOWA - Gil Alberto Díaz Balderas (GADB) 05/04/2017
 * 
 */
public class MapPaciente {

	public List<Paciente> mapPacientes(ResultSet resultSet) throws SQLException {

		List<Paciente> lista = new ArrayList<Paciente>();
		while (resultSet.next()) {
			
			lista.add(maper(resultSet));
		}
		return lista;
	}
	
	public Paciente mapPaciente(ResultSet resultSet) throws SQLException {
			
			if (!resultSet.next())
			{return null;}
			return maper(resultSet);
			
	}
	
	public Paciente maper(ResultSet resultSet) throws SQLException
	{
		Paciente paciente = new Paciente();
		paciente.setIdPaciente(resultSet.getInt("idPaciente"));
		paciente.setAlergias(resultSet.getString("Alergias"));
		paciente.setApellido(resultSet.getString("Apellido"));
		paciente.setDireccion(resultSet.getString("Direccion"));
		paciente.setEmail(resultSet.getString("Email"));
		paciente.setFechaNacimiento(resultSet.getDate("FechaNacimiento"));
		paciente.setNombre(resultSet.getString("Nombre"));
		paciente.setNSS(resultSet.getString("NSS"));
		paciente.setSexo(resultSet.getString("Sexo"));
		paciente.setTelefono(resultSet.getString("Telefono"));
		paciente.setTipoSangre(resultSet.getString("TipoSangre"));
		//System.out.println(paciente);
	return paciente;
	}
}
