package com.towasoftware.springmvcexample.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.towasoftware.springmvcexample.model.User;

@Controller
@RequestMapping(value = "/mobile/user", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
public class MobileUserController {

	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody User createUser(@RequestBody User user) {

		user.setId(10000);

		return user;

	}

	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody List<User> getAllUsers() {

		List<User> lstUsers = this.generateList(10);

		return lstUsers;

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public @ResponseBody User getUserById(@PathVariable Integer id) {

		User user = null;

		for (User u : this.generateList(50)) {
			if (u.getId() == id) {
				user = u;
				break;
			}
		}

		return user;

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public @ResponseBody User updateUser(@RequestBody User user, @PathVariable Integer id) {

		user.setName(user.getName() + " Actualizado");

		return user;

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public @ResponseBody Boolean deleteUser(@PathVariable Integer id) {

		return true;

	}

	// Utilería
	private List<User> generateList(int limite) {

		List<User> list = new ArrayList<User>();

		for (int i = 1; i <= limite; i++) {

			User u = new User(i, "name " + i, "lastname " + i, "address " + i);

			list.add(u);

		}

		return list;

	}

}
