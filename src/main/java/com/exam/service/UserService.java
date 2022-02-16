package com.exam.service;

import java.util.List;
import java.util.Set;

import com.exam.model.User;
import com.exam.model.UserRole;

public interface UserService {
	
	//Creating User
	public User createUser(User user, Set<UserRole> userRoles) throws Exception;
	
	//Getting user by username
	public User getUser(String username);
	
	public List<User> getAllUsers();
	
	//Delete User by id
	public void deleteUser(Long userId);
}
