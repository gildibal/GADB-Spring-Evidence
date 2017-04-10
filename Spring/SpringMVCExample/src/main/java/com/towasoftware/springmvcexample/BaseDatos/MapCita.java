/**
 * 
 */
package com.towasoftware.springmvcexample.BaseDatos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.towasoftware.springmvcexample.model.Cita;


/**
 * @author TOWA - Gil Alberto Díaz Balderas (GADB) 05/04/2017
 * 
 */
public class MapCita {

	public List<Cita> mapCitas(ResultSet resultSet) throws SQLException {

		List<Cita> lista = new ArrayList<Cita>();
		while (resultSet.next()) {
			
			lista.add(maper(resultSet));
		}
		return lista;
	}
	
	public Cita mapCita(ResultSet resultSet) throws SQLException {
			
			if (!resultSet.next())
			{return null;}
			return maper(resultSet);
			
	}
	
	public Cita maper(ResultSet resultSet) throws SQLException
	{
		Cita cita = new Cita();
		cita.setIdCita(resultSet.getInt("idCita"));
		cita.setDiagnostico(resultSet.getString("Diagnostico"));
		cita.setFecha(resultSet.getDate("Fecha"));
		cita.setIdConsultorio(resultSet.getInt("idConsultorio"));
		cita.setIdMedico(resultSet.getInt("idMedico"));
		cita.setIdPaciente(resultSet.getInt("idPaciente"));
		//cita.setIdReceta(resultSet.getInt("idReceta"));
		cita.setObservacion(resultSet.getString("observacion"));
		cita.setPeso(resultSet.getFloat("Peso"));
		cita.setPresion(resultSet.getString("Presion"));
		cita.setTalla(resultSet.getFloat("Talla"));
		cita.setTemperatura(resultSet.getFloat("Temperatura"));
		cita.setHora(resultSet.getTime("Hora"));
		System.out.println(cita);
	return cita;
	}
}
