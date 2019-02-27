package com.yash.blogapp01.service;

import java.util.List;

import com.yash.blogapp01.domain.User;

public interface UserService {
	
	public static int ADMIN = 1;
	public static int AUTHOR = 2;
	public static int REGISTERED = 3;
	
	/**
	 * This method will create a new user.
	 * @param user object of User
	 */
	User create(User user);
	
	/**
	 * This method will delete the user by id.
	 * @param id of user
	 */
	User delete(int id);
	
	/**
	 * This method will edit the user.
	 * @param user object of User
	 */
	User update(User user);
	
	
	/**
	 * This will show the list of users.
	 * @return list of users.
	 */
	List<User> listUsers();

}
