package com.q.dao;

import org.springframework.stereotype.Repository;

import com.q.model.User;

@Repository
public class UserDao {
	
	public User init(){
		User user = new User();
		user.setId(2l);
		user.setName("Qloud");
		user.setAge(22);
		return user;
	}
}
