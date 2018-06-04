package com.example.demo.service;

import java.util.List;
import com.example.demo.model.User;

public interface UserService {

	public List<User> findAll();
	
	public List<User> find(String userId);
	
	public boolean add(User user);
	
	public boolean delete(Long userId);
	
	public User updateUser(Long userId, User updateUserDetails);
	
	public User updateAdmin(Long userId, User updateUserDetails);
}
