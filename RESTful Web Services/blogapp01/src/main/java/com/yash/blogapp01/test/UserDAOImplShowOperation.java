package com.yash.blogapp01.test;

import com.yash.blogapp01.dao.UserDAO;
import com.yash.blogapp01.daoimpl.UserDAOImpl;
import com.yash.blogapp01.domain.User;

public class UserDAOImplShowOperation {

	public static void main(String[] args) {
		UserDAO userDAO = new UserDAOImpl();
		User user = new User();
		user.setFirstName("dev yadav");
		user.setLastName("dev ya");
		user.setContact(25558422);
		user.setId(2);
		userDAO.update(user);
		System.out.println("update done");
	}

}
