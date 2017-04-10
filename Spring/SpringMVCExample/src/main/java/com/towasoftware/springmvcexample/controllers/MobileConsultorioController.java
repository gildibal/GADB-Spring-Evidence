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
import com.towasoftware.springmvcexample.model.Consultorio;

@Controller
@RequestMapping(value = "/mobile/consultorio", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
public class MobileConsultorioController {

	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody Consultorio createUser(@RequestBody Consultorio consultorio) throws SQLException {

		Insert i = new Insert();
		i.InsertarConsultorio(consultorio);

		Consulta c = new Consulta();
		consultorio = c.consultaUltimoConsultorio();
		return consultorio;

	}

	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody List<Consultorio> getAllUsers() throws SQLException {

		Consulta c = new Consulta();
		List<Consultorio> lstConsultorio = c.consultaConsultorios();

		return lstConsultorio;

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public @ResponseBody Consultorio getConsultorioById(@PathVariable Integer id) throws SQLException {

		Consultorio consultorio = null;

		Consulta c = new Consulta();

		consultorio = c.consultaConsultorioId(id);

		System.out.println(id);
		return consultorio;

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public @ResponseBody Consultorio updateUser(@RequestBody Consultorio consultorio, @PathVariable Integer id)
			throws SQLException {

		Update u = new Update();
		u.updateConsultorio(consultorio, id);

		Consulta c = new Consulta();
		consultorio = c.consultaConsultorioId(id);

		return consultorio;

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public @ResponseBody Boolean deleteUser(@PathVariable Integer id) throws SQLException {

		Delete d = new Delete();
		if (d.deleteConsultorio(id)) {
			return true;
		} else {
			return false;
		}

	}
}
