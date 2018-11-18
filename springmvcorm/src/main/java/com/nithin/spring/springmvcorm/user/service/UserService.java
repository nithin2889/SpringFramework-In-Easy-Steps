package com.nithin.spring.springmvcorm.user.service;

import java.util.List;

import com.nithin.spring.springmvcorm.user.entities.User;

public interface UserService {

	int save(User user);
	List<User> loadUsers();
	
}