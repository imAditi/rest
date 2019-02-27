package com.yash.blogapp01.test;

import com.yash.blogapp01.dao.UserDAO;
import com.yash.blogapp01.daoimpl.UserDAOImpl;

public class UserDAOImplDeleteOperationTest {
public static void main(String[] args) {
	UserDAO userDAO = new UserDAOImpl();
	userDAO.delete(6);
}
}
