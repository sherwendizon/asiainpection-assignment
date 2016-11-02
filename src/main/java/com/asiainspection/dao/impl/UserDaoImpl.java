package com.asiainspection.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.asiainspection.dao.UserDao;
import com.asiainspection.mapper.Mapper;

public class UserDaoImpl implements UserDao{
	
	@Autowired
	private Mapper mapper;

	public int getUserIdByUsernameAndPassword(String username, String password) {
		return mapper.getUserIdByUsernameAndPassword(username, password);
	}

	public String getUserAuthorityByUsernameAndPassword(String username, String password) {
		String auth = "admin";
		if(!username.equals("superuser")) {
			auth = "employee";
		}
		return auth;
	}

}
