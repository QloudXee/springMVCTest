package com.q.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.q.dao.UserDao;
import com.q.model.User;

@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;

	public User init(){
		return userDao.init();
	}
}
