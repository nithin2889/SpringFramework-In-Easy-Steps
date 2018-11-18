package com.nithin.spring.springmvcorm.user.service.impl;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nithin.spring.springmvcorm.user.dao.UserDao;
import com.nithin.spring.springmvcorm.user.entities.User;
import com.nithin.spring.springmvcorm.user.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao dao;

	public UserDao getDao() {
		return dao;
	}

	public void setDao(UserDao dao) {
		this.dao = dao;
	}

	@Transactional
	public int save(User user) {
		return dao.create(user);
	}

	public List<User> loadUsers() {
		List<User> users = dao.loadAllUsers();
		Collections.sort(users);
		return users;
	}
	
}