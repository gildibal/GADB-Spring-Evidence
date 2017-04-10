/**
 * 
 */
package com.towasoftware.springmvcexample.BaseDatos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.towasoftware.springmvcexample.model.Consultorio;



/**
 * @author TOWA - Gil Alberto Díaz Balderas (GADB) 05/04/2017
 * 
 */
public class MapConsultorio {
	public List<Consultorio> mapConsultorios(ResultSet resultSet) throws SQLException {

		List<Consultorio> lista = new ArrayList<Consultorio>();
		while (resultSet.next()) {

			lista.add(maper(resultSet));
		}
		return lista;
	}

	public Consultorio mapConsultorio(ResultSet resultSet) throws SQLException {
		if (!resultSet.next()) {
			return null;
		}
		return maper(resultSet);

	}

	public Consultorio maper(ResultSet resultSet) throws SQLException {
		Consultorio consultorio = new Consultorio();
		consultorio.setIdConsultorio(resultSet.getInt("idConsultorio"));
		consultorio.setPiso(resultSet.getInt("Piso"));
		return consultorio;
	}

}
