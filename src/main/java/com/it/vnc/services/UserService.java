package com.it.vnc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.it.vnc.dao.UserDao;
import com.it.vnc.models.User;

@Service
public class UserService {

@Autowired UserDao dao;
	public void save(User user) {
		dao.save(user);
	
	}
}
