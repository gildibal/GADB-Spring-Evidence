/**
 * 
 */
package com.towasoftware.springmvcexample.BaseDatos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.towasoftware.springmvcexample.model.Departamento;



/**
 * @author TOWA - Gil Alberto Díaz Balderas (GADB) 05/04/2017
 * 
 */
public class MapDepartamento {
	public List<Departamento> mapDepartamentos(ResultSet resultSet) throws SQLException {

		List<Departamento> lista = new ArrayList<Departamento>();
		while (resultSet.next()) {

			lista.add(maper(resultSet));
		}
		return lista;
	}

	public Departamento mapDepartamento(ResultSet resultSet) throws SQLException {
		if (!resultSet.next()) {
			return null;
		}
		return maper(resultSet);

	}

	public Departamento maper(ResultSet resultSet) throws SQLException {
		Departamento depto = new Departamento();
		depto.setIdDepartamento(resultSet.getInt("idDepartamento"));
		depto.setNombre(resultSet.getString("Nombre"));
		System.out.println(depto);
		return depto;
	}

}
