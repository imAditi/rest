package com.yash.blogapp01.test;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.yash.blogapp01.dao.UserDAO;
import com.yash.blogapp01.daoimpl.UserDAOImpl;
import com.yash.blogapp01.domain.User;
import com.yash.blogapp01.util.DateUtil;


public class UserDAOImplInsertoperationTest {
	public static void main(String[] args) {
	
		UserDAO userDAO = new UserDAOImpl();
		User user = new User();
		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		String created_at = new DateUtil().convertDateToString(formatter,new Date());
		String updated_at = new DateUtil().convertDateToString(formatter,new Date());
		user.setFirstName("anurag");
		user.setLastName("mahajan");
		user.setContact(966);
		user.setEmail("anurag.mahajan");
		user.setPassword("123");
		user.setCreated_at(created_at);
		user.setUpdated_at(updated_at);
		userDAO.insert(user);
		System.out.println("user created.");
		
		
		
		
	}
}
