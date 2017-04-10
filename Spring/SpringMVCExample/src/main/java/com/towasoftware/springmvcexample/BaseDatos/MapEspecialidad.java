package com.towasoftware.springmvcexample.BaseDatos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.towasoftware.springmvcexample.model.Especialidad;


public class MapEspecialidad {
	
	public List<Especialidad> mapEspecialidads(ResultSet resultSet) throws SQLException {

		List<Especialidad> lista = new ArrayList<Especialidad>();
		while (resultSet.next()) {
			
			lista.add(maper(resultSet));
		}
		return lista;
	}
	
	public Especialidad mapEspecialidad(ResultSet resultSet) throws SQLException {
			
			if (!resultSet.next())
			{return null;}
			return maper(resultSet);
			
	}
	
	public Especialidad maper(ResultSet resultSet) throws SQLException
	{
		Especialidad especialidad = new Especialidad();
		especialidad.setIdEspecialidad(resultSet.getInt("idEspecialidad"));
		especialidad.setIdDepartamento(resultSet.getInt("idDepartamento"));
		especialidad.setNombre(resultSet.getString("nombre"));
		System.out.println(especialidad);
	return especialidad;
	}

}
