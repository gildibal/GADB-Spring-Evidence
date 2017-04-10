/**
 * 
 */
package com.towasoftware.springmvcexample.BaseDatos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.towasoftware.springmvcexample.model.Medico;


/**
 * @author TOWA - Gil Alberto Díaz Balderas (GADB) 05/04/2017
 * 
 */
public class MapMedico {

	public List<Medico> mapMedicos(ResultSet resultSet) throws SQLException {

		List<Medico> lista = new ArrayList<Medico>();
		while (resultSet.next()) {
			
			lista.add(maper(resultSet));
		}
		return lista;
	}
	
	public Medico mapMedico(ResultSet resultSet) throws SQLException {
			
			if (!resultSet.next())
			{return null;}
			return maper(resultSet);
			
	}
	
	public Medico maper(ResultSet resultSet) throws SQLException
	{
		Medico medico = new Medico();
		medico.setIdMedico(resultSet.getInt("idMedico"));
		medico.setApellido(resultSet.getString("Apellido"));
		medico.setDireccion(resultSet.getString("Direccion"));
		medico.setNombre(resultSet.getString("Nombre"));
		medico.setTelefono(resultSet.getString("Telefono"));
		medico.setCorreo(resultSet.getString("correo"));
		medico.setCedulaProfesional(resultSet.getString("cedulaProfesional"));
		medico.setHorario(resultSet.getString("horario"));
		medico.setIdEspecialidad(resultSet.getInt("idEspecialidad"));
		System.out.println(medico);
	return medico;
	}
}
