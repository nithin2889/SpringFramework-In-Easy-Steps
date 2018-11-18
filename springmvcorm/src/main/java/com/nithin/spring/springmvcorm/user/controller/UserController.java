package com.nithin.spring.springmvcorm.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nithin.spring.springmvcorm.user.entities.User;
import com.nithin.spring.springmvcorm.user.service.UserService;

@Controller
public class UserController {

	@Autowired
	UserService service;

	public UserService getService() {
		return service;
	}

	public void setService(UserService service) {
		this.service = service;
	}

	@RequestMapping("registrationPage")
	public String showRegistration() {
		return "userReg";
	}

	@RequestMapping(value = "registerUser", method = RequestMethod.POST)
	public String registerUser(@ModelAttribute("user") User user, ModelMap model) {
		int result = service.save(user);
		model.addAttribute("result", "User registered with id: " + result);
		return "userReg";
	}

	@RequestMapping(value = "showUsers")
	public String showUsers(ModelMap model) {
		List<User> users = service.loadUsers();
		model.addAttribute("users", users);
		return "displayUsers";
	}

}