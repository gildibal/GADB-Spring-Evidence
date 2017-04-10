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
import com.towasoftware.springmvcexample.model.Medico;

@Controller
@RequestMapping(value = "/mobile/medico", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
public class MobileMedicoController {

	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody Medico createUser(@RequestBody Medico medico) throws SQLException {

		Insert i = new Insert();
		i.InsertarMedico(medico);

		Consulta c = new Consulta();
		medico = c.consultaUltimoMedico();
		return medico;

	}

	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody List<Medico> getAllUsers() throws SQLException {

		Consulta c = new Consulta();
		List<Medico> lstMedico = c.consultaMedicos();

		return lstMedico;

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public @ResponseBody Medico getMedicoById(@PathVariable Integer id) throws SQLException {

		Medico medico = null;

		Consulta c = new Consulta();

		medico = c.consultaMedicoId(id);

		System.out.println(id);
		return medico;

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public @ResponseBody Medico updateUser(@RequestBody Medico medico, @PathVariable Integer id) throws SQLException {

		Update u = new Update();
		u.updateMedico(medico, id);

		Consulta c = new Consulta();
		medico = c.consultaMedicoId(id);

		return medico;

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public @ResponseBody Boolean deleteUser(@PathVariable Integer id) throws SQLException {

		Delete d = new Delete();
		if (d.deleteMedico(id)) {
			return true;
		} else {
			return false;
		}

	}
}
