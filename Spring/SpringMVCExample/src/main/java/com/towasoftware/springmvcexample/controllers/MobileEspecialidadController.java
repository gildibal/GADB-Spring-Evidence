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
import com.towasoftware.springmvcexample.model.Especialidad;

@Controller
@RequestMapping(value = "/mobile/especialidad", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
public class MobileEspecialidadController {

	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody Especialidad createUser(@RequestBody Especialidad especialidad) throws SQLException {

		Insert i = new Insert();
		i.InsertarEspecialidad(especialidad);

		Consulta c = new Consulta();
		especialidad = c.consultaUltimoEspecialidad();
		return especialidad;

	}

	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody List<Especialidad> getAllUsers() throws SQLException {

		Consulta c = new Consulta();
		List<Especialidad> lstEspecialidad = c.consultaEspecialidads();

		return lstEspecialidad;

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public @ResponseBody Especialidad getEspecialidadById(@PathVariable Integer id) throws SQLException {

		Especialidad especialidad = null;

		Consulta c = new Consulta();

		especialidad = c.consultaEspecialidadId(id);

		System.out.println(id);
		return especialidad;

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public @ResponseBody Especialidad updateUser(@RequestBody Especialidad especialidad, @PathVariable Integer id)
			throws SQLException {

		Update u = new Update();
		u.updateEspecialidad(especialidad, id);

		Consulta c = new Consulta();
		especialidad = c.consultaEspecialidadId(id);

		return especialidad;

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public @ResponseBody Boolean deleteUser(@PathVariable Integer id) throws SQLException {

		Delete d = new Delete();
		if (d.deleteEspecialidad(id)) {
			return true;
		} else {
			return false;
		}

	}
}
