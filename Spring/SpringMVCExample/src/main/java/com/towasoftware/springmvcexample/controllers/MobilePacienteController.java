package com.towasoftware.springmvcexample.controllers;

import java.sql.SQLException;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.towasoftware.springmvcexample.BaseDatos.Consulta;
import com.towasoftware.springmvcexample.BaseDatos.Delete;
import com.towasoftware.springmvcexample.BaseDatos.Insert;
import com.towasoftware.springmvcexample.BaseDatos.Update;
import com.towasoftware.springmvcexample.model.Paciente;

@Controller
@RequestMapping(value = "/mobile/paciente", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
public class MobilePacienteController {

	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody Paciente createUser(@RequestBody Paciente paciente) throws SQLException {

		Insert i = new Insert();
		i.InsertarPaciente(paciente);

		Consulta c = new Consulta();
		paciente = c.consultaUltimoPaciente();
		return paciente;

	}

	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody List<Paciente> getAllUsers() throws SQLException {

		Consulta c = new Consulta();
		List<Paciente> lstPaciente = c.consultaPacientes();

		return lstPaciente;

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public @ResponseBody Paciente getPacienteById(@PathVariable Integer id) throws SQLException {

		Paciente paciente = null;

		Consulta c = new Consulta();

		paciente = c.consultaPacienteId(id);

		return paciente;

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public @ResponseBody Paciente updateUser(@RequestBody Paciente paciente, @PathVariable Integer id)
			throws SQLException {

		Update u = new Update();
		u.updatePaciente(paciente, id);

		Consulta c = new Consulta();
		paciente = c.consultaPacienteId(id);
		// paciente = c.consultaPaciente();
		return paciente;

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public @ResponseBody Boolean deleteUser(@PathVariable Integer id) throws SQLException {

		Delete d = new Delete();
		if (d.deletePaciente(id)) {
			return true;
		} else {
			return false;
		}

	}
}
