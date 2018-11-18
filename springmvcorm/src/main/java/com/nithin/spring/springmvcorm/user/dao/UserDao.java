package com.nithin.spring.springmvcorm.user.dao;

import java.util.List;

import com.nithin.spring.springmvcorm.user.entities.User;

public interface UserDao {

	int create(User user);
	List<User> loadAllUsers();
	
}