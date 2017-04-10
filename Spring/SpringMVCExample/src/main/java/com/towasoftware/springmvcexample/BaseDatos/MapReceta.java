/**
 * 
 */
package com.towasoftware.springmvcexample.BaseDatos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.towasoftware.springmvcexample.model.Receta;


/**
 * @author TOWA - Gil Alberto Díaz Balderas (GADB) 05/04/2017
 * 
 */
public class MapReceta {

	public List<Receta> mapRecetas(ResultSet resultSet) throws SQLException {

		List<Receta> lista = new ArrayList<Receta>();
		while (resultSet.next()) {
			
			lista.add(maper(resultSet));
		}
		return lista;
	}
	
	public Receta mapReceta(ResultSet resultSet) throws SQLException {
			
			if (!resultSet.next())
			{return null;}
			return maper(resultSet);
			
	}
	
	public Receta maper(ResultSet resultSet) throws SQLException
	{
		Receta receta = new Receta();
		receta.setIdReceta(resultSet.getInt("idReceta"));
		receta.setIdCita(resultSet.getInt("idCita"));
		receta.setPrescripcion(resultSet.getString("Prescripcion"));
		System.out.println(receta);
	return receta;
	}
}
