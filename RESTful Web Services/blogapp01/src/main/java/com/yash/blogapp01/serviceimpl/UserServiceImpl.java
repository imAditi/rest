package com.yash.blogapp01.serviceimpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.yash.blogapp01.dao.UserDAO;
import com.yash.blogapp01.daoimpl.UserDAOImpl;
import com.yash.blogapp01.domain.User;
import com.yash.blogapp01.service.UserService;
import com.yash.blogapp01.util.JNDIConnectionPooling;
import com.yash.blogapp01.util.SimpleJDBCUtil;

public class UserServiceImpl extends SimpleJDBCUtil implements UserService {
	 
	UserDAO userDAO = null;
	public UserServiceImpl() {
		userDAO = new UserDAOImpl();
	}
	@Override
	public User create(User user) {
		return userDAO.insert(user);
	}

	@Override
	public User delete(int id) {
		return userDAO.delete(id);
	}

	@Override
	public User update(User user) {
		return userDAO.update(user);
	}


	@Override
	public List<User> listUsers() {
		return userDAO.list();
	}
	
	
}
