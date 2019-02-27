package com.yash.blogapp01.dao;

import java.util.List;

import com.yash.blogapp01.domain.User;

/**
 * This is used to perform all CRUD operations related to User.
 * @author aditi.jain
 *
 */
public interface UserDAO {

	public List<User> list();
	//public User list(int id );
	public User insert(User user);
	public User update(User user);
	public User delete(int  id);

}
