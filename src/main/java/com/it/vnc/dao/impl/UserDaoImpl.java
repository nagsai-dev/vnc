package com.it.vnc.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.it.vnc.dao.UserDao;
import com.it.vnc.models.User;
@Repository
public class UserDaoImpl implements UserDao{
@Autowired JdbcTemplate jdbcTemp;
	@Override
	public void save(User user) {

		String sqlQuery= "insert into vnc"+"(name,password)"+"VALUES"+ "(?,?)";
		jdbcTemp.update(sqlQuery,user.getName(),user.getPassword());
		
	}

}
