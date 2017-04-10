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
import com.towasoftware.springmvcexample.model.Receta;

@Controller
@RequestMapping(value = "/mobile/receta", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
public class MobileRecetaController {

	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody Receta createUser(@RequestBody Receta receta) throws SQLException {

		Insert i = new Insert();
		i.InsertarReceta(receta);

		Consulta c = new Consulta();
		receta = c.consultaUltimoReceta();
		return receta;

	}

	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody List<Receta> getAllUsers() throws SQLException {

		Consulta c = new Consulta();
		List<Receta> lstReceta = c.consultaRecetas();

		return lstReceta;

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public @ResponseBody Receta getRecetaById(@PathVariable Integer id) throws SQLException {

		Receta receta = null;

		Consulta c = new Consulta();

		receta = c.consultaRecetaId(id);

		System.out.println(id);
		return receta;

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public @ResponseBody Receta updateUser(@RequestBody Receta receta, @PathVariable Integer id)
			throws SQLException {

		Update u = new Update();
		u.updateReceta(receta, id);

		Consulta c = new Consulta();
		receta = c.consultaRecetaId(id);
		
		return receta;

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public @ResponseBody Boolean deleteUser(@PathVariable Integer id) throws SQLException {

		Delete d = new Delete();
		if (d.deleteReceta(id))
			{return true;}
		else
			{return false;}

	}
}
