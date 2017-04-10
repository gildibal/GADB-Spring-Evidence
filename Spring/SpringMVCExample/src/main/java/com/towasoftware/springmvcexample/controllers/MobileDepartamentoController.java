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
import com.towasoftware.springmvcexample.model.Departamento;

@Controller
@RequestMapping(value = "/mobile/departamento", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
public class MobileDepartamentoController {

	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody Departamento createUser(@RequestBody Departamento departamento) throws SQLException {

		Insert i = new Insert();
		i.InsertarDepartamento(departamento);

		Consulta c = new Consulta();
		departamento = c.consultaUltimoDepartamento();
		return departamento;

	}

	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody List<Departamento> getAllUsers() throws SQLException {

		Consulta c = new Consulta();
		List<Departamento> lstDepartamento = c.consultaDepartamentos();

		return lstDepartamento;

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public @ResponseBody Departamento getDepartamentoById(@PathVariable Integer id) throws SQLException {

		Departamento departamento = null;

		Consulta c = new Consulta();

		departamento = c.consultaDepartamentoId(id);

		System.out.println(id);
		return departamento;

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public @ResponseBody Departamento updateUser(@RequestBody Departamento departamento, @PathVariable Integer id)
			throws SQLException {

		Update u = new Update();
		u.updateDepartamento(departamento, id);

		Consulta c = new Consulta();
		departamento = c.consultaDepartamentoId(id);

		return departamento;

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public @ResponseBody Boolean deleteUser(@PathVariable Integer id) throws SQLException {

		Delete d = new Delete();
		if (d.deleteDepartamento(id)) {
			return true;
		} else {
			return false;
		}

	}
}
